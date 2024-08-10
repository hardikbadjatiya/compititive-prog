
import java.util.Scanner;

public class Panagram {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   String st=new String();
   st=sc.next();
   long c=0;
   c=st.toLowerCase().chars().distinct().count();
   if(c==26)
   {
       System.out.println("YES");
   }
   else
   {
       System.out.println("NO");
   }
}
    
}
