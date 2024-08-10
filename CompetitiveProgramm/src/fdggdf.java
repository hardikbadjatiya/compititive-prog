
import java.util.Scanner;

public class fdggdf {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int k=sc.nextInt();
while(k-->0)
{
   int n=sc.nextInt();
   int m=sc.nextInt();
   int x=n/m;
   int g=1;
   if(n==2)
   {
       g=0;
       System.out.println(m);
   }
   if(n==1&&g==1)
   {
       g=0;
       System.out.println(0);
   }
   if(n==m&&g==1)
   {
       g=0;
       System.out.println(2*m);
   }
   else if(g==0){
       System.out.println(2*m);
   }
}
}   
}
