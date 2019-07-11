{
/*package whatever //do not write package name here */
import java.io.*;
import java.util.*;
class Node {
    int data;
    Node next;
    
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
		    
		    Node head1 = null, head2 = null, tail1 = null, tail2 = null;
		    
		    //Input first LL
		    int n1 = sc.nextInt();
            int d1 = sc.nextInt();		    
		    head1 = new Node(d1);
		    tail1 = head1;
		    
		    while(n1-- > 1){
		        Node n = new Node(sc.nextInt());
		        n.next = head1;
		        head1 = n;
		    }
		    
		    //Input second LL
		    int n2 = sc.nextInt();
            int d2 = sc.nextInt();		    
		    head2 = new Node(d2);
		    tail2 = head2;
		    
		    while(n2-- > 1){
		        Node n = new Node(sc.nextInt());
		        n.next = head2;
		        head2 = n;
		    }
		    
		    Solution obj = new Solution();
		    if(obj.isIdentical(head1, head2))
		        System.out.println("Identical");
		    else   
		        System.out.println("Not identical");
		    
		}
	}
	
	public static void po(Object o){
	    System.out.println(o);
	}
	
	public static void show(Node head){
        while(head != null){
            System.out.print(head.data+" ");
            head = head.next;
        }
        System.out.println();
    }
}

}
/*This is a function problem.You only need to complete the function given below*/
/*
class Node {
    int data;
    Node next;
    
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}*/
class Solution {
    
    // Function which returns true if both linked
    // lists are identical else return false
    public boolean isIdentical (Node head1, Node head2){
        Node fir = head1;
        Node sec = head2;
        while(fir!=null){
            if(fir.data != sec.data){
                return false;
            }
            fir = fir.next;
            sec = sec.next;
        }
        return true;
    }
}