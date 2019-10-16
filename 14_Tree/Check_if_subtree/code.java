{
import java.util.*;
class Node {
    int data;
    Node left, right;
    Node(int d) {
        data = d;
        left = null;
        right = null;
    }
}
class IfSubTree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            Node proot = null;
            if (n == 1) {
                proot = new Node(sc.nextInt());
                n--;
            }
            while (n-- > 0) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                char lr = sc.next().charAt(0);
                if (proot == null) {
                    proot = new Node(a);
                    switch (lr) {
                        case 'L':
                            proot.left = new Node(b);
                            break;
                        case 'R':
                            proot.right = new Node(b);
                            break;
                    }
                } else {
                    insert(a, b, lr, proot);
                }
            }
            int m = sc.nextInt();
            Node rroot = null;
            if (m == 1) {
                rroot = new Node(sc.nextInt());
                m--;
            }
            while (m-- > 0) {
                int z = sc.nextInt();
                int y = sc.nextInt();
                char ch = sc.next().charAt(0);
                if (rroot == null) {
                    rroot = new Node(z);
                    switch (ch) {
                        case 'L':
                            rroot.left = new Node(y);
                            break;
                        case 'R':
                            rroot.right = new Node(y);
                            break;
                    }
                } else {
                    insert(z, y, ch, rroot);
                }
            }
            Tree g = new Tree();
            boolean q = g.isSubtree(rroot, proot);
            if (q == true)
                System.out.println("1");
            else
                System.out.println("0");
        }
    }
    public static void insert(int a, int b, char lr, Node root) {
        if (root == null) return;
        if (root.data == a) {
            switch (lr) {
                case 'L':
                    root.left = new Node(b);
                    break;
                case 'R':
                    root.right = new Node(b);
                    break;
            }
        }
        insert(a, b, lr, root.left);
        insert(a, b, lr, root.right);
    }
}
}
/*This is a function problem.You only need to complete the function given below*/
/*complete the given function*/
/* class Node{
    int data;
    Node left,right;
    Node(int d)
    {
        data=d;
        left=null;
        right=null;
    }
}*/
class Tree {
    public static boolean isSubtree(Node T, Node S) {
        
        Queue<Node> qu = new LinkedList<Node>();
        
        qu.add(T);
        boolean fin = false;
        while(qu.isEmpty() == false){
            
            Node p = qu.poll();
            
            //if(p == S)
              //  return true;
            if(S.data == p.data){
                fin = equal(S,p);
            }
                
            if(p.left != null){
                
                qu.add(p.left);
            }
            
            if(p.right != null){
                qu.add(p.right);
            }
        }
        
        return fin;
    }
    
    static boolean equal(Node r1, Node r2){
        if(r1 == null && r2 == null)
            return true;
            
        if(r1 == null)
            return false;
            
        if(r2 == null)
            return false;
            
        if(r1.data == r2.data && equal(r1.left,r2.left) && equal(r1.right,r2.right)){
            return true;
        }else{
            return false;
        }
    }
}