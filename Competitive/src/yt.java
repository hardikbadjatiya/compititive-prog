
import java.util.Scanner;

public class yt {
    static int che(int x,int n)
    {
        int y=0;
        while(x<=n)
        {
            
                x=2*x+1;
                if(x<=n)
                {    
                ++y;
                }
                
            
        }
        return y;
    }
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int t=sc.nextInt();
   while(t-->0)
   {
       int n=sc.nextInt();
       int x=0;
      
       for(int i=1;i<n;i++)
       {
           if(i%2==1)
           {
               x=x+che(i, n);
           }
       }
       
   
    System.out.println(x);
}
}
    
}
