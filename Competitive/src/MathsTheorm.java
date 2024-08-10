
import java.util.Scanner;

public class MathsTheorm {
  
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int x=sc.nextInt();
   
   
     for(int i=4;i<x;i++)
     {
         int a=i;int b=x-i;
         int c=0;
         int d=0;
         for(int j=2;j<a;j++)
         {
        if(a%j==0)
        {
        ++c;
        break;
        }
         }
         for(int j=2;j<b;j++)
         {
        if(b%j==0)
        {
            ++d;
            break;
        }
         }
     if(c==1&&d==1)
     {
         System.out.println(a+" "+b);
         System.exit(0);
     }
     }
}
    
}
