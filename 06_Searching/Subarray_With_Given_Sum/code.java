{
import java.util.*;
import java.lang.*;
import java.io.*;
class Array{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int s = sc.nextInt();
            int[] m = new int[n];
            for (int j = 0; j < n; j++) {
                m[j] = sc.nextInt();
            }
            
            Subarray obj = new Subarray();
            obj.subarraySum(n, s, m);
            System.out.println();
        }
    }
}
}
/*This is a function problem.You only need to complete the function given below*/
class Subarray{
    
    // Function to find subarray with given sum
    static void subarraySum(int n, int s, int[] m) {
        long sum = 0;
        int j = 0,i=0;
        while(i < n){
            
            if(i<n && sum < s){
                sum += m[i];
                i++;
            }
                
            if(sum == s){
                System.out.print((j+1)+" "+(i));
                return;
            }
            if(sum > s){
                sum -= m[j];
                j++;
                if(sum == s){
                System.out.print((j+1)+" "+(i));
                return;
                }
            }
        }
        
        while(sum>0){
             sum -= m[j];
                j++;
                if(sum == s){
                System.out.print((j+1)+" "+(i));
                return;
                }
        }
    < 
        System.out.print("-1");
        
    }
}