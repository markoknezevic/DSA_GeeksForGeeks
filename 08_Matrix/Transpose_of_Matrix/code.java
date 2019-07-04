{
//Initial Template for Java
import java.io.*;
import java.util.*;
import java.lang.*;
class Driverclass
{
    public static void main (String[] args)throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t= Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            int n = Integer.parseInt(read.readLine());
            int a[][] = new int[n][n];
            String st[] = read.readLine().trim().split("\\s+");
            int k = 0;
            for(int i = 0; i < n; i++)
            {
                for(int j = 0; j < n; j++)
                    a[i][j] = Integer.parseInt(st[k++]);
            }
            new TransposeMatrix().transpose(a, n);
            for(int i = 0; i < n; i++)
            {
                for(int j = 0; j < n;j++)
                    System.out.print(a[i][j] + " ");
            }
            
            System.out.println();
        }
    }
}
}
/*This is a function problem.You only need to complete the function given below*/
//User function Template for Java
class TransposeMatrix
{
    // Function to find the traspose of matrix
    // a[][]: input matrix
    // n: given size of matrix
    static void transpose(int a[][], int n)
    {
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int pom=a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=pom;
            }
        }
    }
}