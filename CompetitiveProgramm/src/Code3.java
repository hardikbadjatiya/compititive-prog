
import java.util.Scanner;


public class Code3 {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
     int t=sc.nextInt();
   
     for(int k=0;k<t;k++)
   {
       int n=sc.nextInt();
       int x=sc.nextInt();
       String st=new String();
       st=" ";
       int ar[]=new int[n];
              for(int i=0;i<n;i++)
       {
           ar[i]=sc.nextInt();
           st=st+ar[i]+" ";
       }
              int o=0;
         for(int i=1;i<=100+x+n;i++)
         {
             String s=" "+i+" ";
             if(st.contains(s)&&x>=0)
             {
                 o++;
             }
             else if(st.contains(s)!=true){
                 
                 x--;
 if(x<0)
             {
                 
                 break;
                 
             }
                 o++;
             }
             
         }
         System.out.println(o);
              
          
              
   }
}
    
}
