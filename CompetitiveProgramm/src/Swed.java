
import java.util.Scanner;

public class Swed {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int  t=sc.nextInt();
   while(t-->0)
   {
       String st=sc.next();
           int w=st.length();
           int q=0;
           int one =0;
           int zero=0;
           for(int i=0;i<w;i++)
           {
               String e=""+st.charAt(i);
               q=q+Integer.parseInt(e);
                if(st.charAt(i)=='0')
                {
                    ++zero;
                            
                }
                else if(st.charAt(i)=='1'){
               ++one;
           }
           }
           if(q==w||q==0)
           {
               System.out.println(st+""+st.substring(1,w));
           }
           else{
               
            if(st.charAt(0)=='1') 
            {
               String a="10";
               String l="";
               for(int i=0;i<w;i++)
               {
                  l=l+a;
               }
               System.out.println(l);
              }
            if(st.charAt(0)=='0') 
            {
               String a="01";
               String l="";
               for(int i=0;i<w;i++)
               {
                  l=l+a;
               }
               System.out.println(l);
              }
           }
           
       }
   
}
    
}
