
import java.util.Arrays;
import java.util.Scanner;
public class NonZero {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(int i=0;i<n;i++)
    {
        int k=sc.nextInt();
        int ar[]=new int[k];
        int arr[]=new int[k];
        int z=0;
        int mine=0;
        int sum=0;
        int mul=1;
        for(int l=0;l<k;k++)
        {
            ar[l]=sc.nextInt();
            arr[l]=ar[l];
            sum=sum+ar[l];
            mul=mul*ar[l];
            if(ar[l]==0)
            {
                ++z;
            }
            if(ar[l]==-1)
            {
                ++mine;
            }
        }
        
        if(mul==0&&sum==0)
        {
            System.out.println(z);
            System.exit(0);
        }
        if(mul==0&&sum!=0)
        {
            if(z+sum==0)
            {
            System.out.println(z+1);
            System.exit(0);
            }
            System.out.println(z);
            System.exit(0);
        }
        
        
   }
}
    
}
