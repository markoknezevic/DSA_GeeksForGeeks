{
//Initial Template for Java
import java.io.*;
import java.util.*;
import java.lang.*;
class Driverclass
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n1 = sc.nextInt();
            int m1 = sc.nextInt();
            
            int arr1[][] = new int[n1][m1];
            for(int i = 0; i< n1; i++)
            {
                for(int j = 0; j < m1; j++)
                    arr1[i][j] = sc.nextInt();
            }
            int n2 = sc.nextInt();
            int m2 = sc.nextInt();
            
            int arr2[][] = new int[n2][m2];
            for(int i = 0; i < n2; i++)
            {
                for(int j = 0; j < m2; j++)
                    arr2[i][j] =sc.nextInt();
            }
            
            new Multiplication().multiplyMatrix(n1, m1, n2, m2, arr1, arr2);
            
            System.out.println();
            
        }
    }
}

}
/*This is a function problem.You only need to complete the function given below*/
//User function Template for Java
class Multiplication
{
    //Complete this function
    static void multiplyMatrix(int n1, int m1, int n2, int m2, int arr1[][], int arr2[][])
    {
        if(m1!=n2){
        System.out.print("-1");
    }else{
        int res=0;
        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
                for(int k=0;k<n2;k++)
                res+= arr1[i][k]*arr2[k][j];
                
                System.out.print(res+" ");
                res=0;
            }
            
        }
        
        
        
    }
    }
}