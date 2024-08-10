
import java.util.Scanner;

public class Test3 {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int t=sc.nextInt();
   while(t-->0)
   {
       int n=sc.nextInt();
        int ar[]=new int[n];
        int g=0;
        int o=0;
        int e=0;
        for(int i=0;i<n;i++)
        {
            ar[i]=sc.nextInt();
            if(ar[i]%2!=i%2)
            {
                if(ar[i]%2==0)
                {
                ++e;    
                }
                else{
                   ++o; 
                }
                
            }
            else{
                ++g;
            }
        }
        int x=0;
        if(o+e==0)
        {
            x=0;
        }
        if(o==e&&o>0)
        {
            x=o;
        }
        if(o!=e)
        {
            x=-1;
        }
           System.out.println(x); 
        
   }
}
    
}
