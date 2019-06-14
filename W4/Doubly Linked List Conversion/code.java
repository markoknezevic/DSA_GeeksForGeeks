{
//Initial Template for Java
//Initial Template for Java
//Initial Template for Java
import java.util.*;
import java.io.*;
// Node class
class Node{
    int data;
    Node next;
    Node prev;
   
    Node(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
// Driver class
class GFG {
   
    // function to print doubly linked list
    static void printLL2(Node head){
   
    if(head == null){
        return;
    }
   
    Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
   
    Node tail = temp;
    // System.out.println(tail.data);
   
    while(tail.prev != null){
       
        System.out.print(tail.data + " <- ");
        tail = tail.prev;       
    }
    if(tail.prev == null){
        System.out.println(tail.data);
    }
}
   
    // Driver code
    public static void main (String[] args) {
       
        Scanner sc = new Scanner(System.in);
       
        int t  = sc.nextInt();
       
        while(t > 0){
           
            Node head = null;
           
            // size of linked list
            int n = sc.nextInt();
           
            // taking first node as input and assigning it as head
            if(n > 0){
                int x = sc.nextInt();
                head = new Node(x);
            }
           
            n--;
            Node temp = head;
           
            // taking other node as input
            while(n-- > 0){
       
                int x1 = sc.nextInt();
               
                while(temp.next != null){
                    temp = temp.next;
                }
               
                temp.next = new Node(x1);
            }
         
          GfgNew.makeDoubly(head);
          printLL2(head);
           
            t--;
        }
    }
}

}
/*This is a function problem.You only need to complete the function given below*/
//User function Template for Java
//User function Template for Java
//User function Template for Java
//User function Template for Java
class GfgNew{
 // Function to convert singly linked list to doubly
    static void makeDoubly(Node head){
       
        Node pom1=head.next;
        Node pom2=head;
        
        while(pom1 !=null){
            pom1.prev=pom2;
            
            pom1=pom1.next;
            pom2=pom2.next;
        }
        
        
        
    }
}