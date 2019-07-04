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
           
            new Traverse().spirallyTraverse(n1, m1, arr1);
            
            System.out.println();
        }
    }
}

}
/*This is a function problem.You only need to complete the function given below*/
class Traverse
{
    //Complete this function
    static void spirallyTraverse(int m, int n, int arr1[][])
    {
        
        int sum=m*n,i,j;
        int k=0,pom1=0;
        
        while(k<sum){
   
        i=pom1;
      
       while(i<n){
          System.out.print(arr1[pom1][i]+" ");
          i++;
          k++;
       }
       if(k>=sum)
        break;
     
       j=pom1+1;
        while(j<m){
          System.out.print(arr1[j][n-1]+" ");
          j++;
          k++;
       }
       
       
       if(k>=sum)
        break;

       i=n-2;
       while(i>pom1-1){
           System.out.print(arr1[m-1][i]+" ");
           i--;
           k++;
       }
       
       if(k>=sum)
        break;
        
       j=m-2;
      
       while(j>pom1){
         System.out.print(arr1[j][pom1]+" ");
           j--;  
           k++;
       }
     
       pom1++;
       n--;
       m--;
       
           
        }
    }
}