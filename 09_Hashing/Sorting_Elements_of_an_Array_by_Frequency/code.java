{
//Initial Template for Java
import java.util.*;
import java.io.*;
import java.lang.*;
import java.util.Map.Entry;
class Driverclass 
{
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(sc.readLine());
	    while(n != 0)
		{
			int size = Integer.parseInt(sc.readLine());
			int arr[] = new int[size];
			String[] temp = sc.readLine().trim().split("\\s+");
			
			for(int i = 0; i < size; i++)
			    arr[i] = Integer.parseInt(temp[i]);
			    
			    new Sorting().sortByFreq(arr, size);
			    System.out.println();
			n--;
		}
	}
}

}
/*This is a function problem.You only need to complete the function given below*/
//User function Template for Java
class Sorting
{
    static void sortByFreq(int arr[], int n)
    {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i]) != true){
                map.put(arr[i],1);
            }else{
                map.put(arr[i],map.get(arr[i])+1);
            }
        }
        ArrayList<Integer> list = new ArrayList<Integer>();
       
       
        while(Collections.max(map.values()) != 0){
            
            int pom = Collections.max(map.values());
            
            for(Integer j : map.keySet()){
                if(map.get(j) == pom){
                    while(map.get(j) != 0){
                    list.add(j);
                    map.put(j,map.get(j)-1);
                    }
                    
                }
                
                
               if(pom != Collections.max(map.values()))
                    break;
            }
            
            Collections.sort(list);
            for(Integer j : list){
                System.out.print(j+" ");
            }
            list.clear();
            
        }
       
    }
}