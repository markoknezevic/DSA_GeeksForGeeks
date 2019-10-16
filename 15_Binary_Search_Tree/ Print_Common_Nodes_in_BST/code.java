{
import java.lang.Math;
import java.util.*;
class Node{
	int data;
	Node left,right;
	Node (int d){
		data=d;
		left=right=null;
	}
}
class PrintCommon{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n1=sc.nextInt();
			Node root1=null;
			Node root2=null;
			for(int i=0;i<n1;i++){
				int a=sc.nextInt();
				if(root1==null)
					root1=new Node(a);
				else{
					insert(root1,a);
				}
			}
			int n2=sc.nextInt();
			for(int i=0;i<n2;i++){
				int a=sc.nextInt();
				if(root2==null)
					root2=new Node(a);
				else{
					insert(root2,a);
				}
			}
			BST g=new BST();
			g.printCommon(root1,root2);
			System.out.println();
		}
	}
	public static Node insert(Node root,int a){
		if(root==null)
			return new Node(a);
		if(root.data>a){
			root.left=insert(root.left,a);
		}
		if(root.data<a)
			root.right=insert(root.right,a);
		return root;
	}
}

}
/*This is a function problem.You only need to complete the function given below*/
/*Complete the function below
Node is as follows:
class Node{
	int data;
	Node left,right;
	Node (int d){
		data=d;
		left=right=null;
	}
}
*/
class BST
{
    static ArrayList<Integer> arr1 = new ArrayList<Integer>();
    static ArrayList<Integer> arr2 = new ArrayList<Integer>();
	public void printCommon(Node root1,Node root2)
         {
            arr1.clear();
            arr2.clear();
           toArr(root1);
           toArr2(root2);
          
           
           for(int i =0 ;i<arr1.size();i++){
               if(arr2.contains(arr1.get(i)))
                System.out.print(arr1.get(i)+" ");
           }
         }
         
    public static void toArr(Node root1){
        
        if(root1 == null)
                return;
            
            toArr(root1.left);
            arr1.add(root1.data);
            toArr(root1.right);
        
    }
    public static void toArr2(Node root1){
        
        if(root1 == null)
                return;
                
            toArr2(root1.left);
            arr2.add(root1.data);
            toArr2(root1.right);
        
    }
    
    
}
