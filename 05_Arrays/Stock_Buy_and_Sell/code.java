{
import java.io.*;
import java.util.*;
class Interval {
    int buy;
    int sell;
}
class GFG {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    int n = Integer.parseInt(br.readLine().trim());
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split(" ");
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]);
		    }
		    
		    Stock obj = new Stock();
		    
		    obj.stockBuySell(arr, n);
		    System.out.println();
		}
	}
}

}

/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

/*
class Interval {
    int buy;
    int sell;
}*/
class Stock{
    // Function to find the buy and sell days and print them
    static void stockBuySell(int price[], int n) {
        
        
        int ind= -1;
        StringBuilder str=new StringBuilder("");
        for(int i=0;i<n;i++){
            if(i!=n-1){
            
            if(price[i]<price[i+1]){
                if(ind<0)
                    ind=i;
                }else{
                    if(ind>-1){
                        str.append("("+ind+" "+i+") ");
                       
                }
                ind=-1;
            }
            }else{
                if(ind>-1){
                    if(price[i]>price[i-1])
                    {
                        str.append("("+ind+" "+i+") ");
                    }else{
                        str.append("("+ind+" "+(i-1)+") ");
                    }
                }
                ind=-1;
            }
        }
        //str.deleteCharAt( str.length() - 1 );
        //System.out.print(str+"OVO JE STRING");
        if(str.toString().equals("")){
            System.out.print("No Profit");
        }else{

            System.out.print(str);
        }
        
    } 
    
}