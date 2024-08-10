
import java.util.Arrays;
import java.util.Scanner;

public class dhjghj {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   
       long k=sc.nextLong();
       int ar[]=new int[10];
       Arrays.fill(ar, 1);
       long u=1;
       while(k>u)
       {
           for(int i=0;i<10;i++)
           {
               if(u<k)
               { 
              u=u/ar[i] ;
            ar[i]++;
            u=u*ar[i];
               }
               else{
                   break;
               }
           }
       }
       String s="codeforces";
        String st="";
        for(int i=0;i<10;i++)
        {
           for(int j=0;j<ar[i];j++)
           {
               st=st+s.charAt(i);
           }
           
        }
           System.out.println(st);
        
   
}
    
}
