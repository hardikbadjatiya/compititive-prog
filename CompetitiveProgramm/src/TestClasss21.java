
import java.util.Scanner;

public class TestClasss21 {
static int check(String s)
{
    int n=s.length();
    int x=n/2;
    String w=s.substring(0,n/2);
    String l=s.substring(n/2,n);
    if(w.equals(l))
    {
        return 1;
    }
    return 0;
}
    public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int t=sc.nextInt();
   while(t-->0) 
   {
    String s=sc.next();
    int n=s.length();
    int x=0;
    
         for(int j=1;j<n-2;j++)
    {
        String st=s.substring(0,j+1);
       
        
        String sttss=s.substring(j+1,n);
        int q=st.length();
        int o=sttss.length();
        String wa=st.substring(0,q/2);
    String l=st.substring(q/2,q);
    if(wa.equals(l))
    {
        int p=sttss.length();
        String as=sttss.substring(0,p/2);
        String ass=sttss.substring(p/2,p);
        if(as.equals(ass))
        {
            ++x;
        }
    }
    
    j++; 
        
    }
       System.out.println(x);
   }
}    
}
