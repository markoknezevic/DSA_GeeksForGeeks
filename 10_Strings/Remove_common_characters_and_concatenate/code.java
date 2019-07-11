{
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        
        while(t--!=0){
            String s1=in.next(),
                   s2=in.next();
            
            RemoveCommon obj = new RemoveCommon();
            
            System.out.println(obj.concatenatedString(s1,s2));
        }
    }
}

}
/*This is a function problem.You only need to complete the function given below*/

class RemoveCommon{
    
    // Function which concatenate two strings
    // after removing common characters
    public static String concatenatedString(String s1,String s2){
        
     LinkedHashMap<Character,Integer> set1 =new LinkedHashMap<Character,Integer>();
     String fin ="";
     
     for(int i=0;i<s2.length();i++){
         set1.put(s2.charAt(i),1);
     }
     
     for(int i=0;i<s1.length();i++){
        if(set1.containsKey(s1.charAt(i)) != true){
            fin+=s1.charAt(i);
           
        }else{
             set1.put(s1.charAt(i),2);
        }
     }
    
    
    for(int i=0;i<s2.length();i++){
        if(set1.get(s2.charAt(i))==1)
        fin+=s2.charAt(i);
    }
    
     
    
     
     
    if(fin == ""){
        return "-1";
    }
     return fin;
    }
}