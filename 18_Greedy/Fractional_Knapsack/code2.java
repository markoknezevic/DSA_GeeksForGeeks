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
class itemComparator implements Comparator<Item>{
    public int compare(Item a, Item b){
        double r1 = (double)a.value / a.weight;
        double r2 = (double)b.value / b.weight;
        if(r1 > r2){
            return -1;
        } else if(r1 < r2) {
            return 1;
        }
        return 0;
    }
}

class solve{
    double fractionalKnapsack(int W, Item arr[], int n) {
        Arrays.sort(arr, new itemComparator());
        int curWeight = 0;
        double finalvalue = 0.0;
        for (int i = 0; i < n; i++) {
            if (curWeight + arr[i].weight <= W) {
                curWeight += arr[i].weight;
                finalvalue += arr[i].value;
            } else {
                int remain = W - curWeight;
                finalvalue += arr[i].value * ((double) remain / arr[i].weight);
                break;
            }
        }
        return finalvalue;
    }
}