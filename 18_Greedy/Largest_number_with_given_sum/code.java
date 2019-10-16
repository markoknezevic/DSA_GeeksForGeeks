{
import java.io.*;
import java.lang.*;
import java.util.*;
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
            int sum = Integer.parseInt(inputLine[1]);
            System.out.println(new Solution().largestNumber(n, sum));
	    }
    }
}
}
/*This is a function problem.You only need to complete the function given below*/
class Solution
{
    // Function to return Largest Number
    static String largestNumber(int n, int sum)
    {
        Queue<Integer> qu = new LinkedList<Integer>();
        int s=0;
        for(int i=0;i<n;i++){
            if(s+9<=sum){
                qu.add(9);
                s+=9;
            }else if(s+8<=sum){
                qu.add(8);
                s+=8;
            }else if(s+7<=sum){
                qu.add(7);
                s+=7;
            }else if(s+6<=sum){
            qu.add(6);
                s+=6;
            }else if(s+5<=sum){
            qu.add(5);
                s+=5;
            }else if(s+4<=sum){
            qu.add(4);
                s+=4;
            }else if(s+3<=sum){
            qu.add(3);
                s+=3;
            }else if(s+2<=sum){
            qu.add(2);
                s+=2;
            }else if(s+1<=sum){
            qu.add(1);
                s+=1;
            }else{
                qu.add(0);
                
            }
            }
     if(s!= sum)
        return "-1";
    String fin="";
    while(qu.isEmpty()==false)
        fin+=qu.poll().toString();      
        
        return fin;
    }
    
    }

