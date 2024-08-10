package EvenPaie;

import java.util.Scanner;

public class primr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
  int t=sc.nextInt();
  for(int p=0;p<t;p++)
  {
      int n=sc.nextInt();
      int o=1000000;
      int x=o/n;
      int r=1;
      int fk=0;
      for(int i=n;i<=x;i++)
      {
          for(int j=2;j<=Math.sqrt(i);j++)
          {
              if(i%j==0)
              {
                  fk=1;
          break;       
              }
          }
          if(fk==0)
          {
              if(n*i<=1000000)
              ++r;
          }
      
      }
      
      System.out.println(r);
  }
    }    
}
