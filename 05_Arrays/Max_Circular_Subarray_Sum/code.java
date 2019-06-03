{
import java.io.*;
import java.util.*;
class Array {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    int n = Integer.parseInt(br.readLine().trim());
		    int arr[] = new int[n];
		    String inputLine2[] = br.readLine().trim().split(" ");
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine2[i]);
		    }
		    
		    Kadane obj = new Kadane();
		    
		    System.out.println(obj.circularSubarraySum(arr, n));
		}
	}
}

}
/*This is a function problem.You only need to complete the function given below*/
class Kadane{
    
    // Function to find circular subarray with maximum sum
    // a: input array
    // n: size of array
    static int circularSubarraySum(int a[], int n) {
        int sum=0,res2=0,res=0;
        int maxe=0,maxf=0;
        
        
        ///////////////////prvi case
        for(int i=0;i<n;i++){
            maxe+=a[i];
            if(maxe<0)
                maxe=0;
                
            maxf=Math.max(maxf,maxe);
        }
        int max=a[0];
        for(int i=0;i<n;i++)
            max=Math.max(max,a[i]);
        if(maxf==0)
            return max;
        else
            res2=maxf;
        ///////////////////////Drugi case
        
        for(int i=0;i<n;i++){//Racunaje sume
            sum+=a[i];
        }

         for(int i=0;i<n;i++){//Obrtanje znaka
            a[i]=(-a[i]);
        }
        maxe=0;
        maxf=0;
        res=0;
        
        for(int i=0;i<n;i++){
            maxe+=a[i];
            if(maxe<0)
                maxe=0;
                
            maxf=Math.max(maxf,maxe);
        }
        max=a[0];
        for(int i=0;i<n;i++)
            max=Math.max(max,a[i]);
        if(maxf==0)
            res= max;
        else
            res= maxf;
     
        res=res+sum;
        
        if(res2>res)
            return res2;
        else
            return res;

    }
    
}