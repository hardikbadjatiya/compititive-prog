
import java.util.Scanner;

public class NewClass {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int t=sc.nextInt();
   while(t-->0)
   {
       int a=sc.nextInt();
       int b=sc.nextInt();
       int x=0;
       if(a==b)
       {
           x=0;
       }
       if(a>b)
       {
           if((a-b)%2==0)
           {
             x=1;  
           }
           else{
               x=2;
           }
       }
       if(a<b){
           if((b-a)%2==0)
           {
             x=2;  
           }
           else{
               x=1;
           }
       }
       System.out.println(x);
           }
   
}
    
}
