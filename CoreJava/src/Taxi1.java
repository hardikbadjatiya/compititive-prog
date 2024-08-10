
import java.util.Scanner;

public class Taxi1 {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   int ar[]=new int[n];
   int a=0;
   int b=0;
   int c=0;
   int d=0;
   int e=0;
   int sum=0;
   for(int i=0;i< n;i++)
   {
      ar[i]=sc.nextInt();
      sum=sum+ar[i];
      if(ar[i]==1)
      {
         a=a+1;
      }
      else if(ar[i]==2)
      {
          b=b+1;
          
      }
    else  if(ar[i]==3)
      {
          c=c+1;
      }
    else if(ar[i]==4)
      {
          d=d+1;
      }
     
      
      
   }
    int l=Math.max(0, a-c);
    int m=(l+b*2+3)/4;
    System.out.println(d+c+m);

}
    
}
