
import java.util.Scanner;

public class Beautifulyear {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
//   int n=x+1;
   int a=0,b=0,c=0,d=0;
   while(n>1)
   {
       ++n;
       a=n%10;
    b=(n/10)%10;
        
    c=(n/100)%10;
    d=(n)/1000;
//System.out.println(a+""+b+""+c+""+d);

 if(a!=b&&a!=c&&a!=d&&b!=c&&b!=d&&c!=d)
 {
//     System.out.println(d+""+c+""+b+""+(a)); 
     System.out.println(n);
     break;
 }
   }
//   }

}
    
}
