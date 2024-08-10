
import java.util.Scanner;

public class asds {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int t=sc.nextInt();
   while(t-->0)
   {
       int n=sc.nextInt();
       int ar[]=new int[n];
       for(int i=0;i<n;i++)
       {
           ar[i]=sc.nextInt();
           
       }
       int x=0;
       l1:   for(int i=0;i<n-2;i++)
       {
             if(ar[i+1]>ar[i]&&ar[i+1]>ar[i+2])
                  {
                      System.out.println("YES");
                      System.out.println((i+1)+" "+(i+2)+" "+(i+3));
                  x=1;
                  break l1;
                  }
              
       }
       if(x==0){
           System.out.println("NO");
       }
   }
}
    
}
