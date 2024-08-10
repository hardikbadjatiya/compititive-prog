
import java.util.Scanner;

public class Game {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   int m=sc.nextInt();
   int a=sc.nextInt();
   int b=sc.nextInt();
   
   if(n==m)
   {
       System.out.println("Second");
       System.exit(0);
   }
    if(a==b)
    {
        if(n>m)
        {
            System.out.println("First");
        }
        if(n<m)
        {
            System.out.println("Second");
        }
    }
       if(a>b)
       {
       if(n>m)
        {
            System.out.println("First");
        }
        if(n<m)
        {
            System.out.println("Second");
        }
       }
       if(b>a)
       {
       if(n>m)
        {
            System.out.println("First");
        }
        if(n<m)
        {
            System.out.println("Second");
        }
       }
   
   
   
}
        
}
