{
import java.util.*;
import java.util.*;
import java.io.*;
import java.lang.*;
class Node
{
    int data, hd;
    Node left, right;
    public Node(int data)
    {
        this.data = data;
        left = right = null;
    }
}
class Main
{
    public static void main(String args[])throws IOException
    {
// 		Scanner sc=new Scanner(System.in);
// 		int tc=sc.nextInt();
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(read.readLine());
        
		while(tc-->0){
		    
			int n = Integer.parseInt(read.readLine());
			Node root = null;
			if(n==0){
				System.out.println();
				continue;
			}
			int k = 0;
			String str[] = read.readLine().trim().replace("  ", " ").split(" ");
			
			for(k = 0; k < n*3;){
			    
				
				int a1 = Integer.parseInt(str[k++]);
				int a2 = Integer.parseInt(str[k++]);
				
				char ch = str[k++].charAt(0);
				if(root==null){
					root=new Node(a1);
					switch(ch){
						case 'L':root.left=new Node(a2);
						break;
						case 'R':root.right=new Node(a2);
						break;
					}
				}
				else{
					insert(root,a1,a2,ch);
				}
			}
			Tree g = new Tree();
			g.printTopView(root);	
			System.out.println();
		}
    }
    
	public static void insert(Node root,int a1,int a2,char ch){
		if(root==null)
			return;
		if(root.data==a1){
			switch(ch){
						case 'L':root.left=new Node(a2);
						break;
						case 'R':root.right=new Node(a2);
						break;
					}
		}
		else{
			insert(root.left,a1,a2,ch);
			insert(root.right,a1,a2,ch);
		}
	}
}

}
/*This is a function problem.You only need to complete the function given below*/
/*Complete the function below
Node is as follows
class TreeNode
{
    int key;
    TreeNode left, right;
    public TreeNode(int key)
    {
        this.key = key;
        left = right = null;
    }
}*/
class Tree
{
    public void printTopView(Node root)
    {
        if(root == null)
            return ;
            
        System.out.print(root.data+" ");
        
        fun(root.left,root.right);
        
        return;
    }
    
    void fun(Node root1,Node root2)
    {
        if(root1 == null && root2 == null)
            return ;
            
        if(root1 == null){
            
            ri(root2);    
            
        }else if(root2 == null){
            
            le(root1);   
            
        }else{
            
            System.out.print(root1.data+" ");
            System.out.print(root2.data+" ");
            fun(root1.left,root2.right);
        }
        
    }
    
    
    void le(Node root1)
    {
        if(root1 == null)
            return ;
            
        System.out.print(root1.data+" ");
        le(root1.left);
        
    }
    
    void ri(Node root1)
    {
        if(root1 == null)
            return ;
            
        System.out.print(root1.data+" ");
        le(root1.right);
        
    }
    
    
}
