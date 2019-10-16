{
import java.io.*; 
import java.util.*; 
import java.lang.*;import org.javatuples.Pair;
class Driverclass
{
    public static void main (String[] args) throws IOException  
    {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		
		while(t-- > 0)
		{
		    String inputLine[] = br.readLine().trim().split(" ");
		    int n = Integer.parseInt(inputLine[0]);
		    int start[] = new int[n];
		    int end[] = new int[n];
		    
		    inputLine = br.readLine().trim().split(" ");
		    for(int i = 0; i < n; i++)
		     start[i] = Integer.parseInt(inputLine[i]);
		    
		    inputLine = br.readLine().trim().split(" ");
		    for(int i= 0; i < n; i++)
		      end[i] = Integer.parseInt(inputLine[i]);
		    
		    System.out.println(new Activity().activitySelection(start, end, n));
		}
    }
}

}
/*This is a function problem.You only need to complete the function given below*/
class Activity
{
    static int activitySelection(int start[], int end[], int n)
    {
        ArrayList<Pair> list = new ArrayList<Pair>();
        for(int i=0;i<n;i++)
        list.add(new Pair(start[i],end[i]));
        
        list.sort((o1, o2) -> o1.getEnd().compareTo(o2.getEnd()));
        
        Pair cur = list.get(0);
        int c =1;
        for(Pair i: list){
            if(i.getSt()>=cur.getEnd()){
                c++;
                cur=i;
            }
        }
        
        return c;
    }
   
}

 class Pair{
        Integer st;
        Integer end;
        
        public Pair(int a,int b){
            st=a;
            end=b;
        }
        Integer getSt(){
            return st;
        }
        
        Integer getEnd(){
            return end;
        }
        
       
    }