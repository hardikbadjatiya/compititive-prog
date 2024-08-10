
import java.util.Scanner;

public class sda {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int t=sc.nextInt();
   while(t-->0)
   {
       long s=sc.nextLong();
       long n=sc.nextLong();
       long h=0;
       if(s>1)
       {
          h=h+s/n;
          s=s%n;
          
          if(s%2==0&&s>0)
          { 
              h=h+1;
             
          }
          else if(s%2==1){
              h=h+2;
          }
          
       }
       else{
           h=1;
       }
       System.out.println(h);
   }
}
    
}
