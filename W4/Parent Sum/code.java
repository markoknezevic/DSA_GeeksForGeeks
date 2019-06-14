{
//Initial Template for Java
import java.util.*;
import java.lang.*;
import java.io.*;
class Node
{
    long data;
    Node next;
    Node(long data)
    {
        this.data = data;
        next = null;
    }
}
class parentSum
{
    static Node head = null;
    
    static Node addNode(Node head, long x)
    {
        if(head == null)
        head = new Node(x);
        else
        head.next=addNode(head.next, x);
        
        return head;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
              Node head = null;
	    
	            int n =sc.nextInt();
	            
	        for(int i=0;i<n;i++)
	        {
	            long x = sc.nextLong();
	            
	            head=addNode(head,x);
	        }
	        
	        GFG obj = new GFG();
	        
	        obj.sumFun(head);
	        printList(head);
        }
    }
    
    static void printList(Node head)
    {
           while(head != null)
          {
              System.out.print(head.data + " ");
             head = head.next;
          }
        
         System.out.println();
         
    }
    
}
}
/*This is a function problem.You only need to complete the function given below*/
//User function Template for Java
/*
 class Node
 {
     long data;
     Node next;
     
     Node(long data)
     {
         this.data = data;
         next = null;
     }
 }
*/
class GFG
{
    static void sumFun(Node head)
    {
        Node pom = head;
        Node pom2 = head;
        long sum = 0;
        while(pom!=null){
            sum+=pom.data;
            pom=pom.next;
        }
        long val=0;
        while(pom2!=null){
            val=pom2.data;
            pom2.data=sum;
            sum-=val;
            pom2=pom2.next;
        }
    }
    
}