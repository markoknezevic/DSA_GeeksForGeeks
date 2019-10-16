{

import java.io.*; 
import java.util.*; 
import java.lang.*;
class Driverclass
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		
		while(t-- >0)
		{
		    String inputLine[] = br.readLine().trim().split(" ");
		    int n = Integer.parseInt(inputLine[0]);
		    
		    int start[] = new int[n];
		    int end[] = new int[n];
		    
		    inputLine = br.readLine().trim().split(" ");
		    for(int i = 0; i < n; i++)
		     start[i] = Integer.parseInt(inputLine[i]);
		    
		    inputLine = br.readLine().trim().split(" ");
		    for(int i =0; i < n;i++)
		      end[i] = Integer.parseInt(inputLine[i]);
		   new Meeting().maxMeetings(start, end, n);
		   System.out.println();
		    
		}
    }
}

}
/*This is a function problem.You only need to complete the function given below*/
class Pair {
    int x,y,ind;
    Pair(){
        this.x=0;
        this.y=0;
    }
    Pair(int x, int y,int c){
        this.x = x;
        this.y = y;
        ind=c;
    }
}
class Meeting
{
    
     static void sortPair(Pair arr[], int n) {
        Arrays.sort(arr, new Comparator<Pair>() { 
            @Override public int compare(Pair p1, Pair p2) { 
                return p1.x - p2.x; 
            } 
        }); 
    }
    
    static void maxMeetings(int start[], int end[], int n)
    {
             Pair[] p = new Pair[n];
		    for(int i=0; i<n; i++){
		        p[i] = new Pair();
		        p[i].y = start[i];
		        p[i].x = end[i];
		        p[i].ind = i+1;
		    }
		    
		    sortPair(p, n);
		    int i=0, j=1;
		    System.out.print(p[i].ind+" ");
		    while(i<n && j<n){
		        if(p[i].x<=p[j].y){
		            i=j;
		            j++;
		            System.out.print(p[i].ind+" ");
		        } else {
		            j++;
		        }
		    }
		   
    }
}