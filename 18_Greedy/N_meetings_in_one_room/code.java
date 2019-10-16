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
 class Pair{
        Integer st;
        Integer end;
        Integer ind;
        
        public Pair(int a,int b,int c){
            st = a;
            end = b;
            ind = c;
        }
        Integer getSt(){
            return st;
        }
        
        Integer getInd(){
            return ind;
        }
        
        Integer getEnd(){
            return end;
        }
        
       
    }
class Meeting
{
    static void maxMeetings(int start[], int end[], int n)
    {
         ArrayList<Pair> list = new ArrayList<Pair>();
        for(int i=0;i<n;i++)
        list.add(new Pair(start[i],end[i],i+1));
        
        list.sort((o1, o2) -> o1.getEnd().compareTo(o2.getEnd()));
        
        Pair cur = list.get(0);
        System.out.print(cur.getInd()+" ");
        for(Pair i: list){
            if(i.getSt()>=cur.getEnd()){
                System.out.print(i.getInd()+" ");
                cur=i;
            }
            
        }
        
        
    }
}