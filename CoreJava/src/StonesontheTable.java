
import java.util.Scanner;
import jdk.nashorn.internal.parser.Lexer;

public class StonesontheTable {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   String st=sc.next();
   int x=0;
   for(int i=0;i<n-1;i++)
   {
       char ch=st.charAt(i);
       char ch1=st.charAt(i+1);
       if(ch==ch1)
       {
           ++x;
       }
   }
    System.out.println(x);
}
    
}
