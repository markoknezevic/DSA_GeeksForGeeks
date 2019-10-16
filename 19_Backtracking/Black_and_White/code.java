{
import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.BigInteger;
class Driverclass
{
    public static void main(String[] args) throws IOException 
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t=0; t<T; t++) 
        {
            int N = sc.nextInt();
            int M = sc.nextInt();
            System.out.println(new BlackAndWhite().solve(N, M));
        }
    }
}
}
/*This is a function problem.You only need to complete the function given below*/
class BlackAndWhite
{
    public static long solve(int n, int m)
    {
        // specifying the directions to check in i.e 8 directions
         int x_off[] = new int []{-2,-2,-1, 1, 2, 2, 1, -1};
         int y_off[] = new int []{-1, 1, 2, 2, 1,-1, -2, -2};
        
        // variable to maintain number of positions which are not feasible
        long ret = 0;
        int x = 0, y = 0;
        
        // iterating for complete matrix
        for(int i=0;i<m;++i)
        {
            for(int j=0;j<n;++j)
            {
                for(int k=0;k<8;++k)
                {
                    x = i+x_off[k];
                    y = j+y_off[k];
                    
                    // checking if the attack position is within bounds
                    if(x>=0 && x<m && y>=0 && y<n) 
                        ++ret; // if in bounds it is not feasible, increement it
                }
            }
        }
        long total = m*n;
        total = total*(total-1); // total possible combinations of 2 knights
        return (total-ret); // returning total feasible combinations
    }
       
}