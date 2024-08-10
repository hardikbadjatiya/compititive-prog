
import java.util.Scanner;

public class weewwe {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int t=sc.nextInt();
   while(t-->0)
   {
       int n=sc.nextInt();
       int ar[]=new int[n];
       int q=0;
       int x=0;
       for(int i=0;i<n;i++)
       {
           ar[i]=sc.nextInt();
           if(ar[i]==1&&x==0&&i!=n-1)
           {
               ++q;
           }
           if(ar[i]>1&&i!=n-1){
               ++x;
           }
       }
       if(q%2==0)
       {
           System.out.println("First");
       }
       else{
           System.out.println("Second");
       }
   }
}
    
}
