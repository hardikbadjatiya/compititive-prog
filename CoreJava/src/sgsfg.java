
import java.util.Scanner;

public class sgsfg {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int t=sc.nextInt();
   for(int p=0;p<t;p++)
   {
     long n=sc.nextLong();
     String st=sc.next();
     String a="1";
     String b="1";
     
    for(int i=1;i<n-1;i++)
    {
        if(st.charAt(i)=='1')
        {
            a=a+"1";
            b=b+"0";
        }
        if(st.charAt(i)=='2')
        {
            if(a.charAt(i-1)==b.charAt(i-1))
            {
            a=a+"1";
            b=b+"1";
            }
            else{
             a=a+"2";
             b=b+"0";
            }
        }
        if(st.charAt(i)=='3')
        {
            if(a.charAt(i-1)>=b.charAt(i-1))
            {
            a=a+"1";
            b=b+"2";
            }
            else{
             a=a+"2";
             b=b+"1";
            }
        }
        
            }
       System.out.println(a);
       System.out.println(b);
   }
   
}
}