
import java.util.Scanner;

public class Code18 {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int t=sc.nextInt();
    for(int k=0;k<t;k++)
    {
        long n=sc.nextLong();
        if(n>2)
        {
            long x=(n/2)-1+n%2;
            System.out.println(x);
        }
        else{
            System.out.println(0);
        }
    }

}    
}
