{
//Initial Template for Java
import java.io.*;
import java.lang.*;
import java.util.*;
class Driverclass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            String arr[] = new String[n];
            
            for(int i = 0; i < n; i++)
                arr[i] = sc.next();
            new Election().winner(arr, n);
            
            System.out.println();
        }
    }
}
}
/*This is a function problem.You only need to complete the function given below*/
//User function Template for Java
class Election
{
    static void winner(String arr[], int n)
    {
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i]) !=true){
                map.put(arr[i],1);
            }else{
                map.put(arr[i],map.get(arr[i])+1);
            }
        }
       
        int max = Collections.max(map.values());
        int sizeWinners = Collections.frequency(map.values(),max);
        
        String winners[]=new String[sizeWinners];
        int k=0;
        for(String i : map.keySet()){
            
            if(map.get(i)==max){
                winners[k]=i;
                
                k++;
            }
        }
        
        Arrays.sort(winners);
        System.out.print(winners[0]+" "+max);
    }
}
