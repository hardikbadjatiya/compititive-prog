
import java.util.Scanner;

public class asdfdgd {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();
            int m=0;
            int g=0;
            while(t-->0)
            {
                String st=sc.nextLine();
                if(st.contains("M:"))
                {
                    while(st.contains("19"))
                    {
                       m=m+4;
                       st=""+st.replace("19", "");
                    }
                    while(st.contains("21"))
                    {
                       m=m+3;
                       st=""+st.replace("21", "");
                    }
                    
                }
                 if(st.contains("G:"))
                {
                    while(st.contains("19"))
                    {
                       g=g+4;
                       st=""+st.replace("19", "");
                    }
                    while(st.contains("21"))
                    {
                       g=g+3;
                       st=""+st.replace("21", "");
                    }
                    
                }
            }
            if(g!=m)
            {
                System.out.println("Date");
            }
            else{
                System.out.println("No Date");
            }
            
          
}
    
}
