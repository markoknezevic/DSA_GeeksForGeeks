{
import java.util.*;
class Celebrity_Problem
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			int N = sc.nextInt();
			int M[][] = new int[N][N];
			for(int i=0; i<N; i++)
			{
				for(int j=0; j<N; j++)
				{
					M[i][j] = sc.nextInt();
				}
			}
		System.out.println(new Celebrity().getId(M,N));
		t--;
		}
	}
}

}
/*This is a function problem.You only need to complete the function given below*/

class Celebrity
{
    // The task is to complete this function
    int getId(int M[][], int n)
    {
        Stack<Integer> st = new Stack<Integer>();
        
        for(int i=0;i<n;i++){
            st.push(i);
        }
        
        
        while(st.size() != 1){
            int a = st.pop();
            int b = st.pop();
         if(M[a][b] == 1){
            st.push(b);
         }else{
             st.push(a);
         }
        }
        int cel=st.peek();
       
        
        for(int i=0;i<n;i++){
            if((i != cel) && ((M[cel][i] ==1) || (M[i][cel] == 0 )))
                return -1;
        }
        return cel;
    }
}
