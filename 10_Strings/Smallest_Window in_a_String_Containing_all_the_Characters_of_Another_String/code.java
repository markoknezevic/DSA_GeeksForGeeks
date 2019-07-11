{
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int test = scan.nextInt();
		
		while(test > 0){
		    String s = scan.next();
		    String t = scan.next();
		    
		    System.out.println(new solve().smallestWindow(s, t));
		    test--;
		}
	}
}
}
/*This is a function problem.You only need to complete the function given below*/
class solve
{
    public static String smallestWindow(String s, String t){
        HashSet<Character> set = new HashSet<Character>();
        for(int i=0;i<t.length();i++)
            set.add(t.charAt(i));
        
        min=1000000;
        int k=0;
        for(int i=0;i<s.length();i++){
            if(set.contains(s.charAt(i))){
                k++;
            }else{
                k=0;
            }
        }
        
        System.out.println(set);
        return " ";
    }
}