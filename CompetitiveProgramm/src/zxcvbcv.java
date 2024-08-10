
import java.util.Scanner;

public class zxcvbcv {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int t=sc.nextInt();
   while(t-->0)
   {
      int n=sc.nextInt();
      int ar[]=new int[n];
      for(int i=0;i<n;i++)
      {
        ar[i]=sc.nextInt();
        
        }
      int a=0;
      int b=0;
      int m=0;
      String st=" ";
      int ap=0;
      int bp=0;
          int z=n-1;
       int w=0;
      
      for(int i=w;i<=z;i++)
         {
          int x=0;
          int y=0;
         for(int j=0;j<n;j++)
         {
             String s=" "+j+" ";
          if(st.contains(s)!=true)
         {
             
      ap=ap+ar[j];
      
      st=st+" "+j+" ";
      if(ap>bp)
      {
          x=1;
          ++m;
          a=a+ap;
          w=j;
          bp=0;
          break;
      }
      if(j==z-1&&ap<=bp)
      {
          m=m+1;
          a=a+ap;
      }
       }
          
      }
          for(int j=z;j>=w;j--)
      {
      String s=" "+j+" ";
          if(st.contains(s)!=true)
          {
              bp=bp+ar[j];
      st=st+" "+j+" ";
      if(bp>ap)
      {
          y=1;
          z=j;
       ++m;  
       b=b+bp;
          ap=0;
          break;
      }
          }
      }
      if(x==0&&y==0)
      {
         break;
      }
      int xp=0;
      if(x==0&&y==1)
      {
         if(z==0)
         {
             z=n;
         }
         for(int j=w+1;j<z;j++)
         {
                 xp=1;
                 a=a+ar[j];
         }
      }
      if(x==1&&y==0)
      {
       
          if(z==0)
         {
             z=n;
         }
         for(int j=w+1;j<z;j++)
         {
             xp=1;
             b=b+ar[j];
         }
      }
       m=m+xp;
      }
       System.out.println(m+" "+a+" "+b);
   }
}
}
