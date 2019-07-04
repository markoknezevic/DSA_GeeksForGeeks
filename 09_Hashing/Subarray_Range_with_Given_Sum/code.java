{
//Initial Template for Java
import java.util.*;
import java.lang.*;
import java.lang.*;
import java.io.*;
class Driverclass
{
	public static void main (String[] args)
	 {
    	 Scanner sc=new Scanner(System.in);
    	 int t=sc.nextInt();
    	 while(t-->0)
    	 {
    	        int n = sc.nextInt();
    		    int arr[] = new int[n];
    		    for(int i=0;i<n;i++)
    		    {
    		        arr[i] = sc.nextInt();
    		    }
    		    int sum = sc.nextInt();
    		    System.out.println(new sumRange().subArraySum(arr, n, sum));
    		    
    		}
	}
}
}
/*This is a function problem.You only need to complete the function given below*/
//User function Template for Java
class sumRange
{
    static int subArraySum(int arr[], int n, int sum)
    {
          /
    int c=0,s=0;
    for(int i=0;i<n;i++){
        s=0;
        for(int j=i;j<n;j++){
            s+=arr[j];
         
                break;
            }*/
            if(s==sum){
                c++;
            }
        }
    }
    return c;
    }
}