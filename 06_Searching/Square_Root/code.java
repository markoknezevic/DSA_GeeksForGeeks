{
import java.util.Scanner;
class SquartRoot
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			long a = sc.nextInt();
			SquareRoot obj = new SquareRoot();
			System.out.println(obj.floorSqrt(a));
		t--;
		}
	}
}
}
/*This is a function problem.You only need to complete the function given below*/
/*You are required to complete
this function*/
// Function to find square root
// x: element to find square root
class SquareRoot
{
     long floorSqrt(long x)
	 {
 
    int pred=2;
    int sad;
    for(int i=2;i<x;i++){
        sad=i;
        if(sad*sad>x)
            return pred;
        else
            pred=sad;
        
    }
    return -1;
	 }
}
