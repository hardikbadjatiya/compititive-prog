
import java.util.Scanner;

public class New {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
   int r=sc.nextInt();
  if(r<=6)
  { 
   long n=(long)Math.pow(10,r-1);
  
   long e=(long)n/21;
    System.out.println((e+1)*21);
  }
  if(r>=1000)
  {
    String st="0000000000";
    String s="1";

      int k=r/6;
    int p=r%6;
    int e=(r-3)/10;
    int o=(r-3)%10;
    for(int i=0;i<o;i++)
    {
        s=s+"0";
    }
    
    if(p==1)
    {
       
        for(int i=0;i<e;i++)
        {
            s=s+st;
        }
        System.out.println(s+""+20);
    }
    if(p==2)
    {
        for(int i=0;i<e;i++)
        {
            s=s+st;
        }
        System.out.println(s+""+11);
    }
    if(p==3)
    {
        for(int i=0;i<e;i++)
        {
            s=s+st;
        }
        System.out.println(s+""+"05");
    }
    if(p==4)
    {
        for(int i=0;i<e;i++)
        {
            s=s+st;
        }
        System.out.println(s+""+"08");
    }
    if(p==5)
    {
            for(int i=0;i<e;i++)
        {
            s=s+st;
        }
        System.out.println(s+""+17);
    
    }
if(p==0)
    {
            for(int i=0;i<e;i++)
        {
            s=s+st;
        }
        System.out.println(s+""+"02");
    
    }  
  }
  else{
    String st="0";
    String s="1";

      int k=r/6;
    int p=r%6;
    if(p==1)
    {
        for(int i=0;i<r-3;i++)
        {
            s=s+st;
        }
        System.out.println(s+""+20);
    }
    if(p==2)
    {
        for(int i=0;i<r-3;i++)
        {
            s=s+st;
        }
        System.out.println(s+""+11);
    }
    if(p==3)
    {
        for(int i=0;i<r-3;i++)
        {
            s=s+st;
        }
        System.out.println(s+""+"05");
    }
    if(p==4)
    {
        for(int i=0;i<r-3;i++)
        {
            s=s+st;
        }
        System.out.println(s+""+"08");
    }
    if(p==5)
    {
            for(int i=0;i<r-3;i++)
        {
            s=s+st;
        }
        System.out.println(s+""+17);
    
    }
if(p==0)
    {
            for(int i=0;i<r-3;i++)
        {
            s=s+st;
        }
        System.out.println(s+""+"02");
    
    }  
  }  
}
    
}
