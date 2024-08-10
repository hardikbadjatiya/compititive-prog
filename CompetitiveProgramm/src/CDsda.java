
import java.util.Scanner;

public class CDsda {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int t=sc.nextInt();
   
   while(t-->0)
   {
    int n=sc.nextInt();
    String st=sc.next();
    int x=0;
    int u=0;
    for(int i=0;i<n;i++)
    {
        if(st.charAt(i)=='A')
        {
           if(x==1)
           {
           ++u;
           
           }
        }
        if(st.charAt(i)=='B')
        {
           x=1;
        
        }
        
    }
       System.out.println(u);
   }
}    
}
