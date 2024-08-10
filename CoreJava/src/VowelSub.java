
import java.util.Scanner;
 
public class VowelSub {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   for(int p=0;p<n;p++)
   {
       String st=sc.next();
       int u=0;
       for(int i=0;i<st.length();i++)
       {
            String s=new String();
            for(int j=i;j<st.length();j++)
           {
               
               s=s+st.charAt(j);
          
               if(s.contains("A"))
           {
               ++u;
               
           }
           if(s.contains("E"))
           {
               ++u;
               
           }if(s.contains("I"))
           {
               ++u;
               
           } if(s.contains("O"))
           {
               ++u;
               
           }if(s.contains("U"))
           {
               ++u;
               
           }
          if(s.contains("a"))
           {
               ++u;
               
           }if(s.contains("o"))
           {
               ++u;
               
           }
          if(s.contains("i"))
           {
               ++u;
               
           }
          if(s.contains("e"))
           {
               ++u;
               
           }
          if(s.contains("u"))
           {
               ++u;
               
           }
           
           }
           
       }
       System.out.println(u);
   }
}
        
}
