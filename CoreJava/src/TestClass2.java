import java.io.*;
import java.util.*;


public class TestClass2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int testcase = Integer.parseInt(br.readLine().trim());
        for(int t_i=0; t_i<testcase; t_i++)
        {
            String S = br.readLine();
            String T = br.readLine();

            int out_ = Maximum(S, T);
            System.out.println(out_);
         }

         wr.close();
         br.close();
    }
    
    static int Maximum(String S, String T){
      int n=S.length();
      int x=T.length();
      int max=0;
      
      for(int i=0;i<n;i++)
      {
          for(int j=0;j<n-1;j++)
          {
              char ch[]=S.toCharArray();
              char temp = ch[j]; 
        ch[j] = ch[j+1]; 
        ch[j+1] = temp; 
              
       String sfg=new String(ch);
int o=0;
       for(int r=0;r<Math.min(n,x);r++)
      {
          if(sfg.charAt(r)==T.charAt(r))
          {
              ++o;
          }
          
      }
       if(o>max)
               {
                   max=o;
                   
               }
       }
          
          
      }
          
    return max;
    }
}