
import java.util.Scanner;

public class EqualizesPrizes {

    public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int n=sc.nextInt();
   for(int i=0;i<n;i++)
   {
       int k=sc.nextInt();
       int b=0;
       int a=0;
       for(int j=0;j<k;j++)
       {
           a=sc.nextInt();
           b=b+a;
           
       }
       if(b%k==0)
       {
           System.out.println(b/k);
       }
       else{
           System.out.println((b/k)+1);
       }
    }
}
    
}
