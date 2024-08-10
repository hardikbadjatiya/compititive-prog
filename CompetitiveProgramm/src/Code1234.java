
import java.util.Scanner;

public class Code1234 {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int k=sc.nextInt();
while(k-->0)
{
   int n=sc.nextInt();
   long l=n;
   long y=n/2;
   long q=0;
   
   while(n>=3)
   {
       q=q+(n*n-(n-2)*(n-2))*y;
       n=n-2;
       y--;
   }
    System.out.println(q);
}
}   
}
