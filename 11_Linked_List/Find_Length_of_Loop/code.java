{
import java.util.*;
import java.util.TreeMap;
import java.util.Scanner;
import java.util.Iterator;
    class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
		
public class GFG2
{
    Node head;  
	
	/* Function to print linked list */
    void printList(Node head)
    {
        Node temp = head;
        while (temp != null)
        {
           System.out.print(temp.data+" ");
           temp = temp.next;
        }  
        System.out.println();
    }
	
 
    /* Inserts a new Node at front of the list. */
    public void addToTheLast(Node node) 
	{
		if (head == null) 
		{
			head = node;
		} else 
		{
		   Node temp = head;
		   while (temp.next != null)
		   temp = temp.next;
		   temp.next = node;
		}
    }
	  
     /* Drier program to test above functions */
    public static void main(String args[])
    {
       
         
        /* Constructed Linked List is 1->2->3->4->5->6->
           7->8->8->9->null */
         Scanner sc = new Scanner(System.in);
		 int t=sc.nextInt();
		 
		 while(t-->0)
         {
			int n = sc.nextInt();
            GFG2 llist1 = new GFG2(); 
			int a1=sc.nextInt();
			Node head= new Node(a1);
            llist1.addToTheLast(head);
            for (int i = 1; i < n; i++) 
			{
				int a = sc.nextInt(); 
				llist1.addToTheLast(new Node(a));
			}
		    llist1.head= head;
		    Node temp=null;Node te=null;
		    int c = sc.nextInt();
		    if(c>0){
            temp=head;
            te = head;
            while(te.next!=null)te=te.next;
            while(c-->0)temp=temp.next;
            te.next=temp;
            // s->next=temp;
        }
			Loop obj=new Loop();
			System.out.println(obj.countNodesinLoop(llist1.head));
		}
	}
}
}
/*This is a function problem.You only need to complete the function given below*/
/*
class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}*/
//Function should return the length of the loop in LL.
class Loop
{
    int countNodesinLoop(Node head)
    {
        Node slow = head;
        Node fast = head;
        boolean pr = false;
        while(fast != null && fast.next != null){
            if(pr){    
                if(fast == slow){
                    slow=head;
                    while(slow != fast){
                        fast = fast.next;
                        slow = slow.next;
                        
                    }
                    fast = fast.next;
                    int k=1;
                    while(fast != slow){
                        k++;
                        fast=fast.next;
                    }
                    return k;
                }
                
            }
            pr=true;
            fast = fast.next.next;
            slow = slow.next;
        }
        return 0;
    }
}