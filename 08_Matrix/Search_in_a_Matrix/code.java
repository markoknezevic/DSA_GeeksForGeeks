{
import java.io.*;
import java.lang.*;
import java.util.*;
class Driverclass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n1 = sc.nextInt();
            int m1 = sc.nextInt();
            
            int arr1[][] = new int[n1][m1];
            
            for(int i = 0; i < n1; i++)
            {
                for(int j = 0; j < m1; j++)
                 arr1[i][j] = sc.nextInt();
            }
            int x = sc.nextInt();
            //new SearchinMat().search(n1, m1, arr1, x);
            SearchinMat obj = new SearchinMat();
            System.out.println(obj.search(n1, m1, arr1, x));
        }
    }
}

}
/*This is a function problem.You only need to complete the function given below*/
class SearchinMat
{
    //Complete this function
    static int search(int n1, int m1, int arr1[][], int x)
    {
        int k=0;
       for(int i=m1-1;i>=0;i--){
           
         
           if(k>=n1)
                break;
            
            if(arr1[k][i]==x){
               return 1;
           }
           if(arr1[k][i]<x){
               i=m1;
               k++;
           }
       }
       return 0;
    }
}
