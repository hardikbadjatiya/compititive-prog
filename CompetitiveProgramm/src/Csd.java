
import java.util.Scanner;

public class Csd {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int a=sc.nextInt();
   while(a-->0)
   {
       int n=sc.nextInt();
       int w=0;
       for(int i=0;i<n;i++)
       {
           String st="";
           for(int j=0;j<n;j++)
           {
              int x=sc.nextInt();
              st=st+""+x;
           }
           if(st.contains("11"))
           {
          w=1;
           }
           
       }
           if(w==1)
           {
             System.out.println("UNSAFE");
           
           }
       
       else
           {
               System.out.println("SAFE");
          
           }
   }
}
}
