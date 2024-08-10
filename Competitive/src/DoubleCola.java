
import java.util.Scanner;

public class DoubleCola {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   long n=sc.nextLong();
   long x=n-5;
   long y=(n+1)/2;
   
   if(y==1||y==2||n==1)
   {
       System.out.println("Sheldon");
   }
   else if(y==3||y==4||n==2)
   {
       System.out.println("Leonard");
   }
   else if(y==5||y==6||n==3)
   {
       System.out.println("Penny");
   }else if(y==7||y==8||n==4)
   {
       System.out.println("Rajesh");
   }else if(y==9||y==0||n==5)
   {
       System.out.println("Howard");
   }
       
   

}
    
}
