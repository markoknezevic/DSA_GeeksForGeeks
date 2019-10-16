{
//Initial Template for Java
import java.io.*;
import java.lang.*;
import java.util.*;
class Node {
    int data;
    Node left, right;
    Node(int key){
        this.data = key;
        this.left = this.right = null;
    }
}
class ceilInBST { 
    static Node insertInBST(Node root, int key) { 
        if (root == null) return new Node(key); 
	    if (key < root.data) root.left = insertInBST(root.left, key); 
	    else root.right = insertInBST(root.right, key); 
	    return root; 
    }
    
    public static void main (String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    String inputLine[] = br.readLine().trim().split(" ");
		    int n = Integer.parseInt(inputLine[0]);
		    Node root = null;
		    inputLine = br.readLine().trim().split(" ");
		    root = insertInBST(root, Integer.parseInt(inputLine[0]));
		    for(int i=1; i<n; i++){
		        insertInBST(root, Integer.parseInt(inputLine[i]));
		    }
		    int k = Integer.parseInt(br.readLine().trim());
		    GfG g = new GfG();
		    System.out.println(g.findCeil(root, k));
		}
	}
}

}
/*This is a function problem.You only need to complete the function given below*/
//User function Template for Java
/*
class Node {
    int data;
    Node left, right;
    Node(int key){
        this.data = key;
        this.left = this.right = null;
    }
}
*/
class GfG {
    int findCeil(Node root, int key) { 
           
        if(root == null)
            return -1;
            
        if(root.data >= key)
            return key;
            
        return Math.max(findCeil(root.left,key),findCeil(root.right,key));
    } 
}
