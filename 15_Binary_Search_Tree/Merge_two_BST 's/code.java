{

import java.util.Stack;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;
class Node{
	int data;
	Node left, right;
	Node(int d){
		data=d;
		left=right=null;
	}
}
class Merge{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
			int x = sc.nextInt();
			int y = sc.nextInt();
			Node fhead = null;
			Node shead = null;
			for(int i = 0; i < x; i++)
			{
				if(fhead==null)
					fhead = new Node(sc.nextInt());
				else{
					insert(fhead,sc.nextInt());
				}
			}
			for(int i = 0; i < y; i++)
			{
				if(shead==null)
					shead = new Node(sc.nextInt());
				else{
					insert(shead,sc.nextInt());
				}
			}
			GfG g = new GfG();
			g.merge(fhead , shead);
			System.out.println();
		}
	}
	public static Node insert(Node head, int a){
		if(head==null)
			return new Node(a);
		if(head.data>a)
			head.left=insert(head.left,a);
		if(head.data<a)
			head.right=insert(head.right,a);
		return head;
	}
}
}
/*This is a function problem.You only need to complete the function given below*/
/*Complete the function below
Node is as follows:
class Node{
	int data;
	Node left, right;
	Node(int d){
		data=d;
		left=right=null;
	}
}*/
class GfG
{
    static ArrayList<Integer> a = new ArrayList<Integer>();
    static ArrayList<Integer> b = new ArrayList<Integer>();
	public static void merge(Node root1 , Node root2)
    {
        a.clear();
        b.clear();
       pom(root1);
       pom2(root2);
       
       int i=0,j=0;
      while(i < a.size() && j < b.size()){
          if(a.get(i)<b.get(j)){
              System.out.print(a.get(i)+" ");
              i++;
          }else{
              System.out.print(b.get(j)+" ");
              j++;
          }
      }
      
      while(i < a.size()){
          System.out.print(a.get(i)+" ");
          i++;
      }
      
      while(j < b.size()){
          System.out.print(b.get(j)+" ");
          j++;
      }
       
       
    }
     static void pom(Node root){
        if(root == null)
            return ;
            
        pom(root.left);
        a.add(root.data);
        pom(root.right);
        
    }
    
    
    static void pom2(Node root2){
        if(root2 == null)
            return ;
            
        pom2(root2.left);
        b.add(root2.data);
        pom2(root2.right);
        
    }
   
    
}
