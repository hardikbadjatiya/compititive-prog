
import java.util.Scanner;

public class GoodNumbers {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   for(int i=0;i<n;i++)
   {
      int  a=sc.nextInt();
       for(int j=0;j<10;j++)
       {
           if(a<Math.pow(3, j))
           {
               a=(int) Math.pow(3,j);
               System.out.println();
           }
       }
   }
}
        
}
