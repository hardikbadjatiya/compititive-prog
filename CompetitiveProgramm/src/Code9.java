
import java.util.Scanner;

public class Code9 {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int t=sc.nextInt();
   for(int k=0;k<t;k++)
   {
       int n=sc.nextInt();
        int p[]=new int[n];
        int c[]=new int[n];
           p[0]=sc.nextInt();
           c[0]=sc.nextInt();
        int x=1;
           if(p[0]<c[0])
           {
           x=0;    
           }
        for(int i=1;i<n;i++)
        {
           p[i]=sc.nextInt();
           c[i]=sc.nextInt();
           if(p[i]<c[i]||p[i]<p[i-1]||c[i]<c[i-1])
           {
               x=0;
              
           }
           if(p[i]==p[i-1]&&c[i]>c[i-1])
           {
               x=0;
           }
           }
        if(x==0)
        {
            System.out.println("NO");
        }
        if(x==1)
        {
            System.out.println("YES");
        }
   }

}
}
