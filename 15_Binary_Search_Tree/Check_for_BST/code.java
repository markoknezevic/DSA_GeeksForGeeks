{
// INITIAL CODE
import java.util.Scanner;
import java.lang.*;
import java.io.*;
import java.util.*;
import java.lang.Integer;
import java.util.HashMap;
// A Binary Search Tree node
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
class Check_BST
{
    // driver function to test the above functions
    public static void main(String args[])
    {
        // Input the number of test cases you want to run
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
		Check_BST ob = new Check_BST();
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
			
			GfG g = new GfG();
            System.out.println(g.isBST(root));
			//ob.printInorder(root);
            t--;
			
        }
    }
}

}
/*This is a function problem.You only need to complete the function given below*/
/*  A Binary Search Tree node
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
class GfG
{
    static ArrayList<Integer> a = new ArrayList<Integer>();
    
    int isBST(Node root)  
    {
        a.clear();
        pom(root);
            
        for(int i=1;i<a.size();i++){
            if(a.get(i-1)>a.get(i))
                return 0;
        }
        return 1;
    }
    void pom(Node root){
        if(root == null)
            return ;
            
        pom(root.left);
        a.add(root.data);
        pom(root.right);
        
    }
}
