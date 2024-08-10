
import java.util.Scanner;

public class VanyaCubes {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int n=sc.nextInt();
   int z=0;
   int x=0;
   int a=0;
   for(int i=1;i<=n;i++)
   {
       x=x+i;
       z=z+x;
       if(z<=n)
       {
           ++a;
       }
       else if(z>a)
       {
           break;
       }
   }
    System.out.println(a);
}
    
}
