{

import java.io.*;
import java.lang.*;
import java.util.*;
class Item {
    int value, weight;
    Item(int x, int y){
        this.value = x;
        this.weight = y;
    }
}
class GfG {
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
            String inputLine[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int w = Integer.parseInt(inputLine[1]);
            Item[] arr = new Item[n];
            inputLine = br.readLine().trim().split(" ");
            for(int i=0, k=0; i<n; i++){
                arr[i] = new Item(Integer.parseInt(inputLine[k++]), Integer.parseInt(inputLine[k++]));
            }
            System.out.println(String.format("%.2f", new solve().fractionalKnapsack(w, arr, n)));
        }
    }
}
}
/*This is a function problem.You only need to complete the function given below*/

/*
class Item {
    int value, weight;
    Item(int x, int y){
        this.value = x;
        this.weight = y;
    }
}
*/
class solve{
    
     static void sortPair(Item arr[], int n) {
        Arrays.sort(arr, new Comparator<Item>() { 
            @Override public int compare(Item p1, Item p2) { 
                return (p1.value/p1.weight) - (p2.value/p2.weight); 
            } 
        }); 
    }
    
    double fractionalKnapsack(int W, Item arr[], int n) {
        
       
        sortPair(arr,n);
        
        double val = 0;
        double fin = 0;
        int i;
        for(i=n-1;i>=0;i--){
            if((double)val + (double)arr[i].weight > W){
                break;
            }else{
                val+=(double)arr[i].weight;
                fin +=(double)arr[i].value;
                //System.out.println(arr[i].weight+" "+arr[i].value+" "+fin);
            }
            
        }
        if(i>=0)
        fin+=((double)arr[i].value/(double)arr[i].weight)*(W-val);
       //System.out.println((double)39/18*7);
        return fin;
        
        
    }
}