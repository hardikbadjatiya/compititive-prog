
import java.util.Arrays;
import java.util.Scanner;

public class BabaBls {
    public static void main(String[] args) {
Scanner sc=new Scanner (System.in);
   int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int k=sc.nextInt();
            int ar[]=new int[k];
            for(int l=0;l<k;l++)
            {
                ar[l]=sc.nextInt();
            }
            Arrays.sort(ar);
            System.out.println(ar[k-1]);
        }
    }
       
}
