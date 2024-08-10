
import java.util.Scanner;

public class sd {
    public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int x=sc.nextInt();
   int y=sc.nextInt();
        System.out.println(hammingDistance(x, y)); 
}
 static int hammingDistance(int x, int y) {
    
       String s=Integer.toBinaryString(x);
       String t=Integer.toBinaryString(y);
       int u=s.length();
       int v=t.length();
       if(u>v)
       {
          for(int i=u;i>v;i--)
          {
              t="0"+t;
          }
           
       }
        if(v>u)
       {
          for(int i=v;i>u;i--)
          {
              s="0"+s;
          }
           
       }
        System.out.println(s);
        System.out.println(t);
        int r=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=t.charAt(i))
            {
                ++r;
            }
        }
        return r;
    }

}

        

