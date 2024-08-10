
import java.util.Scanner;

public class AntonDigits {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int k2=sc.nextInt();
   int k3=sc.nextInt();
   int k5=sc.nextInt();
   int k6=sc.nextInt();
   int x=0;
   int z=0;
   if(k2>=k5&&k2>=k6)
   {
    
       x=Math.min(k5, k6);
      z=(x*256)+(32)*(Math.min(k3, k2-x));
      
   }
   else if(k5>k2&&k5>=k6)
   {
      x=Math.min(k2, k6);
      z=(x*256)+(32)*(Math.min(k3, k2-x));
        
   }
   else if(k6>k2&&k6>k5)
   {
      x=Math.min(k2, k5);
      z=(x*256)+(32)*(Math.min(k3, k2-x));
        
   }
    System.out.println(z);
}
}
