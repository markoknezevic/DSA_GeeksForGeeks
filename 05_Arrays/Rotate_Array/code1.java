//Initial Template for Java
import java.util.*;
import java.io.*;
import java.lang.*;
class DriverClass
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        int t = Integer.parseInt(br.readLine()); 
    	for(int i=0;i<t;i++)
    	{
    	   String str=br.readLine();
    		String[] starr=str.split(" ");
    	    int n=Integer.parseInt(starr[0]);
    		int d= Integer.parseInt(starr[1]);
    		int[] arr=new int[n];
    		String str1=br.readLine();
    		String[] starr1=str1.split(" ");
    		for(int j=0;j<n;j++)
    		{
    		  arr[j]= Integer.parseInt(starr1[j]);
    		}
    		new RotateArray().rotateArr(arr, d, n);
    		StringBuffer sb=new StringBuffer();
            for(int t1=0;t1<n;t1++)
             sb.append(arr[t1]+" ");
             System.out.println(sb);
         }
    }
}

}

/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

//User function Template for Java
class RotateArray
{
    static void rotateArr(int arr[], int d, int n)
    {
        int i=0,j=d-1;
         while(i<j){
                int pom = arr[i];
                arr[i]=arr[j];
                arr[j]=pom;
                i++;
                j--;
                }  
                
        i=d;
        j=n-1;
           while(i<j){
                int pom = arr[i];
                arr[i]=arr[j];
                arr[j]=pom;
                i++;
                j--;
                } 
                
        i=0;
        j=n-1;
           while(i<j){
                int pom = arr[i];
                arr[i]=arr[j];
                arr[j]=pom;
                i++;
                j--;
                }  
                
    }
}