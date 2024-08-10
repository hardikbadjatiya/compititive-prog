
import java.util.Arrays;
import java.util.Scanner;

public class ChooseTwoNum {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int a=sc.nextInt();
   int ar[]=new int[a];
   for(int i=0;i<a;i++)
   {
       ar[i]=sc.nextInt();
       
   }
   int b=sc.nextInt();
   int br[]=new int[b];
   for(int i=0;i<b;i++)
   {
       br[i]=sc.nextInt();
   }
   int x=0;
   for(int i=0;i<a;i++)
   {
       for(int j=0;j<b;j++)
       {
           x=ar[i]+br[j];
          String y=Integer.toString(x);
           if(Arrays.toString(ar).contains(y)||Arrays.toString(br).contains(y))
           {
               
           }
           else
           {
               System.out.println(ar[i]+" "+br[j]);
               System.exit(0);
           }
       }
   }
}
    
}
