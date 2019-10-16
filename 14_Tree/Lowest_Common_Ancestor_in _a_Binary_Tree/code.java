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
class Lowest_Common_Ancestor
{
    // driver function to test the above functions
    public static void main(String args[])
    {
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
                char lr = sc.next().charAt(0);
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
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			
            Tree g = new Tree();
            Node k = g.lca(root,a,b);
			System.out.println(k.data);
			//System.out.println();
            t--;
			
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
}*/
class Tree
{
/* If n1 and n2 are present, return reference
   to LCA. If both are not present, return 
   null,. Else if left subtree contains any 
   of them return pointer to left.*/
	Node lca(Node root, int n1,int n2)
	{
	    Queue<Node> qu = new LinkedList<Node>();
	    qu.add(root);
	    Node fin = null;
	    while(qu.isEmpty() == false ){
	        
	        Node p = qu.poll();
	        
	        if(find(p,n1) && find(p,n2))
	            fin = p;
	        
	        if(p.left != null)
	            qu.add(p.left);
	        
	        if(p.right != null)
	            qu.add(p.right);
	    }
	    
	   
		return fin;
	}
	
	
	boolean find(Node r1, int v){
	    
	    if(r1 == null)
	        return false;
	        
	    if(v == r1.data || find(r1.left,v) || find(r1.right,v)){
	        return true;
	    }else{
	        return false;
	    }
	    
	}
}
