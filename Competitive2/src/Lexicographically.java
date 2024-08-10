
import java.util.Scanner;

public class Lexicographically {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   for(int i=0;i<n;i++)
   {
       String st1=sc.next();
       String st2=sc.next();
       int l1=st1.length();
       int l2=st2.length();
       
       if(st1.charAt(0)<st2.charAt(0)&&st1.charAt(0)=='A')
       {
           System.out.println(st1);
           break;
       }
        int g=0;
        int h=0;
       for(int j=0;j<Math.min(l1,l2);j++)
       {
           
       if(st1.charAt(j)<=st2.charAt(j)){
               System.out.print(st1.charAt(j));
           }
           if(st1.charAt(j)>st2.charAt(j)){
               
           for(int k=j;k<l1;k++)
           {
           if(st1.charAt(k)<=st2.charAt(j)){
               System.out.print(st1.charAt(k));
               g=k;
               break;
           }
           
               
           
           }
       }
               System.out.print(st1.charAt(j));
           
       
   }
   
   }}
    
}
