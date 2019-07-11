{
//Initial Template for Java
import java.util.*;
import java.lang.*;
import java.io.*;
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}
class Driverclass
{
    
    public static void main (String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            Node head = new Node(sc.nextInt());
            Node tail = head;
            while(n-- > 1){
		        tail.next = new Node(sc.nextInt());
		        tail = tail.next;
		    }
		   
		      head = new LinkedList().mergeSort(head);
		     printList(head);
		    System.out.println();
        }
    }
    public static void printList(Node head)
    {
        if(head == null)
           return;
           
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}

}
/*This is a function problem.You only need to complete the function given below*/
//User function Template for Java
/*
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        this.data = key;
        next = null;
    }
} */
class LinkedList
{
    static Node mergeSort(Node head)
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
    Node p = head;
        while(p != null){
            list.add(p.data);
            p=p.next;
        }
    
     Collections.sort(list);
     Node fin = null;
     Node pom=null;
     for(Integer i : list){
         if(fin == null){
             fin = new Node(i);
             pom=fin;
         }else{
             pom.next=new Node(i);
             pom=pom.next;
         }
     }
     return fin;
    }
}
