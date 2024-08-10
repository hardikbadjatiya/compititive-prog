
import java.util.Scanner;

public class Sca 
{
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int t=sc.nextInt();
   while(t-->0)
   {
    int n=sc.nextInt();
    int m=sc.nextInt();
    char o=sc.next().charAt(0);
    String e=Integer.toBinaryString(n);
    int j=e.length();
    int y=16-j;
    String s="";
            for(int i=0;i<y;i++)
    {
        s=s+"0";
    }
            e=s+""+e;
            String q=e;
            String a=e;
            
            if(o=='L')
            {
                
                String left=q.substring(0,m);
                String right=a.substring(m,16);
                String w=right+""+left;
            long qw=Long.parseLong(w, 2);
                System.out.println(qw);
                
            }
            if(o=='R')
            {
                String left=q.substring(0,16-m);
                String right=a.substring(16-m,16);
                String w=right+""+left;
            long qw=Long.parseLong(w, 2);
                System.out.println(qw);
           }
            
   }
}

  
}
