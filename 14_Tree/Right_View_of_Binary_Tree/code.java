{

import java.util.*;
class Node
{
    int data;
    Node left, right;
    public Node(int data)
    {
        this.data = data;
         left = right = null;
    }
}
class RightViewBT{
	public static void insert(Node root,int n1,int n2,char lr){
		if(root==null)
			return;
		if(root.data==n1){
		switch(lr)
					{
						case 'L':
						root.left=new Node(n2);
						break;
						case 'R':
						root.right=new Node(n2);
						break;
					}
		}
		else{
			insert(root.left,n1,n2,lr);
			insert(root.right,n1,n2,lr);
		}
	}
	public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{	int n=Integer.parseInt(sc.next());
			Node root=null;
			if(n==1)
			{
				int a=sc.nextInt();
				System.out.println(a);
				continue;
			}
			else
			{	
		while(n-->0){
				int n1=Integer.parseInt(sc.next());
				int n2=Integer.parseInt(sc.next());
				char lr=sc.next().charAt(0);
				if(root==null)
				{
					root=new Node(n1);
					switch(lr)
					{
						case 'L':
						root.left=new Node(n2);
						break;
						case 'R':
						root.right=new Node(n2);
						break;
					}
				}
				else{
					insert(root,n1,n2,lr);
				}
			}
			}
			Tree tree = new Tree();
            tree.rightView(root);
		    System.out.println();
			
    }
	}
}

}
/*This is a function problem.You only need to complete the function given below*/

/*Complete The Function Provided
Given Below is The Node Of Tree
class Node
{
    int data;
    Node left, right;
    public Node(int data)
    {
        this.data = data;
         left = right = null;
    }
}*/
class Tree{
    void rightView(Node node) {
           Queue<Node> qu = new LinkedList<Node>();
        
        qu.add(node);
        int width =0;
        while(qu.isEmpty() == false){
            
            int count = qu.size();
            width = Math.max(width,count);
            Node cur = null;
            for(int i=0;i<count;i++){
                cur = qu.poll();

                if(cur.left != null)
                    qu.add(cur.left);
                    
                if(cur.right != null)
                    qu.add(cur.right);
                    
                
                   
                    
            }
            System.out.print(cur.data+" ");
            
        }
    }
}
