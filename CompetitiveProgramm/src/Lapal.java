
import java.util.Arrays;
import java.util.Scanner;

public class Lapal {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int t=sc.nextInt();
   while(t-->0)
   {
       String st=sc.next();
       StringBuilder sb=new StringBuilder(st);
       String stt=sb.reverse().toString();
       int x=0;
       if(stt.equals(st))
       {
           x=1;
       }
       if(x==0)
       {
           int l=st.length();
           if(l%2==0)
           {
           String w=st.substring(0,l/2);
           String q=st.substring(l/2,l);
          char ar[]=new char[l/2];
          char arr[]=new char[l/2];
        
          
           x=1;
           for(int i=0;i<l/2;i++)
           {
               ar[i]=w.charAt(i);
               arr[i]=q.charAt(i);
               
           }
           Arrays.sort(ar);
           Arrays.sort(arr);
           for(int i=0;i<l/2;i++)
           {
           if(ar[i]!=arr[i])
           {
               x=2;
           }
           }
           
           
           }
           else{
               x=1;
           String w=st.substring(0,l/2);
           String q=st.substring(l/2+1,l);
          char ar[]=new char[l/2];
          char arr[]=new char[l/2];
        
          
           x=1;
           for(int i=0;i<l/2;i++)
           {
               ar[i]=w.charAt(i);
               arr[i]=q.charAt(i);
               
           }
           Arrays.sort(ar);
           Arrays.sort(arr);
           for(int i=0;i<l/2;i++)
           {
           if(ar[i]!=arr[i])
           {
               x=2;
           }
           }
           
           
           }
       }
       if(x==1)
       {
           System.out.println("YES");
       }
       else{
           System.out.println("NO");
       }
   }
}
    
}
