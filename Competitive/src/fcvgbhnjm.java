
import java.util.Scanner;

public class fcvgbhnjm {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int n=sc.nextInt();
    String st=sc.next();
    
   int a=0;
   int b=0;
   int c=0;
   int z=0;
 
   for(int i=0;i<n;i++)
  {
     if(st.charAt(i)=='A')
    {
         a=a+1;
        int p=0;
        if(z!=0)
      {
        p=1;
        z = 0;
        int l=c/2;
        a =a+l; 
        b=b+l;
      }
        if(p==0)
        {
         a=a+c;
        }
      c=0;
    }
    if(st.charAt(i)=='-')
    {
        c++;
    }
     if(st.charAt(i)=='B')
    {
      b=b+1;
      int o=0;
      if(z==1)
      {
      o=1;
      b=b+c;
      c=0;
      }
     if(o==0)
     {    
      z=1;
      c=0;
     }
    }
  }
  if(z==1)
  {
      b=b+c;
  } 
  
   if(b>a)
   { 
       System.out.println("B");
   }
  if(a>b)
  {
      System.out.println("A");
  }
   if(a==b)
   {
    System.out.println("Coalition government");
   }
   
}
    
}
