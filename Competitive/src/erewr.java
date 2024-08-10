
import java.util.Arrays;
import java.util.Scanner;

public class erewr {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int t=sc.nextInt();
   while(t-->0)
   {
       int n=sc.nextInt()
               ;
       String st=sc.next();
      int ar[]=new int[n];
      ar[0]=1;
   String h="1 ";   
      for(int i=1;i<n;i++)
      {
          if(st.charAt(i)==st.charAt(i-1))
          {
             ar[i]=ar[i-1]+1; 
          }
          else{
              ar[i]=ar[i-1];
          }
          h=h+ar[i]+" ";
      }
   
       System.out.println(h);
   }
   
}
    
}
