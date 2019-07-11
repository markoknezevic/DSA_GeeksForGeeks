{
import java.util.*;
class Node
{
	int data;
	Node next;
	Node prev;
}
class DLinkedList
{
	
	Node newNode(Node head, int data)
	{
		Node p,temp = new Node();
		temp.data = data;
		temp.next = null;
		temp.prev = null;
		if(head == null)
		return temp;
		p = head;
		while(p.next != null)
		{
			p = p.next;
		}
		p.next = temp;
		temp.prev = p;
		return head;
	}
	
	void printList(Node node)
	{
		Node temp = node;
		while(temp.next != null)
		{
			temp = temp.next;
		}
		
		while(temp.prev != null)
		{
			temp = temp.prev;
		}
		
		while(temp != null)
		{
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.println();
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		DLinkedList DLL = new DLinkedList();
		int t = sc.nextInt();
		
		while(t>0)
		{
			Node temp;
			Node head = null;
			int n = sc.nextInt();
			for(int i=0;i<n;i++)
			{
				int x = sc.nextInt();
				head = DLL.newNode(head,x);
			}
			int pos = sc.nextInt();
			int data = sc.nextInt();
			
		    GfG g = new GfG();
		    g.addNode(head,pos,data);
			
			DLL.printList(head);
			while(head.next != null)
			{
				temp = head;
				head = head.next;
			}
		t--;
		}
	}
}
}
/*This is a function problem.You only need to complete the function given below*/
/* Structure of Doubly Linked List
class Node
{
	int data;
	Node next;
	Node prev;
}*/ 
class GfG
{
void addNode(Node head_ref, int pos, int data)
	{
		Node pom = head_ref;
		int i=0;
		while(pos != i){
		    i++;
		    pom=pom.next;
		}
		Node k = new Node();
		k.data=data;
		k.next=pom.next;
		pom.next = k;
		k.prev=pom;
		
	}
}