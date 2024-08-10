
import java.util.Scanner;

public class Room {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   int ar1[]=new int[n];
   int ar2[]=new int[n];
   int c=0;
   for(int i=0;i<n;i++)
   {
       ar1[i]=sc.nextInt();
       ar2[i]=sc.nextInt();
       if(ar2[i]-ar1[i]>=2)
       {
           c=c+1;
       }
       
   }
    System.out.println(c);
          
}
    
}
