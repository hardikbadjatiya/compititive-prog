
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Scanner;

public class VenyaLatterns {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int n=sc.nextInt();
   int l=sc.nextInt();
   double ar[]=new double[n];
   for(int i=0;i<n;i++)
   {
       ar[i]=sc.nextDouble();
   }
   Arrays.sort(ar);
  NumberFormat nf= NumberFormat.getNumberInstance(); 
   nf.setMinimumFractionDigits(10); 
   if(n==1)
   {
       
       System.out.println((nf.format(Math.max(ar[0], (l-ar[0])))).toString().replaceAll(",", ""));     
   }
   else{
   if(ar[0]==0)
   {
       
       double a[]=new double[n-1];
       for(int j=0;j<n-1;j++)
       {
           a[j]=ar[j+1]-ar[j];
           
       }
       Arrays.sort(a);
       double g=(a[n-2])/2;
       System.out.println((nf.format(Math.max(g, (l-ar[n-1])))).toString().replaceAll(",", ""));
   }
   else{
       double a[]=new double[n-1];
       for(int j=0;j<n-1;j++)
       {
           a[j]=ar[j+1]-ar[j];
           
       }
       Arrays.sort(a);
       double x=(a[n-2]/2);
       double y=l-ar[n-1];
      double z=ar[0];
       
       if(x>=y&&x>=z)
       {
           
           System.out.println(nf.format(x).toString().replaceAll(",", ""));
       }
     else  if(y>x&&y>=z)
       {
           System.out.println(nf.format(y).toString().replaceAll(",", ""));
       }
     else{
           System.out.println(nf.format(z).toString().replaceAll(",", ""));
     }
   }
}}
    
}
