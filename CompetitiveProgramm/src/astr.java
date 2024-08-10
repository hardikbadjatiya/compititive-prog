
import java.util.Scanner;

public class astr {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   String s=sc.next();
   int l=s.length();
        int max=1;
        String sw="";
        for(int i=0;i<l-1;i++)
        {
            for(int j=i+1;j<l;j++)
            {
                String st=s.substring(i,j);
                StringBuilder sb=new StringBuilder(st);
                String w=sb.reverse().toString();
                if(st.equals(w))
                {
                    if(st.length()>max)
                    {
                        sw=""+st;
                    }
                }
            }
        }
    System.out.println(sw);
}
    
}
