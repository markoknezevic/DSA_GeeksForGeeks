{
import java.util.*;
import java.lang.*;
import java.io.*;
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
class BST_Add_Nodes
{
    Node root;
    void inorder(Node node)
    {
        if(node==null)
            return ;
        else
            inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0)
        {
            int n = sc.nextInt();
            BST_Add_Nodes tree = new BST_Add_Nodes();
            BST g = new BST();
            Node root = null;
            for(int i=0; i<n; i++)
            {
                int a = sc.nextInt();
                root = g.insert(root, a);
            }
            tree.inorder(root);
            System.out.println();
            t--;
        }
    }
}

}
/*This is a function problem.You only need to complete the function given below*/
/* Structure of BST node
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
class BST
{
    /* This function should insert a new node with given data and
      return root of the modified tree  */
    Node insert(Node root, int data)
    {
         if(root == null)
            return new Node(data);
            
        if(root.data > data)
            root.left = insert(root.left,data);
            
        if(root.data < data)
            root.right = insert(root.right,data);
        
        return root;
      
    }
}
