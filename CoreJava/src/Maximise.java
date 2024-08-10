
import java.util.Scanner;

public class Maximise {
    static int gcd(int a, int b)
    {
        if(a==0)
        {
            return b;
        }
        else
            return gcd(b%a,a);
    }
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int t=sc.nextInt();
   for(int d=0;d<t;d++)
   {
  int n=sc.nextInt();
  int x=sc.nextInt();
  int ar[]=new int[n];
  int q=1;
  int r=1;
  String st=new String();
  for(int i=0;i<n;i++)
  {
      ar[i]=sc.nextInt();
      q=gcd(r,ar[i]);
      r=r*ar[i]/q;
      st=st+" "+ar[i]+" ";
  }
  int max=1;
      int a=1;
      int po=1;
      for(int i=1;i<=x;i++)
      {
      int we=0;
      if(st.contains(Integer.toString(i)))
      {
       we=1;
      }
      if(we==0)
      {
       a=gcd(i,r);
       int s=(i*r)/a;
       if(s>max)
      {
          max=s;
         po=i;
         
      }
      }
      }
       System.out.println(po);
   }
}

    
}
