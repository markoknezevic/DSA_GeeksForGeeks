{
import java.util.*;
import java.lang.*;
import java.io.*;
class Res
{
    static String max = "";
}
class Driverclass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int k = sc.nextInt();
		    String str = sc.next();
		    Res r = new Res();
		    r.max = str;
		    new Solution().findMaximumNum(str.toCharArray(), k, r);
		    System.out.println(r.max);
		    
		    
		}
    }
}
}
/*This is a function problem.You only need to complete the function given below*/
class Solution 
{
    // function to find maximum integer possible by
    // doing at-most K swap operations on its digits
    public static void findMaximumNum(char ar[], int k, Res r){
        //r.max = "";
        if(k==0)
            return;
        //char ar[] = str.toCharArray();
        int n = ar.length;
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                // if digit at position i is less than digit
                // at position j, swap it and check for maximum
                // number so far and recurse for remaining swaps
                if(ar[j]>ar[i]){
                    char temp = ar[i];
                    ar[i] = ar[j];
                    ar[j] = temp;
                    
                    String st = new String(ar);
                    // If current num is more than maximum so far
                    if(r.max.compareTo(st)<0){
                        r.max = st;
                    }
                    // recurse of the other k - 1 swaps
                    findMaximumNum(ar,k-1,r);
                    
                    // backtrack
                    temp = ar[i];
                    ar[i] = ar[j];
                    ar[j] = temp;
                }
            }
        }

    }
}
