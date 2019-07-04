{
import java.util.*;
import java.io.*;
import java.lang.*;
class gfg
{
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- >0)
        {
            int hash_size = sc.nextInt();
            int array_size = sc.nextInt();
            
            int arr[] = new int[array_size];
            
            for(int i = 0; i < array_size; i++)
             arr[i] = sc.nextInt();
             
            int hash_table[] = new int[hash_size];
            
            for(int i = 0; i < hash_size; i++)
             hash_table[i] = -1;
             
            quadraticProbing(hash_table, hash_size, arr, array_size);
            
            for(int i = 0; i <hash_size; i++)
             System.out.print(hash_table[i] + " ");
             
             System.out.println();
             
        }
    }
    
    //Position this line where user code will be pasted.
}
}
/*This is a function problem.You only need to complete the function given below*/
static void quadraticProbing(int hash_table[], int hash_size, int arr[], int array_size)
{
     for(int i=0;i<array_size;i++){
        int k=arr[i]%hash_size;
        
        if(hash_table[k]==-1){
            hash_table[k]=arr[i];
        }else{
            for(int j=1;j<hash_size;j++){
                int l=(arr[i]+(int)Math.pow(j,2)) % hash_size;
                if(hash_table[l]==-1){
                    hash_table[l]=arr[i];
                    break;
            }
        }
    }
    }
}