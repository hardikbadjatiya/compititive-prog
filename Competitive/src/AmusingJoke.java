
import java.util.Arrays;
import java.util.Scanner;
import static javafx.scene.input.KeyCode.I;

public class AmusingJoke {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   String str1=sc.next();
   String str2=sc.next();
   String str3=sc.next();
   int a=str1.length();
   int b=str2.length();
   int c=str3.length();
   String str=str1.concat(str2);
   char ch1[]=str.toCharArray();
   Arrays.sort(ch1);
   char ch2[]=str3.toCharArray();
   Arrays.sort(ch2);
  
   if(Arrays.equals(ch1, ch2))
   {
       System.out.println("YES");
   }
   else{
       System.out.println("NO");
   }
   
//   if(c==a+b)
//   {
//       for(int i=0;i<a;i++)
//       {
//       if(str3.contains(str1.charAt(i)))
//       {
//           
//       }          
//       }
//       System.out.println("YES");
   
}
    
}
