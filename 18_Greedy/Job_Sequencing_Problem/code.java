{

import java.io.*;
import java.lang.*;
import java.util.*;
class Job {
    int id, profit, deadline;
    Job(int x, int y, int z){
        this.id = x;
        this.deadline = y;
        this.profit = z; 
    }
}
class GfG {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
            String inputLine[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            Job[] arr = new Job[n];
            inputLine = br.readLine().trim().split(" ");
            for(int i=0, k=0; i<n; i++){
                arr[i] = new Job(Integer.parseInt(inputLine[k++]), Integer.parseInt(inputLine[k++]), Integer.parseInt(inputLine[k++]));
            }
            new solve().printJobScheduling(arr, n);
            System.out.println();
        }
    }
}
}
/*This is a function problem.You only need to complete the function given below*/

class solve{
    void printJobScheduling(Job arr[], int n){
        
        
        Arrays.sort(arr,Collections.reverseOrder(new Comparator<Job>(){
            @Override public int compare(Job p1, Job p2){
                return p1.profit-p2.profit;
            }
        }));
        
        int c=0,val=0;
         int max=0;
         for(Job i : arr){
             max=Math.max(max,i.deadline);
         }
        boolean fields [] = new boolean[max];
        for(Job i : arr){
            for(int j=i.deadline-1;j>=0;j--){
                if(!fields[j]){
                    fields[j]=true;
                    c++;
                    val+=i.profit;
                    break;
                }
            }
              
        }
       // System.out.println(max);
        System.out.print(c+" "+val);
        
        
        
    }
}