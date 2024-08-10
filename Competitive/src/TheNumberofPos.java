
import java.util.Scanner;

public class TheNumberofPos {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int n=sc.nextInt();
   int b=sc.nextInt();
   int ar[]=new int[n];
   int s=0;
   for(int i=0;i<n;i++)
  {
      ar[i]=sc.nextInt();
      s=s+ar[i];
  }
   
  int y=s+(n-1)*10;
  
  if(y<b)
  {
      System.out.println(((n-1)*2)+(b-y)/5);
  }
  if(y==b)
      {
          System.out.println(2*(n-1));
      }
  else if(y-b>0)
      {
                  System.out.println("-1");
      }
}
    
}
