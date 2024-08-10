
import java.util.Arrays;
import java.util.Scanner;

public class qwertdghjk {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int t=sc.nextInt();
   while(t-->0)
   {
    int n=sc.nextInt();
    int ar[]=new int[n];
  int arr[]=new int[n];
  
    for(int i=0;i<n;i++)
    {
        ar[i]=sc.nextInt();
        arr[i]=ar[i];
    }
    
    Arrays.sort(ar);
    int u=0;
    for(int i=1;i<=n-2;i++)
    {
        int y=ar[i]-ar[0];
        
       int a[]=new int[n];
       for(int j=0;j<n;j++)
       {
           a[j]=ar[j]^i;
       }
       Arrays.sort(a);
       int x=0;
       for(int k=0;k<n;k++)
       {
           if(a[k]!=ar[k])
           {
               x=1;
               break;
           }
       }
       if(x==0)
       {
           u=i;
           break;
       }
    }
    if(u>0)
    {
        System.out.println(u);
    }
    else{
        System.out.println(-1);
        }
    }


}
    
}
