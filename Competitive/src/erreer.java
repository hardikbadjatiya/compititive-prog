
import java.util.Scanner;

public class erreer {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int t=sc.nextInt();
   while(t-->0)
   {
       int n=sc.nextInt();
       int a[]=new int[n];
       String s="";
       for(int i=0;i<99;i++)
       {
           s=s+"a";
       }
       char ar[]="bcdefghijklmnopqrstuvwxyz".toCharArray();
       System.out.println(s);
       String stt[]=new String[n];
       for(int i=0;i<n;i++)
       {
              
       a[i]=sc.nextInt();
       
       }
       
       for(int i=0;i<n-1;i++)
       {
       int r=0;
        
      stt[i]="";
       
       if(ar[i]<ar[i+1])
       {
           stt[i]=stt[i-1];
       
       for(int j=0;j<(-a[i]+a[i+1]);j++)
       {
        stt[i]=stt[i]+ar[r%25];
       
       }
       }
       r=r+1;
       if(stt[i].length()==0)
           stt[i]=stt[i]+ar[r%25];
        
       System.out.print(stt[i]);
           System.out.println();
       }
   }
}
    
}
