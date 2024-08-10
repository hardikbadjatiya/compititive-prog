
import java.util.Scanner;

public class XCBZXNBV {
    public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int n=sc.nextInt();
   String st=sc.next();
   int x=0;
   int y=0;
   int c=0;
   int w=0;
   for(int i=0;i<n;i++)
    {
        if(st.charAt(i)=='-')
        {
            c=c+1;
        }
        if(st.charAt(i)=='B')
        {
           y=y+1;
           int o=0;
           if(w==1)
           {
              o=1;
              int r=c;
              y=y+r;
           }
           if(w!=1)
           {
           w=1;
           }
           if(c!=0)
           {
               c=0;
           }
        }
        if(st.charAt(i)=='A')
        {
            x++;
            int o=0;
            if(w!=0)
            {
               o=1;
               int p=c/2;
                y=y+p;
               x=x+p;
            }
            if(o==0){
                int j=c;
                x=x+j;    
            }
            if(o==1)
            {
              w=0;
            }
        }
    }
   if(w==1)
   {
       y=y+c;
   }
   int u=0;
   if (x>y)
  {
      u=1;
        System.out.println("A");
  }
  if (y>x)
  {
       u=1;
        System.out.println("B");
  }
  if(y==x)
  {
    System.out.println("Coalition government");
  }
  
}
}
