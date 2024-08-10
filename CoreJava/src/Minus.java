
import java.util.Scanner;

public class Minus {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int a=sc.nextInt();
   int b=sc.nextInt();
   int x=a-b;
   int o=x+1;
   int p=x-1;
  String s=Integer.toString(p);
  String as=Integer.toString(x);
  String ds=Integer.toString(p);
  if(s.length()==as.length())
  {
          System.out.println(x-1);
  }
  else if(s.length()==as.length()){
          System.out.println(x+1);
      
  }
   
}
    
}
