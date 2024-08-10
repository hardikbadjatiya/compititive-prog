
import java.util.Scanner;

public class Dragons {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int s=sc.nextInt();
   int n=sc.nextInt();
   int y=0;
   int ar1[]=new int[n];
   int ar2[]=new int[n];
   
    for(int i=0;i<n;i++)
   {
       ar1[i]=sc.nextInt();
       ar2[i]=sc.nextInt();
       
   }
   for(int i=0;i<n;i++)
   {   
       for(int j=0;j<n-1;j++){
       int a=ar1[j];
       int b=ar2[j];
       if(ar1[j]>ar1[j+1])
       {
           
           ar1[j]=ar1[j+1];
           ar1[j+1]=a;
           ar2[j]=ar2[j+1];
           ar2[j+1]=b;
           
       }
   }
   }
   for(int i=0;i<n;i++)
   {
              if(s>ar1[i])
       {
           s=s+ar2[i];
           y++;
       }
   }
if(y==n)
{
    System.out.println("YES");
}
else{
    System.out.println("NO");
}
   }

   
    
}
