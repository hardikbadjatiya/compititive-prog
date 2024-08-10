
import java.util.Scanner;

public class Sticsgame {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int m=sc.nextInt();
   int n=sc.nextInt();
   if(n==1||m==1)
   {
       System.out.println("Akshat");
   }
   else if(n>=m)
   {
       if(m%2==0)
       System.out.println("Malvika");
       else
           System.out.println("Akshat");
   }
   else if(m>=n)
   {
       if(n%2==0)
       System.out.println("Malvika");
   else
           System.out.println("Akshat");
   }
}  
}
