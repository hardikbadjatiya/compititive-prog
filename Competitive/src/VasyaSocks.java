
import java.util.Scanner;

public class VasyaSocks {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int n=sc.nextInt();
   int m=sc.nextInt();
   int x=0;
  for(int i=1;i<=n;i++)
  {
      if(i%m==0)
      {
          ++n;
      }
  }
   System.out.println(n);
}
    
}
