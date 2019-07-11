{
import java.util.*;
class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}
		
class GfG
{
     /* Drier program to test above functions */
    public static void main(String args[])
    {
         Scanner sc = new Scanner(System.in);
		 int t=sc.nextInt();
		 
		 while(t-->0)
         {
            LList myList = new LList();
			int n = sc.nextInt();
            sc.nextLine();
            for(int i=0;i<n;i++)
            {
                int a1=sc.nextInt();
                int a2=sc.nextInt();
                if(a2==0)
                    myList.insertAtBeginning(a1);
                else
                    myList.insertAtEnd(a1);
            }
			myList.printList();
		}
	}
}

}
/*This is a function problem.You only need to complete the function given below*/
/*class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }*/
class LList
{
    Node head; // Please do not remove this
    
    // Should insert a node at the beginning
	void insertAtBeginning(int x)
	{
	    if(head == null){
	        head=new Node(x);
	        return;
	    }
	    Node p = new Node(x);
	    p.next = head;
	    head = p;
	}
	
	// Should insert a node at the end
	void insertAtEnd(int x)
	{
	    if(head == null){
	        head=new Node(x);
	        return;
	    }
	    
	    Node pom = head;
	    while(pom.next != null){
	        //System.out.println(pom.data);
	        pom = pom.next;
	    }
	   
	    Node p = new Node(x);
	    pom.next = p;
	}
	
	
	
	
	// Please do not delete this
	void printList()
    {
        Node temp = head;
        while (temp != null)
        {
           System.out.print(temp.data+" ");
           temp = temp.next;
        }  
        System.out.println();
    }
}