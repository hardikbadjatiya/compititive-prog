
import java.util.Arrays;
import java.util.Scanner;

public class ssdsd {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   int x[]=new int[n];
   int y[]=new int[n];
   for(int i=0;i<n;i++)
   {
       x[i]=sc.nextInt();
       y[i]=sc.nextInt();
   
   }
  int u=(n/2);
  int a=0;
  
  for(int i=0;i<n;i++)
  {
      int o=Math.max(y[u], y[i])-Math.min(y[u], y[i]);
      a=u+o;
      int w=Math.max(x[i], x[u]-(u-i))-Math.min(x[i], x[u]-(u-i));
      a=u+w;
  }
  
    System.out.println(a);
}
    
}
