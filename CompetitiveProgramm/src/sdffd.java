
import java.util.Scanner;

public class sdffd {
    static int focal_length(int R, char Mirror)
{
   if(Mirror=='(')
   {
      return R/2;
   }
      return (0-(R+1)/2);
   
   
}
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int n=sc.nextInt();
   String st[]=new String[n];
   for(int i=0;i<=n-1;i++)
  {
      st[i]="";
  for(int j=1;j<=i+1;j++)
  {
     st[i]=st[i]+j+" "; 
  }
  for(int j=i;j>=1;j--)
  {
      st[i]=st[i]+j+" ";
  }
      System.out.println(st[i]);
  }
   for(int i=n-2;i>=0;i--)
   {
       System.out.println(st[i]);
   }
}
}
