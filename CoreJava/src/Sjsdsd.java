
import java.util.Scanner;

public class Sjsdsd {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
   for(int k=0;k<n;k++)
   {
       String st=sc.next();
       String s=new String();
       int  p=sc.nextInt();
       int  q=sc.nextInt();
       int y=0;
       for( int i=0;i<st.length();i++)
       {
           
           s=s+st.charAt(i);
           long x=s.chars().distinct().count();
           if(x+p<i+1)
           {
               
            y=i;
            break;
           }
           
           
       }
       System.out.println(y);
   }   
}
    
}
