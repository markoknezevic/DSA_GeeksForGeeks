{
//Initial Template for Java
import java.util.*;
import java.io.*;
class Node {
    int data;
    Node next;
    Node(){}
    Node(int d) {
        data = d;
        next = null;
    }
}
class LinkedList {
    Node head;
    
    void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }
	
    public void push(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    String[] inputline = br.readLine().trim().split(" ");
            int n1 = Integer.parseInt(inputline[0]);
            inputline = br.readLine().trim().split(" ");
            LinkedList list = new LinkedList();
            for (int i = n1-1; i >=0 ; i--) {
                int a = Integer.parseInt(inputline[i]);
                list.push(a);
            }
            GfG g = new GfG();
            list.head = g.modify(list.head);
		    list.printList(list.head);
        }
    }
}   
}
/*This is a function problem.You only need to complete the function given below*/
//User function Template for Java
//User function Template for Java
class GfG {
    Node modify(Node head) {
       Node pom= head;
        Node fin = new Node(pom.data);
        Node pocetak=fin;
        int i=0;
        
        ArrayList<Integer> prvi = new ArrayList<Integer>();
        ArrayList<Integer> drugi = new ArrayList<Integer>();
        while(pom !=null){
            if(i%2==0){
                prvi.add(pom.data);
            }else{
                drugi.add(pom.data);
            }
            
            i++;
            pom=pom.next;

        }
 
        
       int n=(prvi.size()+drugi.size());

       
       if(n%2==0){
           for(int k=0;k<drugi.size();k++){
               fin.next=new Node(drugi.get(k));
                 fin = fin.next;
           }
            for(int k=0;k<prvi.size();k++){
               fin.next=new Node(prvi.get(k));
                 fin = fin.next;
           }
       }else{
           
           
            for(int k=0;k<prvi.size();k++){
               fin.next=new Node(prvi.get(k));
                 fin = fin.next;
           }
           
           for(int k=0;k<drugi.size();k++){
               fin.next=new Node(drugi.get(k));
                 fin = fin.next;
           }
          
       }
        return pocetak.next;
        
    }
}