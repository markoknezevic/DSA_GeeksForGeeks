{
//Initial Template for Java
import java.util.*;
import java.io.*;
import java.lang.*;
class Node
{
    int data;
    Node next;
    
    Node(int data)
    {
        this.data = data;
        next = null;
    }
}
class LinkedList
{
    static  Node head;  
    static  Node lastNode;
    
    public static void addToTheLast(Node node)
    {
        if (head == null)
        {
            head = node;
            lastNode = node;
        }
        else
        {
            Node temp = head;
            lastNode.next = node;
            lastNode = node;
        }
    }
    
    public static void main(String args[])
    {
        Scanner sc=  new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n, K;
            n = sc.nextInt();
            K = sc.nextInt();
            
            Node head = null;
            int val = sc.nextInt();
            head = new Node(val);
            addToTheLast(head);
            
            for(int i = 1; i< n; i++)
            {
                val = sc.nextInt();
                addToTheLast(new Node(val));
            }
            
            Node before[] = new Node[n];
            addressstore(before, head);
            GFG obj = new GFG();
            
            head = obj.swapkthnode(head, n, K);
        
           Node after[] = new Node[n];
          addressstore(after, head);
        
        if(check(before, after, n, K) == true)
            System.out.println("1");
        else
            System.out.println("0");
        
        }
    }
    
    static boolean check(Node before[], Node after[], int num, int K)
    {
          if(K > num)
           return true;
           
           return (before[K-1] == after[num - K]) && (before[num-K] == after[K-1]);
              
       
    }
    
    static void addressstore(Node arr[], Node head)
  {
      Node temp = head;
      int i = 0;
      while(temp != null){
        arr[i] = temp;
        i++;
        temp = temp.next;
    }
}
    
}
}
/*This is a function problem.You only need to complete the function given below*/
//User function Template for Java
/* Linked List Node class
   class Node  {
     int data;
     Node next;
     Node(int data)
     {
         this.data = data;
         next = null;
     }
  }
*/
class GFG
{
    // Should swap Kth node from beginning and 
    // Kth node from end in list and return new head.
    Node swapkthnode(Node head, int num, int K)
    {
        if(num<K)
            return head;
            
        if (2*K - 1 == num) 
            return head; 
            
        int i=1;
        Node first = head;
        Node firstprev = null;
        while(i<K){
            
            firstprev=first;
            first=first.next;
            i++;
        }
        
        i=1;
        Node sec = head;
        Node secprev = null;
        
        
        while(i<(num-K+1)){
            secprev=sec;
            sec=sec.next;
            i++;
        }
        
        if(first == sec)
            return head;
        
        if (firstprev != null) 
            firstprev.next = sec; 
  
        
        if (secprev != null) 
            secprev.next = first;
            
            
        Node temp = first.next; 
        first.next = sec.next; 
        sec.next = temp;
        

         if (K == 1) 
            head = sec; 
  
        if (K == num) 
            head = first; 
            
      /*  Node d=head;
        while(d != null){
            System.out.println(d.data);
            d=d.next;
        }
        */    
        return head;
    }
}
