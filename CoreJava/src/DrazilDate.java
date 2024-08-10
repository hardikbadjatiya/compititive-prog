
import java.util.Scanner;

public class DrazilDate {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   long a=sc.nextLong();
   long b=sc.nextLong();
   long s=sc.nextLong();
   if(a==0&&b==0)
   {
   if(s%2==0)
   {
       System.out.println("YES");
   }
   else{
       System.out.println("NO");
   }
   }
   
   else{
   if((s-(Math.abs(a)+Math.abs(b)))%2==1||s<(Math.abs(a)+Math.abs(b)))
   {
       
       System.out.println("NO");
   }
   else{
       System.out.println("YES");
   }}
}
    
}
