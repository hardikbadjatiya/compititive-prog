
import java.util.Scanner;

public class KeyBoard {
public static void main(String[] args) {
   String str1="qwertyuiopasdfghjkl;zxcvbnm,./";
    
    Scanner sc=new Scanner (System.in);
   Character c=sc.next().charAt(0);
    String st=sc.next();
    if(c.equals('R'))
    {
        for(int i=0;i<st.length();i++)
        {
            System.out.print(str1.charAt(str1.indexOf(st.charAt(i))-1)); 
        }
}
    else 
    if(c=='L')
    {
        for(int i=0;i<st.length();i++)
        {
            System.out.print(str1.charAt(str1.indexOf(st.charAt(i))+1)); 
        }
}
}   
}
