
import java.util.Scanner;

public class Flipping {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   int y=-1;
   int z=0;
   int ones=0;
   for(int i=0;i<n;i++)
   {
       int x=sc.nextInt();
       
       if(x==1)
    {
        if(z>0)
        {
            z--;
        }
        ones++;
    }
       
       else{
           z++;
           if(z>y)
           {
               y=z;
           }
       }
       
   }
   System.out.println(ones+y);
}
    
}
