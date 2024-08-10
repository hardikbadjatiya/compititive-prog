
import java.util.Scanner;

public class sds {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int n=sc.nextInt();
   int x=(n+1)/2;
   String st="";
   for(int i=1;i<x;i++)
   {
       st=st+i+"*";
   }
   st=st+x;
     String s[]=new String[x];
     for(int i=1;i<=x;i++)
     {
         s[i-1]="";
        for(int j=x;j>=1;j--)
        {
            if(j>i)
            {
                s[i-1]=s[i-1]+" ";
            }
            
        }
           s[i-1]=s[i-1]+st.substring(0,2*(i-1)+1);
            
         System.out.println(s[i-1]);
     }
     for(int i=x-2;i>=0;i--)
     {
         System.out.println(s[i]);
     }
   
   }
    
}
//Input : 9
//Output :
//    1
//   1*2
//  1*2*3
// 1*2*3*4
//1*2*3*4*5
// 1*2*3*4
//  1*2*3
//   1*2
//    1