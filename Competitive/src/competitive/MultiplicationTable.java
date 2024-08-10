package competitive;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int a=sc.nextInt();
        int x=0;
        for (int i=1;i<=n;i++)
        {
            if(a%i==0&&a/i<=n)
            {
                ++x;
            }
        }
        System.out.println(x);
    }
    
}
