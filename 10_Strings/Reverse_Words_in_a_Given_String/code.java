{

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test > 0) {
            String s = sc.next();
            Reverse obj = new Reverse();
            obj.reverseWords(s);
             System.out.println();
            test--;
        }
    }
}

}
/*This is a function problem.You only need to complete the function given below*/
class Reverse {
    public static void reverseWords(String sd) {
      
        String []str = sd.split("\\.");
        
        for(int i=str.length-1;i>=0;i--){
            System.out.print(str[i]);
            if(i != 0)
                System.out.print(".");
        }
    }
}