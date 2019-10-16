{
import java.util.*;
class Node
{
    int data;
    Node left, right;
    
    Node(int key)
    {
        data = key;
        left = right = null;
    }
}
class SumProperty
{
     public static void insert(Node root,int a,int a1,char lr){
        if(root==null){
            return;
        }
        if(root.data==a){
            switch(lr){
                case 'L':root.left=new Node(a1);
                break;
                case 'R':root.right=new Node(a1);
                break;
            }
            return;
        }
        insert(root.left,a,a1,lr);
        insert(root.right,a,a1,lr);
    }
    
    public static void main (String[] args) 
    {
         Scanner sc=new Scanner(System.in);
          int t = sc.nextInt();
          
           while(t-->0){
            int n = sc.nextInt();
            if(n==0)
            {
                System.out.println(0);
                continue;
            }
            Node root = null;
            for(int i=0;i<n;i++){
                
                int a=sc.nextInt();
                int a1=sc.nextInt();
                
                char lr=sc.next().charAt(0);
                
                if(i==0){
                    
                    root=new Node(a);
                    
                    switch(lr)
                    {
                        
                        case 'L':root.left=new Node(a1);
                        break;
                        case 'R':root.right=new Node(a1);
                        break;
                    }
                }
                else{
                    insert(root,a,a1,lr);
                }
            }
            
            Tree g=new Tree();
            System.out.println(g.isSumProperty(root));
            
        }
    }
}
}
/*This is a function problem.You only need to complete the function given below*/
/*Complete the function below
Node is as follows:
class Node{
	int data;
	Node left,right;
	
	Node(int key)
	{
	    data = key;
	    left = right = null;
	}
}
*/
class Tree
{
    public static int isSumProperty(Node node)
    {
        if(node == null)
            return 1;
           
        if(node.left == null && node.right == null)
            return 1;    
            
        int sum=0;
        
        if(node.left != null)
            sum+=node.left.data;
            
        if(node.right != null)
            sum+=node.right.data;
        
        if(node.data == sum && isSumProperty(node.left) == 1 && isSumProperty(node.right) == 1){
            return 1;
        }else{
            return 0;
        }
        
    }
}