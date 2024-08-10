
import java.util.Scanner;

public class assa {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   while(n-->0)
   {
       String st=sc.next();
       int l=st.length();
       int k=0;
       String lk="";
       for(int i=0;i<l;i++)
       {
          int x=0;
          
          if(st.charAt(i)!='0')
           {
            k++;   
               x=1;
               lk=lk+""+st.charAt(i);
               
               for(int j=0;j<l-i-1;j++)
               {
               
               lk=lk+"0";
               }
           }
          if(x==1)
          {
              lk=lk+" ";
          }
       }
       System.out.println(k);
       System.out.println(lk);
   }
   
}
        
}
