
import java.util.Scanner;

public class Code17 {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int t=sc.nextInt();
    for(int k=0;k<t;k++)
    {
       int n=sc.nextInt();
       int l=sc.nextInt();
       int d=sc.nextInt();
       String stt="abcdefghijklmnopqrstuvwxyz";
       char ch[] =new char[26];
       for(int i=0;i<26;i++)
       {
           ch[i]=stt.charAt(i);
       }
      int w=l/d;
      int o=l%d;
      int x=n/l;
      int y=n%l;
      String sttt="";
      
      String st="";
      for(int i=0;i<d;i++)
      {
          String s=""+ch[i];
          for(int j=0;j<w;j++)
          {
              st=st+ch[i];
          }
      }
      for(int i=0;i<o;i++)
      {
          st=st+ch[d-1];
      }
    
      for(int i=0;i<x;i++)
      {
        sttt=sttt+st;
      }
      String py=st.substring(0,y);
     sttt=sttt+py;
        System.out.println(sttt);
    }

}    
}
