{
import java.util.*;
import java.lang.*;
import java.io.*;
//Position this line where user code will be pasted.
class GFG {
	public static void main (String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0)
		{
		    t--;
		    
		    String s1=sc.next();
		    String s2=sc.next();
		    
		    new solve().solution(s1, s2);
		    System.out.println();
		}
	}
}

}
/*This is a function problem.You only need to complete the function given below*/
class solve{
    public static void solution(String s1, String s2){
       int min = 10000000;
       for(int i=0;i<s2.length();i++){
            if(s1.indexOf(s2.charAt(i))<min&&s1.indexOf(s2.charAt(i)) >=0)
                min=s1.indexOf(s2.charAt(i));
       }
       System.out.print(s1.charAt(min));
    }
}