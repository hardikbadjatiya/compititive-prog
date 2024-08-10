
import java.util.Scanner;


public class GregWorkout {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   int x=0;
   int y=0;
   int z=0;
   int ar[]=new int[n];
   for(int i=0;i<n;i++)
   {
       ar[i]=sc.nextInt();
       if(i%3==0)
       {
           x=x+ar[i];
       }
       if(i%3==1)
       {
           y=y+ar[i];
       }
       if(i%3==2)
       {
           z=z+ar[i];
       }
   }
   if(x>y&&x>z)
   {
       System.out.println("chest");
   }
   if(y>x&&y>z)
   {
       System.out.println("biceps");
   }
   if(z>y&&z>x)
   {
       System.out.println("back");
   }
   
}
    
}
