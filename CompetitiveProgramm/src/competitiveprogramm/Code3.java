package competitiveprogramm;

import java.util.Scanner;

public class Code3 {
    static int gcd(int a, int b)
 {
     if(a==0)
         return b;
     else
         return gcd(b%a,a);
 }
 public static void main(String[] args) {

    Scanner sc=new Scanner(System.in);
     int t=sc.nextInt();
   
     for(int k=0;k<t;k++)
   {
       int n=sc.nextInt();
       int ar[]=new int[n];
       for(int i=0;i<n;i++)
       {
           ar[i]=i+1;
       }
       int x=0;
       String st=new  String();
       String stt="1 2";
       int y=2;
       for(int i=2;i<n;i++)
       {
           int e=0;
           for(int j=2;j<=Math.sqrt(ar[i]);j++)
           {
               if(ar[i]%j==0)
               {
                   e=1;
                   break;
               }
           }
           if(e==0)
           {y++;
               stt=stt+" "+ar[i];
           }
       }
       
     stt=y+" "+stt;
       System.out.println(stt);
       st=""+stt;
       for(int i=4;i<n;i++)
       {
           String s=" "+ar[i]+" ";
           if(st.contains(s)!=true)
           {
               
               
           }
               
       }
   }
 }
}
