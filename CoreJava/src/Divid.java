
import java.util.Scanner;

public class Divid {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int t=sc.nextInt();
   for(int p=0;p<t;p++)
   {
  long a=sc.nextInt();
  long b=sc.nextInt();
  long x=a%b;
  if(x==0)
  {
       System.out.println(x);
  
  }
  else{
      System.out.println(b-x);
  }
      
}
}
        
}
