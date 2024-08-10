
import java.util.Arrays;
import java.util.Scanner;

public class ikj {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int t=sc.nextInt();
   while(t-->0)
   {
       String st=sc.next();
       int x=0;
       long n=st.length();
        long l=0;
        long r=0;
        for(int i=0;i<n;i++)
        {
            r++;
            if(st.charAt(i)=='+')
            {
               l=l+1; 
            }
            if(st.charAt(i)=='-')
            {
              l--;  
            }
            if(l<0)
            {
                r=r+i+1;
                l=0;
            }
        }
//             for(int j=0;j<n;j++)
//           {
//               x=x+1;
//               if(st.charAt(j)=='+')
//                   u=u+1;
//               else
//                   u--;
//               System.out.println(i+" "+" "+u);
//               if(u<0)
//               {
//                  y=1;
//                  break;
//               }
//           
//           }
//           if(y==0)
//           {
//               break;
//           }
//       }
      System.out.println(r);
   }
}
    
}
