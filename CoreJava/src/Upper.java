
import static java.lang.System.out;
import java.util.Scanner;

public class Upper {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   String str=new String();
   str=sc.next();
   int len=str.length();
   char ch[]=str.toCharArray();

               if (ch[0] >= 'a' && ch[0] <= 'z') { 
  
                    // Convert into Upper-case 
                    ch[0] = (char)(ch[0] - 'a' + 'A'); 
//                    System.out.println(ch[0]);
           }
               String st = new String(ch); 
               System.out.println(st);
//char ch[]=new char[len];
//int i=0;for
//ch[i]=str.charAt(i);
//
//
////str.charAt(0)=str.charAt(0)-32;
//for( i=0;i<len;i++)
//{
//ch[i]=str.charAt(i);
////ch[0]=ch[0]-32;
//}
//out.println(str.toCharArray());
//
//}
}    
}
