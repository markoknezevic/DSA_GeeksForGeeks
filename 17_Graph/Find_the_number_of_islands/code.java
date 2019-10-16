{
//Initial Template for Java
import java.util.*;
import java.io.*;
import java.lang.*;
class Driverclass
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int N = sc.nextInt();
            int M = sc.nextInt();
            
            ArrayList<ArrayList<Integer>> list = new ArrayList<>(N);
            
            // creating arraylist of arraylist
            for(int i = 0; i < N; i++)
            {
                ArrayList<Integer> temp = new ArrayList<>(M);
                list.add(i, temp);
            }
            
            // adding elements to the arraylist of arraylist
            for(int i = 0; i < N; i++)
            {
                for(int j = 0; j < M; j++)
                {
                    int val = sc.nextInt();
                    list.get(i).add(j, val);
                }
            }
            
            
            System.out.println(new Islands().findIslands(list, N, M));
            
        }
    }
}

}
/*This is a function problem.You only need to complete the function given below*/
//User function Template for Java
class Islands
{
    
    // Function to find the number of island in the given list
    // N, M: size of list row and column respectively
    static int findIslands(ArrayList<ArrayList<Integer>> list, int N, int M)
    {
            ArrayList<ArrayList<Boolean>> vis = new ArrayList<>(N); // Created a visited array intially all false(unvisited)
            
            for(int i = 0; i < N; i++)
            {
                ArrayList<Boolean> temp = new ArrayList<>(M);
                vis.add(i, temp);
            }
            
            for(int i = 0; i < N; i++)
            {
            
                for(int j = 0; j  < M; j++)
                {
                    vis.get(i).add(j, false);
                }
            
            }
        
        int count = 0;              // Number of different islands
        
        for(int i = 0; i < N; i++)  // Loop through every point in the matrix
        {
            for(int j = 0; j < M; j++)
            {
                if(vis.get(i).get(j) == false && list.get(i).get(j) == 1)   // If point is not already visited and list[i][j] is an island
                {
                    dfs(list, i, j, vis, N, M);                             // Call dfs
                    count += 1;
                }
            }
        }
        
        return count;
        
    }
    
    static boolean isSafe(ArrayList<ArrayList<Integer>> list, int row, int col, ArrayList<ArrayList<Boolean>> vis, int ROW, int COL)
    {   // Check boundary conditions for i and j. Also check if node is not already visited and is currently 1.
        return (row >= 0) && (row < ROW) && (col >= 0) && (col < COL) && ((list.get(row).get(col) == 1 && vis.get(row).get(col) == false));
    }
    
    static void dfs(ArrayList<ArrayList<Integer>> list, int i, int j, ArrayList<ArrayList<Boolean>> vis, int N, int M)
    {   
        int row[] = new int[]{-1, -1, -1, 0, 1, 1, 1, 0};   // Check for all 8 neighbours of i and j
        int col[] = new int[]{-1, 0, 1, 1, 1, 0, -1, -1};
        
        vis.get(i).set(j, true);
        
        for(int k = 0; k < 8; k++)                          // Checking for all 8 neighbouring sides
        {
            if(isSafe(list, i+row[k], j+col[k], vis, N, M) == true) // checking if node is not visited
                dfs(list, i+row[k], j+col[k], vis, N, M);           // and list[i+row[k]][j+col[k]] is 1, call dfs again
        }
    }
    
}
