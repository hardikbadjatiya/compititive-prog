
import java.util.Scanner;

public class Shu {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int k=sc.nextInt();
   for(int i=0;i<k;i++)
   {
       int n=sc.nextInt();
       int m=sc.nextInt();
       int p=n/m;
       int o=0;
       int e=0;
       if(p==1)
       {
           e=p;
          o=1;
       }
       if(p>m&&o==0)
       {
           e=p-m+(m-1);
   o=1;
       }
       if(p<=m&&o==0)
       {
       e=2;
       }
       System.out.println(e);
   }
}
    
}
