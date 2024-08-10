

import java.math.BigInteger;
import java.util.Scanner;


public class asas {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int ar[]=new int[n];
            int count=1,min=Integer.MAX_VALUE,max=0;
            for(int i=0;i<n;i++)
            {
                ar[i]=sc.nextInt();
            }
            for(int i=1;i<n;i++)
            {
                if(ar[i]-ar[i-1]<=2)
                {
                    count++;
                    if(i==n-1)
                    {
                        if(min>count)
                        {
                           min= count;
                        }
                        if(max<count)
                        {
                            max=count;
                        }
                        count=1;
                        
                    }
                }
                else
                {
                        if(min>count)
                        {
                           min= count;
                        }
                        if(max<count)
                        {
                            max=count;
                        }
                        if(i==n-1)
                        {
                            
                        }
                        count=1;
                }
            }
            System.out.println(min+" "+max);
        }
    }
}