
import java.util.Scanner;

public class er {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int t=sc.nextInt();
   while(t-->0)
   {
       long n=sc.nextInt();
       if(n%4==0)
       {
           System.out.println("YES");
           
       }
       else{
           System.out.println("NO");
       }
   }
}
    
}
