
import java.util.Arrays;
import java.util.Scanner;

public class Minimum {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int t=sc.nextInt();
   for(int p=0;p<t;p++)
   {
       int n=sc.nextInt();
      int l[]=new int[n];
       long ar[]=new long[n];
       String st[]=new String[n];
       for(int i=0;i<n;i++)
       {
           ar[i]=sc.nextLong();
           st[i]=Integer.toBinaryString((int)ar[i]);
       l[i]=st[i].length();
       }
       Arrays.sort(l);
       int x=l[n-1];
       for(int i=0;i<n;i++)
       {
           st[i] = String.format("%030d" , Integer.parseInt(st[i]));
           System.out.println(st[i]);
       }
       
       for(int i=0;i<n-1;i++)
       {
           for(int j=i+1;j<n;j++)
           {
               
           }
       }
      
   }
   
}
    
}
