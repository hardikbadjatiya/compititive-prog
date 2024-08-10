
import java.util.Scanner;

public class Threeteams {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int n=sc.nextInt();
   for(int i=0;i<n;i++)
   {
       long a=sc.nextLong();
       long b=sc.nextLong();
       long c=sc.nextLong();
       long x=0;
       int y=0;
       int z=0;
       if((a>=b&&a>=c))
       {
           if(b>c)
           {
               x=2*(a-c-2);
           }
           else if(c>b)
           {
           x=(2*(a-b-2));
           }
           else if((c==b)&&(a-c)>1){
             x=(2*(a-c));
           }
           else if((c==b)&&(a-c)==1){
               x=(0);
           }
           
       }
       if(b>=c&&b>=a)
       {
           if(a>c)
           {
               
               x=(2*(b-c-2));
           }
           else if(c>a)
           {
           x=(2*(b-a-2));
           }
           else if((a==c)&&(b-c)>1){
             x=(2*(b-c));
           }
           else if((a==c)&&(b-c)==1){
               x=(0);
           }
       }
       if(c>=b&&c>=a)
       {
           if(a>b)
           {
               x=(2*(c-b-2));
           }
           else if(b>a){
               x=(2*(c-a-2));
           }
           else if((a==b)&&(c-a)>1){
               x=(2*(c-a));
           }
           else if((a==b)&&(c-a)==1){
               x=(0);
           }
       }
       if(a==b&&b==c)
       {
       x=0;
       }
       
       System.out.println(x);   
   }
}
    
}
