
import java.util.Scanner;

public class asdasdasdsdfg {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int t=sc.nextInt();
   while(t-->0)
   {
       long a=sc.nextInt();
       long b=sc.nextInt();
       
       long p=b/4+b/2+b%2-a/2-(a-1)/4;
       
       System.out.println(p);
   }
}
    
}
