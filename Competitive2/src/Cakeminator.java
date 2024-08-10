
import java.util.Scanner;

public class Cakeminator {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int n=sc.nextInt();
   int m=sc.nextInt();
   int a=(int)Math.sqrt(n);
   int b=(int)Math.sqrt(m);
   int x=0;
   for(int i=a;i>=0;i--)

   {
       for(int j=0;j<=b;j++)
       {
           if((i+(j*j)==n&&(i*i)+j==m)||(i+(j*j)==m&&(i*i)+j==n))
           {
              ++x; 
           }
           
       }
   }
    System.out.println(x);
}
    
}
