
import java.util.*;
//Position this line where user code will be pasted.
class Main
{   
    public static void main (String[] args) 
    {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int[] arr=new int[n];
			for(int i=0;i<n;i++)
				arr[i]=sc.nextInt();
				
			Missing obj = new Missing();
			int missing = obj.findMissing(arr,n);
			System.out.println(missing);
		}
    }
}
}

/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/


class Missing{
    
    // function to find first positive missing number
    static int findMissing(int arr[], int size)
    {
        
    Arrays.sort(arr);
    int k=1;
    Set<Integer> hash_Set = new HashSet<Integer>(); 
    for(int i=0;i<size;i++)
    hash_Set.add(arr[i]);
          
          
          
          
          
    for(int i=0;i<size;i++){
           
        if(hash_Set.contains(k)){
            k++;
           }else{
            return k;
           }
        }
       
    return arr[size-1];
        
    }
    
}