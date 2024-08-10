
import java.util.Scanner;

public class assaassaas {
public static void main(String[] args) {
    Scanner sc=new Scanner (System.in);
     long a=sc.nextInt();
     long b=sc.nextInt();
     String st=" ";
     long x=0;
     for(long i=a;i<=b;i++)
     {
         for(long j=i;j<=b;j++)
         {
           long w=i|j;
           
         String s=" "+w+" ";
         if(st.contains(s)!=true)
         {
             x++;
             st=st+w+" ";
         }
         }
     }
     System.out.println(x);

}
    
}
