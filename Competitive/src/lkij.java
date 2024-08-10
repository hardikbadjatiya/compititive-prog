
import java.util.Scanner;

public class lkij {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int t=sc.nextInt();
   while(t-->0)
   {
      int n=sc.nextInt();
      String st=sc.next();
          String s="";
       
      if(st.contains("10")&&st.contains("0")&&st.contains("1"))
      {
       int y=0;
       for(int i=0;i<n;i++)
       {
           if(st.charAt(i)=='0'&&y==0)
           {
               
             s=s+"0";  
           }
           if(st.charAt(i)=='1')
           {
           break;
           }
           
       }
       String p="";
       for(int i=n-1;i>=0;i--)
       {
           if(st.charAt(i)=='0'&&y==0)
           {
               
           break;
           }
           if(st.charAt(i)=='1')
           {
               p=p+"1";
           }
           
       }
       if(p.length()+s.length()==n)
           
       System.out.println(s+p);
       else{
           System.out.println(s+"0"+p);
       }
      }
      else{
          System.out.println(st);
      }   
   }
}
    
}
