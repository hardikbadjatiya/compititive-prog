
import java.util.Scanner;

public class GenedayCardGame {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   String st=sc.next();
   char a=st.charAt(0);
   char b=st.charAt(1);
   String ch[]=new String[5];
   for(int i=0;i<5;i++)
   {
       ch[i]=sc.next();
   }
   for(int i=0;i<5;i++)
   {
    if(ch[i].charAt(0)==a||ch[i].charAt(1)==b)
    {
        System.out.println("YES");
        System.exit(0);
    }
    
   }
    System.out.println("NO");
}
    
}
