
import java.util.Scanner;

public class FencyFence {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   int ar[]=new int[n];
   
   for(int i=0;i<n;i++)
   {
       int a=0;
       ar[i]=sc.nextInt();
       for(int j=3;j<10000;j++)
       {
        int x=ar[i];
        int  y=(180-x)*j;
        if(y==360)
        {
           a++;
        }
        
       }
       if(a==1)
        {
            System.out.println("YES");
        }
       else {
           System.out.println("NO");
       }
   }
}
    
}
