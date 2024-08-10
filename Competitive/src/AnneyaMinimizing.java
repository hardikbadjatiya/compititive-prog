
import java.util.Arrays;
import java.util.Scanner;

public class AnneyaMinimizing {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   int k=sc.nextInt();
   String st=sc.next();
   char ch[]=new char[n];
   for(int i=0;i<n;i++)
   {
       ch[i]=st.charAt(i);
   }
       int x=0;
       if(k==0)
       {
           System.out.println(st);
           System.exit(0);
       }
       if(n==1&&k==1)
       {
           System.out.println(0);
           System.exit(0);
       }
       else if(k!=1&&n==1){
           System.out.println(ch[0]);
           System.exit(0);
       }
   if(ch[0]=='1')
   {
       
       System.out.print("1");
   for(int i=1;i<n;i++)
   {
       if(x<k){
   if(ch[i]=='0')
   {
       System.out.print("0");
   }
   else{
       
       ch[i]='0';
       System.out.print("0");
       ++x;
       
   }
   
   }
       else {
           
           System.out.print(ch[i]);
       }
        
   }
   
   }
   else{
    
       System.out.print("1");
   for(int i=1;i<n;i++)
   {
       if(x<k-1){
   if(ch[i]=='0')
   {
       System.out.print("0");
   }
   else{
       
       ch[i]='0';
       System.out.print("0");
       ++x;
       
   }
   
   }
       else {
           
           System.out.print(ch[i]);
       }
        
   }   
   }
}
    
}
