
import java.util.Scanner;

public class Physicist {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   int ar1[]=new int[n];
   int ar2[]=new int[n];
   int ar3[]=new int[n];
   int s1=0;
   int s2=0;
   int s3=0;
   
   for(int i=0;i<n;i++)
   {
       ar1[i]=sc.nextInt();
       s1=s1+ar1[i];
       ar2[i]=sc.nextInt();
       s2=s2+ar2[i];
       ar3[i]=sc.nextInt();
       s3=s3+ar3[i];
   
   }
   if(s1==0&&s2==0&&s3==0)
   {
       System.out.println("YES");
   }
   else{
       System.out.println("NO");
   }
}
}
