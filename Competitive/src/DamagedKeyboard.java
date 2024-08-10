
import java.util.Scanner;

public class DamagedKeyboard {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int n=sc.nextInt();
   for(int i=0;i<n;i++)
   {
       String st=sc.next();
       if(st.length()==1)
       {
           System.out.println(st);
           
       }else{
       for(int j=1;j<st.length()-1;j++)
       {
           char a=st.charAt(j);
       char b=st.charAt(j-1);
       char c=st.charAt(j+1);
       
           if(a!=b&&a!=c)
           {
               System.out.print(st.charAt(j));
           }
       }
       System.out.println("");
   }
   }
}
    
}
