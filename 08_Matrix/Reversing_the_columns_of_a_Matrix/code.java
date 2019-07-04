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
            new ModifyMat().reverseCol(n1, m1, arr1);
            for(int i = 0; i < n1; i++)
            {
                for(int j = 0; j < m1; j++)
                    System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }
    }
}

}
/*This is a function problem.You only need to complete the function given below*/
class ModifyMat
{
    //Complete this function
    static void reverseCol(int n1, int m1, int arr1[][])
    {
        int k,l;
       for(int i=0;i<n1;i++){
           k=m1-1;
           l=0;
           while(l<k){
               int pom=arr1[i][l];
               arr1[i][l]=arr1[i][k];
               arr1[i][k]=pom;
               l++;
               k--;
           }
       }
    }
}
