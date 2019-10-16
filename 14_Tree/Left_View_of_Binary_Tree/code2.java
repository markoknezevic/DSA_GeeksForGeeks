{
import java.util.Scanner;
import java.lang.Integer;
import java.util.HashMap;
//import java.lang.Math;
import java.io.*;
import java.util.*;
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
class Tree_Left_View
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
		//Node root=null;
        while (t > 0)
        {
            HashMap<Integer, Node> m = new HashMap<Integer, Node> ();
            int n = sc.nextInt();
            Node root=null;
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
            Tree g = new Tree();
			g.leftView(root);
			System.out.println();
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
    void leftView(Node root)
    {
        
        Queue<Node> qu = new LinkedList<Node>();
        
        qu.add(root);
        qu.add(null);
        boolean bo = true;
        while(qu.isEmpty() == false){
            
            Node p = qu.poll();
            
            if(p == null){
                if(qu.isEmpty() == false){
                    qu.add(null);
                    bo = true;
                }
            }else{
                if(bo){
                    System.out.print(p.data+" ");
                    bo = false;
                }
                
                
                if(p.left != null)
                    qu.add(p.left);
                    
                if(p.right != null)
                    qu.add(p.right);
                    
                
            }
            
        }
    }
}