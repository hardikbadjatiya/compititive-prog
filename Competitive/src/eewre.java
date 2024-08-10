
import java.util.Scanner;

public class eewre {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int t=sc.nextInt();
   while(t-->0)
   {
       int a=sc.nextInt();
       int b=sc.nextInt();
       int c=sc.nextInt();
       int d=sc.nextInt();
       int x=a%2+b%2+c%2+d%2;
       if(x<=1)
       {
           System.out.println("Yes");
       continue;
       
       }
      else if(x>=3&&a>0&&b>0&&c>0)
      {
          System.out.println("Yes");
      continue;
      }
      else{
           System.out.println("No");
       }
   }
}
    
}
