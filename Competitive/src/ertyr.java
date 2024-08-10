
import java.util.Arrays;
import java.util.Scanner;

public class ertyr {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int t=sc.nextInt();
   while(t-->0)
       {
          String st=sc.next();
          String y=sc.next();
          int w[]=new int[257];
          for(int i=0;i<st.length();i++)
          {
              int e=st.charAt(i);
              w[e]++;
           }
            char o=y.charAt(0);
            w[(int )o]--;
            int f=0;
            char hl=o;
            for(int i=1;i<y.length();i++)
          {
              int e=y.charAt(i);
              if(f==0)
              {
             if(e<o&&f==0)
             {
                 hl=(char)e;
                 f=1;
             }
             if(e>o)
             {
                f=1; 
             }
              }
              w[e]--;
          }
                      
          String h="";
          int u=0;
          for(int i=97;i<=122;i++)
          {
              if(w[i]>0)
              {
                  char l=(char)i;
                  if(l<o)
                  {
                  for(int j=0;j<w[i];j++)
                     h=h+l;
                  }
                  if(l==o)
                  {
                  if(hl<o)
                  {
                 h=h+y;     
                  for(int j=0;j<w[i];j++)
                     h=h+l;
                  
                  }
                  else
                  {
                  for(int j=0;j<w[i];j++)
                     h=h+l;
                  
                  h=h+y;
                  }u++;
                  }
                  if(l>o)
                  {
                      if(u==0)
                      {
                          h=h+y;
                          u++;
                      }
                     for(int j=0;j<w[i];j++)
                     h=h+l;
                   
                  }
              }
          }
          if(u==0)
              h=h+y;
          
           System.out.println(h);
              
}
}
    
}
