{
//Initial Template for Java
import java.util.*;
import java.io.*;
import java.lang.*;
class Driverclass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- >0)
        {
            int n=sc.nextInt();
            int arr[] = new int[n];
            for(int i = 0; i < n; i++)
                arr[i] = sc.nextInt();
                
            
            System.out.println(new Hashing().countNonRepeated(arr, n));
        }
    }
}
}
/*This is a function problem.You only need to complete the function given below*/
//User function Template for Java
class Hashing
{
    // Function to count non-repeated elements in the array
    // arr[]: input array
    // n: size of array
    static long countNonRepeated(int arr[], int n)
    {
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i])!=true){
                map.put(arr[i],1);
            }else{
                map.put(arr[i],map.get(arr[i])+1);
            }
        }
        int count = Collections.frequency(map.values(), 1);

        return count;
    }
}