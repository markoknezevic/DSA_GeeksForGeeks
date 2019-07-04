{
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
	public static void main (String[] args) {
		//code
			//code
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t>0)
		{
		    int n = scan.nextInt() ;
		    int arr[] = new int[n];
		    for(int i = 0; i<n;i++)
		    {
		        arr[i] = scan.nextInt();
		    }
		    
		    t--;
		     System.out.println(findsum(arr,n)==true?"Yes":"No");
		}
	}
	
	//Position this line where user code will be pasted.
	
	
}
}
/*This is a function problem.You only need to complete the function given below*/
//Complete this function
static boolean findsum(int arr[],int n)
{
    int pom=0;
    HashSet<Integer> set = new HashSet<Integer>();
    set.add(0);
    for(int i=0;i<n;i++){
        pom+=arr[i];
        if(set.contains(pom) == true){
            return true;
        }
        set.add(pom);
    }
    return false;
}