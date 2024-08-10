
import java.util.Scanner;

public class Buttons {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int n=sc.nextInt();
   int x=0;
   for(int i=1;i<=n-1;i++)
   {
       x=x+(n-i)*i;
   }
    System.out.println(x+n);
}
    
}
