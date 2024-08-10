
import java.util.Scanner;

public class LovelyPalindrome {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   String st=sc.next();
   int l=st.length();
StringBuilder sb=new StringBuilder(st);
    System.out.println(st+""+sb.reverse());
}
}