
import java.util.Scanner;

public class Ribbon {
public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
      int t=sc.nextInt();
      for(int k=0;k<t;k++)
      {
          int n=sc.nextInt();
          int p=n;
          int l=sc.nextInt();
          int x=0;
        if(n==2)
              {
                  System.out.println("1");
              }
        else{
          for(int i=2;i<=l;i++)
        {
              if(i%2==0&&n%i==0)
              {
                 ++x;
              }
              if(i%2==0&&(p-i)%2==0&&(p-i!=i))
              {
                  ++x;
              }
          }
          System.out.println(x);
      }}
}

    
}
