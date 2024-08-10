
import java.util.Scanner;

public class gffyrg {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int t=sc.nextInt();
   while(t-->0)
   {
       int n=sc.nextInt();
      long h=0;
      int ar[]=new int[n];
      int a[]=new int[n];
      int c=0;
      int m=0;
      for(int i=0;i<n;i++)
      {
         ar[i]=sc.nextInt();
         a[i]=sc.nextInt();
         String s=""+ar[i];
         int x=0;
         int y=0;
         String e=""+a[i];
         for(int j=0;j<s.length();j++)
          {
             x=x+s.charAt(j)-48;
          }
         for(int j=0;j<e.length();j++)
         {
             y=y+e.charAt(j)-48;
         }
         if(x>y)  
         {
             c++;
         }
         if(x==y)
         {
             c++;
              m++;
         }  
         if(x<y)
         {
             m++;
         }
      
      }
   if(c>m)
   {
       System.out.println("0 "+c);
   }
   if(c==m)
   {
       System.out.println("2 "+c);
   }
   if(c<m)
   {
       System.out.println("1 "+m);
   }
       
   }
}
    
}
