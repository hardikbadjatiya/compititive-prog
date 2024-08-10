
import java.util.Scanner;

public class NoOfDays {
    static int stis( String st)
    { 
        String stri=st;
       int zero=0;
       int one=0;
        for(int i=0;i<stri.length();i++)
        {
            if(st.charAt(i)=='1')
            {
                ++one;
            }
            if(st.charAt(i)=='0')
            {
                ++zero;
            }
        }
        int x=0;
    if(zero<=1)
    {
        x=stri.length();
    }
    return x;
    }
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int k=sc.nextInt();
   for(int l=0;l<k;l++)
   {
       int n=sc.nextInt();
       String st=sc.next();
       int max=0;
       for(int i=0;i<n;i++)
       {
         for(int j=i;j<n;j++)
         {
           String str=st.substring(i, j+1);
           int x=NoOfDays.stis(str);
           if(x>max)
           {
               max=x;
           if(max==(j-i+1))    
           {
               break;
           }
           }
         }
       }
       System.out.println(max);
  }
}
}
