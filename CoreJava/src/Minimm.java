
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Minimm {
public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
   int t=sc.nextInt();
   for(int p=0;p<t;p++)
   {
       int n=sc.nextInt();
      int l[]=new int[n];
       long ar[]=new long[n];
       String st[]=new String[n];
           ar[0]=sc.nextLong();
           st[0]=Integer.toBinaryString((int)ar[0]);
       l[0]=st[0].length();
      long min=10000;
      long mi=1000;
       for(int i=1;i<n;i++)
       {
           ar[i]=sc.nextLong();
         
           st[i]=Integer.toBinaryString((int)ar[i]);
       l[i]=st[i].length();
       if(Math.abs(ar[i]-ar[i-1])<mi)
       {
           mi=ar[i]-ar[i-1];
       }
       }
       for(int i=1;i<n;i++)
       {
        if(l[i]==l[i-1])
       {
      if(min>ar[i]-ar[i-1])
      {
          min=ar[i]-ar[i-1];
      if(min==mi||min==1)
      {
          break;
      }
      }
       }
       }
         System.out.println(min);
}
}    
}
