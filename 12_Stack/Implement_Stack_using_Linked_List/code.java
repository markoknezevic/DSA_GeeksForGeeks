{
import java.util.*;
class StackNode {
    int data;
    StackNode next;
    StackNode(int a){
        data = a;
        next = null;
    }
}
class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            MyStack obj = new MyStack();
            int Q = sc.nextInt();
            while (Q > 0) {
                int QueryType = 0;
                QueryType = sc.nextInt();
                if (QueryType == 1) {
                    int a = sc.nextInt();
                    obj.push(a);
                } else if (QueryType == 2) {
                    System.out.print(obj.pop() + " ");
                }
                Q--;
            }
            System.out.println("");
            t--;
        }
    }
}

}
/*This is a function problem.You only need to complete the function given below*/
/*
The structure of the node of the stack is
class StackNode
{
    int data;
    StackNode next;
    StackNode(int a)
    {
       data = a;
       next = null;
    }
}
*/
class MyStack {
    // Note that top is by default null
    // in Java
    StackNode top;
    void push(int a) {
        StackNode p=new StackNode(a);
        p.next=top;
        top=p;
    }
    int pop() {
        if(top != null){
        StackNode p=top;
        top=top.next;
        return p.data;
        }else{
            return -1;
        }
    }
}
