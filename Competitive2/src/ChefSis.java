
import java.util.Scanner;

public class ChefSis {
    static int prime(int x)
    {
        int p=x;
        int k=0;
        int f=(int)Math.sqrt(x);
        for(int i=2;i<=f;i++)
        {
            if(p%i==0)
            {
                k=1;
                break;
            }
            
        }
        return k;
    }
public static void main(String[] args) {
      Scanner sc=new Scanner (System.in);
  int t=sc.nextInt();
  for(int k=0;k<t;k++)
  {
      int n=sc.nextInt();
      int ar[]=new int[n];
      for(int i=0;i<n;i++)
   {
   ar[i]=sc.nextInt();
   
   }
      int x=0;
      int y=0;
      for(int i=0;i<n-1;i++)
      {
          for(int j=i+1;j<n;j++)
          {
             x=ar[i]+ar[j];
             int o=ChefSis.prime(x);
if(o==0)
{
  ++y;
}
          }
           }
      System.out.println(y);
       
      
           }}
    
}
