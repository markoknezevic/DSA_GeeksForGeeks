{
import java.util.*;
class Node {
    int data;
    Node next;
    Node() {}
    Node(int d) {
        data = d;
        next = null;
    }
} class Add_LinkedList {
    Node head;
    void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        // System.out.println("");
    }
    public void push(int new_data) {
        /* 1 & 2: Allocate the Node &
                  Put in the data*/
        Node new_node = new Node(new_data);
        /* 3. Make next of new Node as head */
        new_node.next = head;
        /* 4. Move the head to point to new Node */
        head = new_node;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int n1 = sc.nextInt();
            Add_LinkedList list1 = new Add_LinkedList();
            for (int i = 1; i <= n1; i++) {
                int a = sc.nextInt();
                list1.push(a);
            }
            int n2 = sc.nextInt();
            Add_LinkedList list2 = new Add_LinkedList();
            for (int i = 0; i < n2; i++) {
                int b = sc.nextInt();
                list2.push(b);
            }
            Add_LinkedList list3 = new Add_LinkedList();
            Add g = new Add();
            Node rs = g.addTwoLists(list1.head, list2.head);
            list3.printList(rs);
            System.out.println();
            T--;
        }
    }
}
}
/*This is a function problem.You only need to complete the function given below*/
/*The Node is defined as
class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
        Node(){}
    }
*/
class Add {
    
    // This function will add the numbers represented by two linked lists
    Node addTwoLists(Node first, Node second) {
        Node f = first;
        Node s = second;
        
        ArrayList<Integer> a = new ArrayList<Integer>();
        ArrayList<Integer> b = new ArrayList<Integer>();
        while(f != null){
            a.add(f.data);
            f=f.next;
        }
        while(s != null){
            b.add(s.data);
            s=s.next;
        }
      
       
        Node fin=null;
        Node pom=null;
        
        int prek=0;
        int i=0;
        for(i=0;i<Math.min(a.size(),b.size());i++){
            int res =(a.get(i)+b.get(i)+prek)%10;
            
            if(fin == null){
                fin = new Node(res);
                pom=fin;
                
            }else{
                
                pom.next = new Node(res);
                pom=pom.next;
            }
            
            prek=(a.get(i)+b.get(i)+prek)/10;
            
        }
        
        while(i<b.size()){
            int res =(b.get(i)+prek)%10;
            pom.next = new Node(res);
            pom=pom.next;
            prek=(b.get(i)+prek)/10;
            i++;
        }
         while(i<a.size()){
            int res =(a.get(i)+prek)%10;
            pom.next = new Node(res);
            pom=pom.next;
            prek=(a.get(i)+prek)/10;
            i++;
        }
        if(prek>0){
            pom.next = new Node(prek);
        }
        return fin;
       
    }
}