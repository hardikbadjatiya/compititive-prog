
import static java.lang.System.out;
import java.util.ArrayList;
import java.util.Scanner;

public class ert {
    static long gcd(long a,long b)
    {
        if(a==0)
            return b;
        else
            return gcd(b%a,a);
    }
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   long n=sc.nextLong();
   int w=1;
   int q=1;
   int x=0;
   int y=0;
   ArrayList <Long > l1=new ArrayList<Long>();
   
   for(long i=4;i<=n;i++)
   {
     String s=""+i;
       s=s.replaceAll("7", "");
       s=s.replaceAll("4", "");
     
     if(s.length()==0){
         l1.add(i);
     }
     
         }
   int l=l1.size();
   for(int i=0;i<l1.size()-1;i++)
   {
       for(int j=i+1;j<l1.size();j++)
       {
      long h=l1.get(i);
      long g=l1.get(j);
      long er=gcd(h, g);
      if(er==1)
      {
          ++x;
      }
       }
   }
    System.out.println(x);
}
    
}
