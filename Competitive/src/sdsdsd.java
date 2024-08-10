
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class sdsdsd {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int t=sc.nextInt();
   while(t-->0)
   {
       int n=sc.nextInt();
       double ar[]=new double[n];
       double a[]=new double[n];
       double b[]=new double[n];
    
       double u=0;
       double y=0;
       for(int i=0;i<n;i++)
       {
           ar[i]=sc.nextDouble();
           a[i]=sc.nextDouble();
           b[i]=sc.nextDouble();
          u=u+(double)((b[i]*ar[i])/(a[i]+b[i]));
          y=y+(double)((a[i]*ar[i])/(a[i]+b[i]));
       
       }
       System.out.println(u+" "+y);
   }
}
    
}
