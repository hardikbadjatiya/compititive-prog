
import java.util.Arrays;
import java.util.Scanner;

public class Code123 {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int k=sc.nextInt();
while(k-->0)
{
   int n=sc.nextInt();
  int l=sc.nextInt();
  int ar[]=new int[n];
  int br[]=new int[n];
  
  int w=0;
   for(int i=0;i<n;i++)
   {
       ar[i]=sc.nextInt();
   w=w+ar[i];
   }
   for(int i=0;i<n;i++)
   {
       br[i]=sc.nextInt();
       
   }
   Arrays.sort(ar);
   Arrays.sort(br);
   
       for(int i=0;i<n;i++)
       {
           int x=0;
           if(ar[i]<br[n-i-1]&&l>0)
           {
               x=1;
               l--;
               w=w-ar[i];
               w=w+br[n-i-1];
           }
           if(l==0||x==0)
           {
               break;
           }
       }
       System.out.println(w);
}
}   
}
