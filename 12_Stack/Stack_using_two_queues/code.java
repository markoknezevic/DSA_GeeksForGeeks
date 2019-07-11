{
import java.util.*;
class StackUsingQueues
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			Queues g = new Queues();
			
			int q = sc.nextInt();
			while(q>0)
			{
				int QueryType = sc.nextInt();
				if(QueryType == 1)
				{
					int a = sc.nextInt();
					g.push(a);
				}
				else if(QueryType == 2)
				System.out.print(g.pop()+" ");
			q--;
			}	
			System.out.println();
				
			
			
		t--;
		}
	}
}

}
/*This is a function problem.You only need to complete the function given below*/

class Queues
{
    Queue<Integer> q1 = new LinkedList<Integer>();
    Queue<Integer> q2 = new LinkedList<Integer>();
    
    /*The method pop which return the element poped out of the stack*/
    int pop()
    {
        if(q1.size() != 0){
	        return q1.remove();
        }else{
            return -1;
        }
    }
	
    /* The method push to push element into the stack */
    void push(int a)
    {
	   q2.add(a);
	   while(q1.size() != 0){
	       q2.add(q1.remove());
	   }
	   Queue<Integer> p = q1;
	   q1=q2;
	   q2=p;
    }
}
