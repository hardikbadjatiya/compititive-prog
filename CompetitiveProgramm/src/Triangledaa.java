
import java.util.Scanner;

public class Triangledaa {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int a=sc.nextInt();
   int b=sc.nextInt();
   int c=sc.nextInt();
  if(a>=b&&a>=c)
  {
      System.out.println(Math.max(a-b-c+1,0));
  }
  if(b>=c&&b>a)
  {
      System.out.println(Math.max(b-a-c+1,0));
  }if(c>b&&c>a)
  {
      System.out.println(Math.max(c-b-a+1,0));
  }
}
    
}
