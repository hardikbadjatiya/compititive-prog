
import java.util.Scanner;

public class Setr {
public static void main(String[] args) {
    Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            String st=sc.next();
            String s="";
            int x=0;
            for(int i=0;i<8;i++)
            {
               if(st.charAt(i)!=':')
               {
                s=s+st.charAt(i);
               }
            }
            int n=Integer.parseInt(s);
            String lk="";
            for(int i=0;i<200000;i++)
            {
            n=n+1;
            String sd=""+n;
            if(sd.length()==5&&sd.contains("0")!=true)
            {
                sd="0"+sd;
            }
            String w=""+sd;
            long er=w.chars().distinct().count();
            if(er==6)
            {
                lk=lk+w;
                break;
            }
            }
            String k=""+lk;
            String we="";
            for(int i=0;i<6;i++)
            {
               we=we+""+k.charAt(i);
               x++;
                if(x%2==0&&x<=4)
                {
                    we=we+":";
                }
            }
            System.out.println(we);        
   }
}
    
}
