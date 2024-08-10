
import java.util.Scanner;

public class saa {
public static void main(String[] args) {
    Scanner sc=new Scanner (System.in);
    int n=sc.nextInt();
   String st[]=new String[n/2];
   int u=0;
   for(int i=n/2;i>=1;i--)
   {
       st[u]="";
     if(i>1) 
     {
         for(int j=i;j>=2;j--)
         {
             st[u]=st[u]+i+"*";
         }
         st[u]=st[u]+i;
         
     }
     if(i==1)
     {
         st[u]=st[u]+i;
     }
       System.out.println(st[u]);  
   u++;
   }
   for(int i=n/2-1;i>=0;i--)
   {
       System.out.println(st[i]);
   }
   
    
}
    
}
//Input: N = 6
//Output: 3*3*3
//        2*2
//        1
//        1
//        2*2
//        3*3*3
//
//
//
//Type a message
