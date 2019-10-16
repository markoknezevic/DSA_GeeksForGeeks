{
/*package whatever //do not write package name here */
import java.io.*;
import java.util.*;
class Node
{
    int data;
    Node left;
    Node right;
    
    Node(int data){
        this.data = data;
        this.left = this.right = null;
    }
}
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int testcases=sc.nextInt();
		while(testcases-->0)
		{
		    Node root=null;
		    int sizeOfArray=sc.nextInt();
		    int arr[]=new int[sizeOfArray];
		    for(int i=0;i<sizeOfArray;i++)
		    {
		        int x=sc.nextInt();
		        arr[i]=x;
		    }
		   
		    for(int i=0;i<sizeOfArray;i++)
		    {
		        root=Geeks.newNode(root,arr[i]);
		    }
		    int l,h;
		    l=sc.nextInt();
		    h=sc.nextInt();
		    System.out.println(Geeks.getCountOfNode(root,l,h));
		
		}
	}
}
class Geeks
{
    public static Node createNewNode(int value)
    {
        Node temp=new Node(value);
        
        return temp;
    }
    static public Node newNode(Node root,int data)
    {
        if(root==null)
        root=createNewNode(data);
        else if(data<root.data)
        root.left=newNode(root.left,data);
        else
        root.right=newNode(root.right,data);
        
        return root;
    }
  
    //Position this line where user code will be pasted.
    
}

}
/*This is a function problem.You only need to complete the function given below*/
// A Binary Search Tree node
/*
class Node
{
    int data;
    Node left;
    Node right;
    
    Node(int data){
        this.data = data;
        this.left = this.right = null;
    }
}
*/
//Complete this function
static int c =0;
public static int getCountOfNode(Node root,int l, int h)
{
    c=0;
    co(root,l,h);
   
    return c;
    
}
static void co(Node root,int l, int h){
    if(root == null)
        return ;
    co(root.left,l,h);    
    
    if(root.data >= l && root.data <= h)
        c++;
    co(root.right,l,h);
}
