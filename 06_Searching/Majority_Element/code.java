{
//Initial Template for Java
import java.util.*;
import java.io.*;
import java.lang.*;
class Geeks
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n =sc.nextInt();
            int arr[] = new int[n];
            
            for(int i = 0; i < n; i++)
             arr[i] = sc.nextInt();
             
           System.out.println(new Majority().majorityElement(arr, n)); 
        }
    }
}
}
/*This is a function problem.You only need to complete the function given below*/
//User function Template for Java
class Majority
{
    static int majorityElement(int a[], int size)
    {
        Arrays.sort(a);
        int c=0;
        for(int i = 0;i<size-1;i++){
            if(a[i]==a[i+1]){
                c++;
                if((c+1)>(size/2)){
                    return a[i];
                }
            }else{
                c=0;
            }
        }
        return -1;
    }
}