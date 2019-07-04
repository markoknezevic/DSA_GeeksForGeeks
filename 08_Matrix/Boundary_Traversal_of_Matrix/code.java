{
//Initial Template for Java
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
            new BoundaryTraversal().boundaryTraversal(n1, m1,arr1);
            System.out.println();
            
        }
    }
}
}
/*This is a function problem.You only need to complete the function given below*/
//User function Template for Java
class BoundaryTraversal
{
 /*  n1, m1: rows and cols of matrix
     a[][]: input matrix
*/
    static void boundaryTraversal(int n1, int m1, int a[][])
    {
        
        for(int i=0;i<m1;i++){
            System.out.print(a[0][i]+" ");
            
        }
            
        for(int i=1;i<n1;i++){
            System.out.print(a[i][m1-1]+" ");
            
        }
        if(n1!=1)
        for(int i=m1-2;i>=0;i--){
            System.out.print(a[n1-1][i]+" ");
            
        }
        
            for(int i=n1-2;i>0;i--){
                System.out.print(a[i][0]+" ");
            }
                
              
        
      
    }
    
}