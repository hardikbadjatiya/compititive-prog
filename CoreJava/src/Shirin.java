
import java.util.ArrayList;
import java.util.Scanner;

public class Shirin {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int t=sc.nextInt();
   for(int l=0;l<t;l++)
   {
       int n=sc.nextInt();
       int p=sc.nextInt();
     String st=sc.next();
     ArrayList l1=new ArrayList();
     for(int i=0;i<n;i++)
     {
         int x=0;
         if(l1.contains(st.charAt(i)))
         {
         x=1;
         }
         if(x==0)
         {
             l1.add(st.charAt(i));
         }
     }
     int ar[]=new int[l1.size()];
     int w=0;
     lsd: for(int i=0;i<l1.size();i++)
     {
         int x=0;
         char c=(char) l1.get(i);
         for(int j=0;j<n;j++)
         {
            
             if(st.charAt(j)==c)
             {
                 ++x;
             }
         }
         ar[i]=x;
         if(x%2!=0||x/2>p)
         {
     w=1;
     break lsd;
         }
     }
     if(w==1)
     {
         System.out.println("NO");
     }
     else{
         System.out.println("YES");
     }
}}
    
}
