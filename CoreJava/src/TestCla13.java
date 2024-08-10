
import java.util.Arrays;
import java.util.Scanner;

public class TestCla13 {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int t=sc.nextInt();
 for(int k=0;k<t;k++)
   {
    int n=sc.nextInt();
    long x=sc.nextLong();
    long d[]=new long[n];
    long h[]=new long[n];
    
    for(int i=0;i<n;i++)
    {
        d[i]=sc.nextLong();
        h[i]=sc.nextLong();
    }
       System.out.println(x+" "+n);
   System.out.println(Arrays.toString(h)+" "+Arrays.toString(d));
       System.out.println("yhs");    
    int l=0;
    int o=0;
     for(int i=0;i<n;i++)
     {  
     System.out.println(x);
     if(x>0)
     {
     x=x-d[i];
     if(x>0)
     {
         ++l;
           x=x+h[i];
     }
     if(x<=0)
    {
        break;
    } 
     
     }
    }
           System.out.println(l+" k"+k);

   }
}    
}
