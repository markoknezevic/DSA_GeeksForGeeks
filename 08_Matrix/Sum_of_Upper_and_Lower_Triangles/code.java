{
//Initial Template for Java
import java.lang.*;
import java.io.*;
import java.util.*;
class Driverclass 
{
    public static void main (String[] args) 
    {
		Scanner sc = new Scanner(System. in);
		int t = sc.nextInt();
		sc.nextLine();
		while(t-->0)
		{
		   int n = sc.nextInt();
		   int mat[][]= new int[n][n];
		   for(int i = 0; i < n; i++)
		   {
		       for(int j = 0; j < n; j++)
		         mat[i][j] = sc.nextInt();
		   }
		   new Upper_Lower_TriangleSum().Summatrix(mat, n);
		  
		  System.out.println();
		
        } 
        
	}
}

}
/*This is a function problem.You only need to complete the function given below*/
//User function Template for Java
class Upper_Lower_TriangleSum
{
    //Complete this function
    static void Summatrix(int mat[][], int n)
    {
        int sum1=0,sum2=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i<=j){
                    sum1+=mat[i][j];
                }
                if(i>=j){
                    sum2+=mat[i][j];
                }
            }
        }
        
        System.out.print(sum1+" "+sum2);
    }
}