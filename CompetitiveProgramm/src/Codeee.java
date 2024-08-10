
import java.util.Scanner;

public class Codeee 
{
    public static int primes(int x)
    {
        int as=0;
        for(int i=2;i<=x;i++)
        {
            int a=0;
            for(int j=2;j<=Math.sqrt(i);j++)
            {
                if(i%j==0)
                {
                    a=1;
                    break;
                }
            }
            if(a==0)
            {
                as++;
            }
        }
        return as;
    }
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
     int  t=sc.nextInt();
   while(t-->0)
   {
       int r1=sc.nextInt();
       int r2=sc.nextInt();
        int n=sc.nextInt();
        String st=sc.next();
        int l=st.length();
        int x=0;
        int step=0;
        while(x<(l-1))
        {
        int q=0;
        if(x>2&&x<l-2){
            int w=primes(x+1);
            if((double)(w/(x+1))>=(double)(r1/r2))
            {++step;
                x=x+w;
                if(x==n-1)
                {
                    System.out.println(step);
                    break;
                }
                q=1;
            }
        }
            if(x<l-2&&st.charAt(x+2)=='#'&&q==0)
            {
                q=1;
                x=x+2;
                ++step;
                if(x==n-1)
                {
                    System.out.println(step);
                    break;
                }
            }
            if(x<l-1&&st.charAt(x+1)=='#'&&q==0)
            {
                ++step;
                q=1;
                x=x+1;
            if(x==n-1)
                {
                    System.out.println(step);
                    break;
                }
            }
            
            if(q==0)
            {
                System.out.println("No way");
             break;   
            }
            
        }
        }
}     
}
