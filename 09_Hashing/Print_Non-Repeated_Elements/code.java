
//Initial Template for Java
import java.util.*;
import java.io.*;
import java.lang.*;
class Driverclass
{
    public static void main(String args[])throws IOException
    {
        // Scanner sc = new Scanner(System.in);
        // int t = sc.nextInt();
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- >0)
        {
            String str[] = read.readLine().trim().split(" ");
            int n=Integer.parseInt(str[0]);
            int arr[] = new int[n];
            
            str = read.readLine().trim().split(" ");
            for(int i = 0; i < n; i++)
                arr[i] = Integer.parseInt(str[i]);
                
            
            new Hashing().printNonRepeated(arr, n);
            System.out.println();
        }
    }
}

}
/*This is a function problem.You only need to complete the function given below*/
//User function Template for Java
class Hashing
{
    static void printNonRepeated(int arr[], int n)
    {
        LinkedHashMap<Integer,Integer> map=new LinkedHashMap<Integer,Integer>();
        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i]) != true){
                map.put(arr[i],1);
            }else{
                map.put(arr[i],map.get(arr[i])+1);
                
            }
        }
        for(Integer i: map.keySet())
            if(map.get(i)==1)
                System.out.print(i+" ");
      
    }
}