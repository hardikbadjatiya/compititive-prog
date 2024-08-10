
import java.util.ArrayList;
import java.util.Scanner;

public class erw {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
       long n=sc.nextLong();
       ArrayList <Long> l1= new ArrayList<Long>();
       long y=1;
       while(n>0)
       {
           int x=0;
       for(long i=2;i<=Math.sqrt(n);i++)
          {
              
              if(n%i==0)
              {
                  x=1;
                  l1.add(i);
               n=n/i;
                  
               if(l1.size()>10)
                  {
                      l1.add(n);
                      x=0;
                      break;
                  }
               
              }
      }
       
       if(x==0)
       {
           l1.add(n);
           break;
       }
       }
       int p=l1.size();
       if(p<=10)
       {
        String s="codeforces";
        String st="";
        for(int i=0;i<l1.size();i++)
        {
           for(int j=0;j<l1.get(i);j++)
           {
               st=st+s.charAt(i);
           }
           
        }
        for(int i=l1.size();i<10;i++)
        {
          st=st+s.charAt(i);
        }
           System.out.println(st);
       }
       if(p>10)
       {
           long r=1;
        for(int i=9;i<l1.size();i++)
        {
            r=r*l1.get(i);
        }
        String s="codeforces";
        String st="";
        for(int i=0;i<9;i++)
        {
           for(int j=0;j<l1.get(i);j++)
           {
               st=st+s.charAt(i);
           }
           
        }
        for(int i=0;i<r;i++)
        {
            st=st+"s";
        }
           System.out.println(st);
        
       }
       System.out.println(l1);
}
    
}
