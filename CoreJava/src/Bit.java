
import java.util.Scanner;

public class Bit {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
int n;
n=sc.nextInt();
int X=0;
//String X=new String();
//String (X++)=new String();
String str=String.valueOf(X);
for (int i=0;i<n;i++)
{
 str=sc.next();
  if(str.equals("X++")||str.equals("++X"))
  {
     X=X+1;
      //System.out.println("Hello");
  }
  else
      if(str.equals("X--")||str.equals("--X"))
  {
   X=X-1;
  }
//System.out.println(X);
}
   
System.out.println(X);






}
}
