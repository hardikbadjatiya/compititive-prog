
import static java.lang.System.out;
import java.text.NumberFormat;
import java.util.Scanner;

public class Orangedrink {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   double ar[]=new double[n];
   double a=0;
   for(int i=0;i<n;i++)
   {
       ar[i]=sc.nextDouble();
       a=a+ar[i];
   }
   double b=a/n;
   
   NumberFormat nf=NumberFormat.getInstance();
   nf.setMinimumFractionDigits(12);
    System.out.println(nf.format(b));
   
}
    
}
