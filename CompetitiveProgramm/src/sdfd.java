
import java.util.Scanner;

public class sdfd {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int k=sc.nextInt();
            String s=sc.next();
            String stt=sc.next();
            char ch[]=stt.toCharArray();
            System.out.println(ch);
            String w=sc.next();
            String q=sc.next();
            String l=sc.next();
            String m=sc.next();
            if(s.equals(q)&&w.equals(m)||s.equals(m)&&w.equals(q))
            {
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
                
        }
}
    
}
