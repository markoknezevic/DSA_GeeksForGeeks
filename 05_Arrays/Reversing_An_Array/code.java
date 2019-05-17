//Initial Template for Java
/*package whatever //do not write package name here */
import java.io.*;
import java.util.*;
class Array {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int testcases=sc.nextInt(); //Input the testcases
		while(testcases-->0)
		{
		    int sizeOfArray=sc.nextInt();
		    int arr[]=new int[sizeOfArray];
		    for(int i=0;i<sizeOfArray;i++)
		    {
		        int x=sc.nextInt(); //input elements of array
		        arr[i]=x;
		    }
		    
		    Reverse obj = new Reverse();
		    obj.arrayReversal(arr,sizeOfArray); //Calling function to reverse the array
		    
		    for(int i=0;i<sizeOfArray;i++)
		    System.out.print(arr[i]+" "); //printing the elements of the array
		    
		    System.out.println();
		    
		    
		    
		}
	}
}
//Position this line where user code will be pasted.

}

/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

//User function Template for Java
class Reverse
{
    
    // This function should reverse contents of
    // arr[0..sizeOfArray-1]
    public static void arrayReversal(int arr[],int sizeOfArray) 
    {
    int i=0,j=sizeOfArray-1;
    while(i<j){
        int pom=arr[i];
        arr[i]=arr[j];
        arr[j]=pom;
        i++;
        j--;
    }
    }