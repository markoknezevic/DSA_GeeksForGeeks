{
//Initial Template for Java
import java.util.*;
import java.io.*;
class Gfg
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int testcases = sc.nextInt();
        while(testcases-- > 0)
        {
            int sizeOfArray = sc.nextInt();
            int arr[] =  new int[sizeOfArray];  //array declaration
            
            for(int i = 0; i < sizeOfArray; i++)
             arr[i] = sc.nextInt(); //Input the array
             
            int sum = 0; 
            sum = sc.nextInt();
            
            Geeks obj = new Geeks();
            System.out.println(obj.sumExists(arr, sizeOfArray, sum));
        }
    }
}
//Position this line where user code will be pasted.

}
/*This is a function problem.You only need to complete the function given below*/
//User function Template for Java
class Geeks
{
    //Complete this function, Geeks
    public static int sumExists(int arr[], int sizeOfArray, int sum)
    {
       HashSet<Integer> set = new HashSet<Integer>();
       for(int i=0;i<sizeOfArray;i++){
           if(set.contains(sum-arr[i])==true){
               return 1;
           }else{
               set.add(arr[i]);
           }
       }
       return 0;
    }
}