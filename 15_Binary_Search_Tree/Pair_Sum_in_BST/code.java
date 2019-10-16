{
// Initial Template for Java
import java.util.*;
import java.io.*;
import java.lang.*;
class Node {
    int data;
    Node left, right;
    Node(int data) {
        this.data = data;
        left = right = null;
    }
}
class PairSum {
    static Node insert(Node node, int data) {
        if (node == null) return new Node(data);
        if (node.data > data) node.left = insert(node.left, data);
        if (node.data < data) node.right = insert(node.right, data);
        return node;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int temp = 0;
            Node root = null;
            for (int i = 0; i < n; i++) {
                temp = sc.nextInt();
                root = insert(root, temp);
            }
            temp = sc.nextInt();
            if (new GFG().findPair(root, temp) == true)
                System.out.println("1");
            else
                System.out.println("0");
        }
    }
}

}
/*This is a function problem.You only need to complete the function given below*/
// User function Template for Java
/*/class Node
{
    int data;
    Node left, right;
    Node(int data)
    {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}*/
class GFG {
    // This function should return true
    // if there is a pair in given BST with
    // given sum.
    static ArrayList<Integer> arr = new ArrayList<Integer>();
    
    static boolean findPair(Node root, int sum) {
        arr.clear();
        toArr(root);
       
        
        for(int i=0;i<arr.size();i++)
            for(int j=i+1;j<arr.size();j++){
                if(arr.get(i)+arr.get(j) == sum)
                    return true;
                
                if(arr.get(i)+arr.get(j) >sum)
                    break;
            }
            return false;
        
    }
    
    static void toArr(Node root){
        
        if(root == null)
            return;
            
        toArr(root.left);
        arr.add(root.data);
        toArr(root.right);
        
    }
}
