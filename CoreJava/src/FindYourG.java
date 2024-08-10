
import java.util.Scanner;
public class FindYourG {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int t=sc.nextInt();
   for(int k=0;k<t;k++)
   {
       int n=sc.nextInt();
       String st=sc.next();
       StringBuilder sb=new StringBuilder(st);
      int x=1; 
       for(int j=0;j<sb.length();j++)
       {
       for(int i=0;i<sb.length()-1;i++)
       {
           if(sb.charAt(i)==sb.charAt(i+1))
           {
              x=0; 
               sb.delete(i, i+1);
           }
           if(x==1)
           {
               break;
           }
       }
       }
       int a=0;
       int b=0;
     
        if(sb.charAt(0)=='R')
           {
           a=a+1;
           } if(sb.charAt(0)=='L')
           {
           a=a-1;
           } if(sb.charAt(0)=='U')
           {
           b=b+1;
           } if(sb.charAt(0)=='D')
           {
           b=b-1;
           }
        for(int i=1;i<sb.length();i++)
       {
           if(sb.charAt(i)=='L')
           {
               if(sb.charAt(i-1)!='R'&&sb.charAt(i-1)!='L')
               {
                   a=a-1;
                   b=b;
               }
           }
           if(sb.charAt(i)=='R')
           {
               if(sb.charAt(i-1)!='L'&&sb.charAt(i-1)!='R')
               {
                   a=a+1;
                   b=b;
               }
           }if(sb.charAt(i)=='D')
           {
               if(sb.charAt(i-1)!='U'&&sb.charAt(i-1)!='D')
               {
                   a=a;
                   b=b-1;
               }
           }if(sb.charAt(i)=='U')
           {
               if(sb.charAt(i-1)!='D'&&sb.charAt(i-1)!='U')
               {
                   a=a;
                   b=b+1;
               }
           }
       }
       
       System.out.println(a+" "+b);
   }
}
    
}
