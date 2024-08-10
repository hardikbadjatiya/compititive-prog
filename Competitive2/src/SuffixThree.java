
import java.util.Scanner;

public class SuffixThree {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   for(int i=0;i<n;i++)
   {
       String st=sc.next();
       StringBuilder sb=new StringBuilder(st);
       sb.reverse();
       if(sb.charAt(0)=='o'&&sb.charAt(1)=='p')
       {
           System.out.println("FILIPINO");   
       }
          if(sb.charAt(0)=='u'&&sb.charAt(1)=='s')
       {
           System.out.println("JAPANESE");   
       }
             if(sb.charAt(0)=='a'&&sb.charAt(1)=='d')
       {
           System.out.println("KOREAN");   
       }
   }
}
    
}
