
import java.util.Scanner;

public class sdaaadsf {

   public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   String st=sc.next();
   int o=0;
   int e=0;
   if(st.contains("1")!=true)
   {
   o=1;
   }
   if(st.contains("0")!=true)
   {
   o=1;
   }
   while(st.contains("01"))
   {
   st=""+st.replaceFirst("01", "");
   }
   if(st.length()>0)
   {
    System.out.println(st);
   }
   else
   {
    System.out.println("-1");
   } 
}
}
