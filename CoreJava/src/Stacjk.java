
import java.util.Scanner;

public class Stacjk {
    static int[] shift(int ar[])
    {
        int n=ar.length;
        int a=ar[0];
        for(int i=0;i<n-1;i++)
        {
            ar[i]=ar[i+1];
        }
        ar[n-1]=a;
       return ar;
    }
    static int check(int ar[], int arr[],int  x)
    {
        
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]!=arr[i])
            {
                ++x;
              return check(Stacjk.shift(arr),ar ,x);
            }
          }
        
        return x+1;
    }
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   int ar[]=new int[n];
   int arr[]=new int[n];
   for(int i=0;i<n;i++)
   {
       ar[i]=sc.nextInt();
   }
   for(int i=0;i<n;i++)
   {
       arr[i]=sc.nextInt();
   }
  int r=0;
  int x=Stacjk.check(ar, arr, r);
    System.out.println(x+n);
}
    
}
