
import java.util.Scanner;

public class ternay {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int t=sc.nextInt();
   while(t-->0)
   {
       String st=sc.next();
       int n=st.length();
       int min=n+1;
       l1:
       for(int i=0;i<=n-1;i++)
       {
       for(int j=i+1;j<=n;j++)
       {
           String s=st.substring(i, j);
           if(s.contains("1")&&s.contains("2")&&s.contains("3"))
           {
               if(s.length()<min)
               {
                   min=s.length();
                   if(min==3)
                   {
                       break l1;
                   }
               }
           }
           
       }
   }
       if(min==n+1){
           System.out.println("0");
       }
       else{
       System.out.println(min);
   }}
}
    
}
