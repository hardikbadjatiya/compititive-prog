
import java.util.Scanner;

public class Refsd {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
  String st=sc.next();
  int l=st.length();
    StringBuilder sb=new StringBuilder(st);
    String s=sb.reverse().toString();
    String sttt="";
    int c=0;
    int z=0;
    int o=0;
    
    for(int i=0;i<l;i++)
    {
        if(s.charAt(i)=='0'&&c==0)
        {
        ++z;
       sttt=sttt+"0";
        
        }
        if(s.charAt(i)=='0'&&c==1)
        {
            
       break; 
        }
        if(s.charAt(i)=='1')
        {
            c=1;
           ++o;
          sttt=sttt+"1";
          
        }
        
    }
  if(sttt.length()>=2)
  {
      StringBuilder sbb=new StringBuilder(sttt);
      String w=sbb.reverse().toString();
      System.out.println(w);
  }
  else{
      System.out.println(-1);
  }
}
    
}
