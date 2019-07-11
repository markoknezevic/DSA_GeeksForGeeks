{
import java.util.*;
import java.lang.*;
import java.io.*;
//Position this line where user code will be pasted.
class GFG {
    
	public static void main (String[] args) {
		
    	try {
    	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	    String[] words = br.readLine().split("\\s+");
    	    int numTestCases = Integer.parseInt(words[0]);
    	    
    	    for (int tIdx = 0; tIdx < numTestCases; tIdx++) {
    	        words = br.readLine().split("\\s+");
    	        int size = Integer.parseInt(words[0]);
    	        String str = br.readLine();
    	        String sortedStr = new solve().caseSort(str);
    	        System.out.println(sortedStr);
    	    }
    	}
    	catch (IOException e) {
    	    System.out.println(e);
    	}
	}
}

}
/*This is a function problem.You only need to complete the function given below*/
class solve{
    public static String caseSort(String str) {
     
        ArrayList<Character> low = new ArrayList<Character>();
        ArrayList<Character> upp = new ArrayList<Character>();
        
      
        
        for(int i=0;i<str.length();i++){
            if(Character.isUpperCase(str.charAt(i))){
                upp.add(str.charAt(i));
                
            }else{
                low.add(str.charAt(i));
                
            }
        }
        
        
        
        Collections.sort(low);
        Collections.sort(upp);
        int u=0;
        int l=0;
       
        
        StringBuilder fin = new StringBuilder();
        for(int i=0;i<str.length();i++){
            if(Character.isUpperCase(str.charAt(i))){
                fin.append(upp.get(u));
                u++;
            }else{
                fin.append(low.get(l));
                l++;
            }
                
        }
        
        
       
        
        return fin.toString();
    }
}