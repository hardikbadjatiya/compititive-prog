
import java.util.Scanner;

public class CD12 {
public static void main(String[] args) {
   Scanner sc=new  Scanner(System.in);
   String st=sc.next();
   String st2=sc.next();
  int x=0;
   for(int i=0;i<st.length();i++)
  {
      String s=new String();
     
      for(int j=0;j<st.length();j++)
      {
          s=s+st.charAt(j);
          if(st2.contains(s))
          {
          ++x;    
          }
      }
  }
    System.out.println(x);
   
}
    
}
