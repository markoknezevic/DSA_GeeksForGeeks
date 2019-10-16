{
import java.util.Scanner;
import java.util.*;
import java.lang.*;
import java.io.*;
class Node
{
	int data;
	Node left,right;
	
	Node(int d)
	{
		data = d;
		left = right = null;		
	}
}
class Height_Balanced_Tree
{
    public static void main(String args[])
    {
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
				
                //  cout << n1 << " " << n2 << " " << (char)lr << endl;
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
			
			if(g.isBalanced(root) == true)
			System.out.println(1);
			else 
			System.out.println(0);
			t--;
        }
    }
}

}
/*This is a function problem.You only need to complete the function given below*/
/* A binary tree node class
class Node
{
	int data;
	Node left,right;
	
	Node(int d)
	{
		data = d;
		left = right = null;		
	}
} */
class Tree
{
    
     /* This function should return tree if passed  tree 
     is balanced, else false. */
    boolean isBalanced(Node root)
    {
        if(root == null)
            return true;
        
      
        
        
        int max = he(root.left);
        int min = he(root.right);
        
        if((Math.abs(max - min) <= 1) && isBalanced(root.left) && isBalanced(root.right) )
	        return true;
	    
	        return false;
    }
    
    int he(Node root){
        if(root == null)
            return 0;
    
        
        int l = he(root.left);
        int r = he(root.right);
     return Math.max(l,r)+1;   
    }
    
    
     
}
