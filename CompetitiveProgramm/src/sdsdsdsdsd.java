
import java.util.Scanner;

public class sdsdsdsdsd {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
   int t=sc.nextInt();
  for(int p=0;p<t;p++)
   {
       int n=sc.nextInt();
       int k=sc.nextInt();
       int ar[]=new int[n];
       for(int i=0;i<n;i++)
       {
           ar[i]=sc.nextInt();
       }
      int  r=0;
       for(int i=0;i<=n-k;i++)
       {
       if(ar[i]==k)
       {
           int  y=0;
             int w=k;
           for(int j=i;j<i+k;j++)
           {
             
           if(ar[j]==w)
           {
               w--;
               ++y;
           }
           else{
               break;
           }
           }
           if(y==k)
           {
               ++r;
           }
       }
       }
             System.out.println("Case #"+(p+1)+": "+r);
 
   }
}

}
