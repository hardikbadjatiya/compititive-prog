
import java.util.Scanner;

public class Luckynumber {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   long num=sc.nextLong();
   String  str = new String();
   str= Long.toString(num); 
   int l=str.length();
           
   
//       if(str.charAt(i)== 4)
//       {
//           System.out.println("YES");
//           
//       }
//       else
//       {
//           System.out.println("NO");
//       }
      
      if(str.contains("1")||str.contains("2")||str.contains("00")||str.contains("3")||
               str.contains("5")||str.contains("6")||str.contains("8")||str.contains("9"))
       {
           System.out.println("NO");
       }
       else
       if(str.contains("4")||str.contains("7"))
       {
           if(num%4==0||num%7==0||num%47==0)
       {
           System.out.println("YES");
           
       }
               else
               {
           System.out.println("YES");
               }
       }
       
   }
   
    
}
