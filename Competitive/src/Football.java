
import java.util.Arrays;
import java.util.Scanner;

public class Football {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int n=sc.nextInt();
  int  ar[]=new int[n];
  String st1;
  String st2=new String();
   for(int i=0;i<n;i++)
   {
       ar[i]=sc.nextInt();
       
   }
   Arrays.sort(ar);
  int x=1;
  
    int max=1;
   for(int i=0;i<n-1;i++)
   {
    if(ar[i+1]==ar[i])
    {
        ++x;
        
    }
    else
    {
        if(x>max)
        {
            max=x;
            x=1;
        }
        x=1;
        
    }
}
    System.out.println(Math.max(x, max));
   
   }
    
}
