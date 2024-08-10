
import java.util.Scanner;

public class erww {
public static void main(String[] args) {
 
    Scanner scc=new Scanner (System.in);
   
    int l=scc.nextInt();
   
    while(l-->0)
   {
       int p=scc.nextInt();
       
       String st=scc.next();
     
       int arr[]=new int[257];
       
       for(int i=0;i<p;i++)
       {
           int w=st.charAt(i);
       
           arr[w]++;
           
       }
       int x=0;
       for(int i=0;i<257;i++)
       {
           if(arr[i]%2!=0)
           {
              x=1;
              break;
           }
       }
       if(x==0)
       {
           
           System.out.println("YES");
       }
       else
       {
       
           System.out.println("NO");
       }
   }
}
    
}
