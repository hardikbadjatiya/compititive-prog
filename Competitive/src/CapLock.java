
import java.util.Scanner;

public class CapLock {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   String st=sc.next();
   int n=st.length();
  int z=st.charAt(0);
  int y=0;
  for(int j=1;j<n;j++)
  {
      if(st.charAt(j)>=65&&st.charAt(j)<97)
      {
          ++y;
      }
  }
  if(z<97&&y==n-1)
  {
      System.out.println(st.toLowerCase());
  }
  else if(z>=97&&y==n-1)
  {
      
      String a=st.toUpperCase();
       System.out.print(a.charAt(0));
      String s=st.toLowerCase();
      for(int i=1;i<n;i++)
      {
          System.out.print(s.charAt(i));
      }
  }
  else{
      System.out.println(st);
  }
}
}
