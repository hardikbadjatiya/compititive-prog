
import java.util.Scanner;

public class PolycarBirthday {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
    
   for(int i=0;i<n;i++)
   {
       long x=sc.nextLong();
       long q=0;
       if(x<=9)
       {
           q=x;
       }
       String st=Long.toString(x);
       int l=st.length();
       int k=9*(l-1);
       String p=new String("9");
       for(int j=0;j<l-2;j++)
       {
           p=p+9;
       }
       long var = Long. parseLong(p);
     for(long o=var+1;o<=x;o++)
       {
           String pi=Long.toString(o);
           int r=pi.length();
           int e=0;
           for(int v=0;v<r-1;v++)
           {
               if(pi.charAt(v+1)!=pi.charAt(v))
               {
                   e=1;
                   break;
                    
               }
           }
           if(e==0)
           {
      ++k;         
           }
       }
       System.out.println(Math.max(0, k+q));
   }
   
}
    
}
