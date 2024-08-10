
import java.util.Scanner;
import java.lang.Math; 
public class Function {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   long n=sc.nextLong();
   long  x=0;
   long y=0;
   
if(n%2==0)
{
    System.out.println(n/2);
    
}
else
{
    x=(n-1)/2;
    y=x-n;
    System.out.println(y);
}
}
}
