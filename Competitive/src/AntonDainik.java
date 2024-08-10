
import java.util.Scanner;

public class AntonDainik {
public static void main(String[] args) {
   Scanner sc =new Scanner(System.in);
   int n=sc.nextInt();
   String str=sc.next();
   int x=0;
   int y=0;
   
   
   for(int i=0;i<n;i++)
   {
       if(str.charAt(i)=='A')
       {
           ++x;
       }
       else if(str.charAt(i)=='D')
               {
              ++y;     
               }
       
   }
   if(x>y)
   {
       System.out.println("Anton");
   }
   else if(x<y)
   {
       System.out.println("Danik");
   }
   else
       if(y==x)
       {
           System.out.println("Friendship");
       }
}
        
}
