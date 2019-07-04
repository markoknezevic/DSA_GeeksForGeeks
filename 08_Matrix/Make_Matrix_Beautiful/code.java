{
import java.lang.*;
import java.io.*;
import java.util.*;
class Driverclass
{
    
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            int n = Integer.parseInt(read.readLine());
             int mat[][] = new int[n][n];
            String str[] = read.readLine().trim().split("\\s+");
            int k =0;
            for(int i = 0; i < n; i++)
            {
                for(int j = 0; j < n; j++)
                  mat[i][j] = Integer.parseInt(str[k++]);
            }
            System.out.println(new Operation().findMinOperation(n, mat));
        }
    }
}

}
/*This is a function problem.You only need to complete the function given below*/
class Operation
{
    //Complete this function
    static int findMinOperation(int n, int mat[][])
    {
        int min[] =new int[n];
        int minb[] =new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            
            for(int j=0;j<n;j++){
                sum+=mat[i][j];
            }
            min[i]=sum;
            sum=0;
        }
          sum=0;
        for(int i=0;i<n;i++){
            
            for(int j=0;j<n;j++){
                sum+=mat[j][i];
            }
            minb[i]=sum;
            sum=0;
        }
        
       
        
        int max=0;
        for(int i=0;i<n;i++){
            max=Math.max(max,min[i]);
        }
        int fin=0;
        for(int i=0;i<n;i++){
            fin+=max-min[i];
        }
        
        
        int max2=0;
        for(int i=0;i<n;i++){
            max2=Math.max(max2,minb[i]);
        }
        int fin2=0;
        for(int i=0;i<n;i++){
            fin2+=max2-minb[i];
        }
        return Math.max(fin,fin2);
    }
}
