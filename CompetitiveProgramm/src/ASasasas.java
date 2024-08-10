
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ASasasas {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int a=sc.nextInt();
   while(a-->0)
   {
       int n=sc.nextInt();
       int k=sc.nextInt();
       int ar[]=new int[n];
       Arrays.sort(ar);
       
       String st="";
       for(int i=0;i<n;i++)
      {
          ar[i]=sc.nextInt(); 
          st=st+ar[i]+" ";
      }
       long q=st.chars().distinct().count();
       String stt=" ";
       String qw="";
       if(q-1>k)
       {
           System.out.println("-1");
       }
       
       else{
           if(n!=k)
           {
           ArrayList <Integer>l1=new ArrayList<Integer>();
           for(int i=0;i<n-k;i++)
           {
              int x=0; 
               for(int j=i;j<k+i;j++)
               {
                   x=x+ar[j];
               }
               l1.add(x);
           }
          java.util.Collections.sort(l1);
         
          if(l1.get(0)==l1.get(l1.size()-1))
          {
              System.out.println(n);
              System.out.println(st);
          }
          else{
         String kl=" "+st;
              StringBuilder sb=new StringBuilder(kl);
         
         String kll=sb.reverse().toString();
         int dfg=0;
         if(k==2&&kl.equals(kll))
         {
             dfg=1;
             int d=ar[0]+ar[1]-ar[n/2];
             System.out.println(n+1);
             System.out.println(st.substring(0,n)+""+d+kll.substring(n,2*n));
         }
         else if(k>2&&kl.equals(kll)){
             System.out.println("-1");
             dfg=1;
         }
         else if(dfg==0){
         for(int i=0;i<n;i++)
         {
             String h=" "+ar[i]+" ";
          if(stt.contains(h)!=true)
          {
              stt=stt+h;
              qw=qw+ar[i]+" ";
          }
         }
         long s=Math.abs(q-1-k);
          String d=" ";
          
        for(int i=1;i<=n;i++)
        {
            String l=" "+i+" ";
           if(stt.contains(l)!=true&&s>0)
           {
               d=d+l;
               s--; 
               qw=i+" "+qw;
               if(s<=0)
               {
                   break;
               }
               
           }
           
               }
        System.out.println(2*n);
               
               System.out.println(qw+""+qw);
       }
          }  }
          else{
               
         for(int i=0;i<n;i++)
         {
             String h=" "+ar[i]+" ";
          if(stt.contains(h)!=true)
          {
              stt=stt+h;
              qw=qw+ar[i]+" ";
          }
         }
         long s=Math.abs(q-1-k);
          String d=" ";
          
        for(int i=1;i<=n;i++)
        {
            String l=" "+i+" ";
           if(stt.contains(l)!=true&&s>0)
           {
               d=d+l;
               s--; 
               qw=i+" "+qw;
               if(s<=0)
               {
                   break;
               }
               
           }
           
               }
               System.out.println(2*n);
               System.out.println(qw+""+qw);
       }
       }
//     
    }
}
}
