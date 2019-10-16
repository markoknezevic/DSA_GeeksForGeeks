{
//Initial Template for Java
/*package whatever //do not write package name here */
import java.io.*;
import java.util.*;
class Node {
    int data;
    Node left, right;
    
    public Node(int data){
        this.data = data;
    }
}
public class Main {
    
	public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            GFG obj = new GFG();
            Node tree = obj.constructBST(arr);
            preorder(tree);
            System.out.println();
        }
	}
	
	 public static void preorder(Node root){
        if(root == null){
            return;
        }
        
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
}

}
/*This is a function problem.You only need to complete the function given below*/
//User function Template for Java
/*
The structure of the Node is as follows:
class Node {
    int data;
    Node left, right;
    
    public Node(int data){
        this.data = data;
    }
}
*/
class GFG {
    
    public Node constructBST(int[] arr){
        Node fin = null;
        
        
        for(Integer i : arr){
            
           fin= make(fin,i);
            
        }
        return fin;
    }
    
    Node make(Node root,int data){
        
        if(root == null){
                root = new Node(data);
                
            }else{
                if(root.data > data){
                   root.left = make(root.left,data);
                }else{
                    root.right = make(root.right,data);
                }
            }
        return root;
    }
}