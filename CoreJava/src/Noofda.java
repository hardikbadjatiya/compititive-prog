
import java.util.Scanner;

public class Noofda {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int k=sc.nextInt();
   for(int l=0;l<k;l++)
   {
       int n=sc.nextInt();
       String st=sc.next();
       int max=0;
       int z=0;
       int s=0;
       int num=0;
    
       for(int i=0;i<n;i++)
       {
      if(st.charAt(i)=='0')
      {
          ++z;
       if(z>1) {
          
       if(s>max)
     {
         max=s;
     s=1;
     }    
     z=1;     
      }
      }
        if(st.charAt(i)=='1')
      {
          if(z<=1)
          {
           s=s+1;
          }
          
     if(s>max)
     {
         max=s;
     }   
       }
        
       }
       System.out.println(max);
   }
}
        
}
