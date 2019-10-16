{
import java.util.*;
import java.io.*;
import java.lang.*;
class Driverclass
{
    static ArrayList<ArrayList<Integer>> res = new ArrayList<>();
    public static void main (String[] args)throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        
        while(t-- >0)
        {
            String str[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(str[0]);
            ArrayList<Integer> list = new ArrayList<>();
            str = br.readLine().trim().split(" ");
            for(int i = 0; i <n ;i++)
                list.add(Integer.parseInt(str[i]));
            str = br.readLine().trim().split(" ");    
            int sum = Integer.parseInt(str[0]);
            
            res = new Sum().combinationSum(list, sum);
            if (res.size() == 0) {
    			System.out.print("Empty");
    		}
 
    		// Print all combinations stored in res.
    		for (int i = 0; i < res.size(); i++) {
    			if (res.size() > 0) {
    				System.out.print("(");
    				List<Integer> ij = res.get(i);
    				for (int j = 0; j < ij.size(); j++) {
    				    
    					System.out.print(ij.get(j));
    					if(j < ij.size()-1)
    					 System.out.print(" ");
    				}
    				System.out.print(")");
    			}
    		}
    		System.out.println();
    		res.clear();
	    }
    }
    
}

}
/*This is a function problem.You only need to complete the function given below*/
class Sum
{
    static ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> list, int sum)
    {
        Collections.sort(list);
		ArrayList<Integer> r = new ArrayList<>();
		ArrayList<Integer> C = new ArrayList<>();
		ArrayList<ArrayList<Integer>> res = new ArrayList<>();
		int i,j;
		
		// storing only distinct elements in vector C
    	for(i=0;i<list.size();i++){
    	    j=i+1;
    	    while(j<list.size()&&list.get(i) == list.get(j)){
    	        j++;
    	    }
    	    C.add(list.get(i));
    	    i=j-1;
    	}
		findNumbers(C, sum, res, r, 0);
		return res;
    }
    
    static void findNumbers(ArrayList<Integer> ar, int sum, ArrayList<ArrayList<Integer>> res, 
        ArrayList<Integer> r, int i) 
    {
		// return if conditions out of bounds
		if (sum < 0 || i >= ar.size())
			return;
 
		// push the combination if the sum becomes equal to 0
		if (sum == 0) {
			res.add(new ArrayList<Integer>(r));
			return;
		}
		
		// push to current for possible answer
        r.add(ar.get(i));
        
        findNumbers(ar, sum-ar.get(i), res, r, i); // recurse for further inclusions
        
        
        r.remove(r.size()-1); // backtrack, to remove already present number in combination
	                    // and provide space for further additions and possible answers
	                    
	    // iterate to next index as all possible combination for index have been done                
        findNumbers(ar, sum, res, r, i+1);
		
	}
}

