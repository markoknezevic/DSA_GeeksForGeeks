{
// INITIAL CODE
import java.util.*;
import java.lang.*;
import java.io.*;
// A Binary Tree node
class Node
{
    int data;
    Node left, right;
    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
class Maximum_Width_Of_Tree
{
	void inorder(Node node)
	{
		if(node==null)
			return ;
		else
			inorder(node.left);
			System.out.print(node.data + " ");
			inorder(node.right);
			
					
	}
	
    // driver function to test the above functions
    public static void main(String args[])
    {
		//Maximum_Width_Of_Trees CLN = new Maximum_Width_Of_Tree();
		//Index index_obj = new Index();
        // Input the number of test cases you want to run
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0)
        {
            HashMap<Integer, Node> m = new HashMap<Integer, Node> ();
            int n = sc.nextInt();
            Node root = null;
            while (n > 0)
            {	
			
				int n1 = sc.nextInt();
                int n2 = sc.nextInt();
				char lr= sc.next().charAt(0);
				
                Node parent = m.get(n1);
                if (parent == null)
                {
                    parent = new Node(n1);
                    m.put(n1, parent);
                    if (root == null)
                        root = parent;
                }
                Node child = new Node(n2);
                if (lr == 'L')
                    parent.left = child;
                else
                    parent.right = child;
                m.put(n2, child);
                n--;
            }
			
            Tree g = new Tree();
			int res = g.getMaxWidth(root);
			System.out.println(res);
			//CLN.inorder(root);
			 t--;
			// System.out.println();
        }
    }
}
}
/*This is a function problem.You only need to complete the function given below*/
/* A Binary Tree node
class Node
{
    int data;
    Node left, right;
    Node(int item)
    {
        data = item;
        left = right = null;
    }
} */
class Tree
{
    // /* Function to get the maximum width of a binary tree*/
    int getMaxWidth(Node root)
    {
         Queue<Node> qu = new LinkedList<Node>();
        
        qu.add(root);
        int width =0;
        while(qu.isEmpty() == false){
            
            int count = qu.size();
            width = Math.max(width,count);
            
            for(int i=0;i<count;i++){
                Node cur = qu.poll();

                if(cur.left != null)
                    qu.add(cur.left);
                    
                if(cur.right != null)
                    qu.add(cur.right);
                    
            }
            
        }
        return width;
    }		
}