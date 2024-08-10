
import java.util.Arrays;
import java.util.Scanner;

public class TeamOly {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   int ar[]=new int[n];
   int arr[]=new int[n];
   int a=0;
   int b =0;
   int c=0;
   for(int i=0;i<n;i++)
   {
       ar[i]=sc.nextInt();
       if(ar[i]==1)
       {
           ++a;
       }
        if(ar[i]==2)
       {
           ++b;
       } if(ar[i]==3)
       {
           ++c;
       }
       arr[i]=i+1;
   }
   for(int i=0;i<n;i++)
   {
       int x=0;
       int y=0;
       for(int j=0;j<n-1;j++)
       {
           if(ar[j]>ar[j+1])
           {
              x=ar[j];
              ar[j]=ar[j+1];
              ar[j+1]=x;
              y=arr[j];
              arr[j]=arr[j+1];
              arr[j+1]=y;
           }
       }
   }
   if(a==0||b==0||c==0)
   {
       System.out.println(0);
   }
   else {if(a>=b&&a>=c)
   {
       int f=Math.min(b, c);
       System.out.println(f);
       for(int i=0;i<f;i++)
       {
           System.out.println(arr[i]+" "+arr[a+i]+" "+arr[a+b+i]);
       }
   }
   if(b>a&&b>=c)
   {
       int f=Math.min(a, c);
       System.out.println(f);
       for(int i=0;i<f;i++)
       {
           System.out.println(arr[i]+" "+arr[a+i]+" "+arr[a+b+i]);
       }
   }if(c>a&&c>b)
   {
       int f=Math.min(a, b);
       System.out.println(f);
       for(int i=0;i<f;i++)
       {
           System.out.println(arr[i]+" "+arr[a+i]+" "+arr[a+b+i]);
       }
   }
   }
}
    
}
