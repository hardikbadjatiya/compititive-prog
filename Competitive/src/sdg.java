
import java.util.Scanner;

public class sdg {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   String st=sc.next();
   int u=0;
   for(int i=0;i<n;i++)
   {
       int a=0;
           int c=0;
           
       for(int j=i;j<n;j++)
       {   
            if(st.charAt(j)=='a') ++a;
              
              if(st.charAt(j)=='c') ++c;
                  
           if(a>c)
           {
           ++u;    
           }
       }
   }
    System.out.println(u);
}
    
}
