{
//Initial Template for Java
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
            int r = 0, c = 0;
            String str[] = read.readLine().trim().split("\\s+");
            r = Integer.parseInt(str[0]);
            c = Integer.parseInt(str[1]);
             int mat[][] = new int[r][c];
            
            for(int i = 0; i < r; i++)
            {
                int k = 0;
                str = read.readLine().trim().split("\\s+");
                for(int j = 0; j < c; j++)
                  mat[i][j] = Integer.parseInt(str[k++]);
            }
            new ModifyMat().booleanMatrix(r, c, mat);
        }
    }
}

}
/*This is a function problem.You only need to complete the function given below*/
//User function Template for Java
class ModifyMat
{
    //Complete this function
    static void booleanMatrix(int r, int c, int mat[][])
    {
        int x[]=new int[r*c*2];
        int k=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(mat[i][j]==1){
                   x[k]=i;
                   k++;
                   x[k]=j;
                   k++;
                }
            }
        }
        
        for(int i=1;i<k;i+=2){
            for(int s=0;s<r;s++)
                mat[s][x[i]]=1;
            for(int s=0;s<c;s++)
                mat[x[i-1]][s]=1;
        }
        
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println(" ");
        }
       
    }
}
