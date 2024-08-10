
import java.util.Arrays;
import java.util.Scanner;

public class BlackSq {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int ar[]=new int[4];
   for(int i=0;i<4;i++)
   {
       ar[i]=sc.nextInt();
       
   }
   Arrays.sort(ar);
    System.out.println(ar[3]-ar[0]);
    System.out.println(ar[3]-ar[1]);
    System.out.println(ar[3]-ar[2]);
    
}
    
}
