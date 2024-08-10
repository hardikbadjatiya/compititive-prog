
import java.util.Arrays;
import java.util.Scanner;

public class DiverseTeam {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   int v=sc.nextInt();
   int ar[]=new int[n];
   int arr[]=new int[n];
   for(int i=0;i<n;i++)
   {
       ar[i]=sc.nextInt();
       arr[i]=i+1;
   }
   
   Arrays.sort(ar);
   for(int i=0;i<n-1;i++)
   {
       for(int j=0;j<n-1;j++)
       {
           int t=0;
           int p=0;
           if(ar[j]>ar[j+1])
           {
               t=ar[j];
               ar[j]=ar[j+1];
               ar[j+1]=t;
               p=arr[j];
               arr[j]=arr[j+1];
               arr[j+1]=p;
               
           }
       }
   }
   int b=1;
   for(int i=0;i<n-1;i++)
   {
       if(ar[i]!=ar[i+1])
       {
           ++b;
       }
   }
   int o=0;
   if(b>=v)
   {
       System.out.println("YES");
       for(int i=0;i<n-1;i++)
       {
           if(ar[i]!=ar[i+1]&&o<=v)
       {
           System.out.print(arr[i]+" ");
           o++;
       
       }
           if(o==v-1)
           {
           break;
           }
           
       }
       System.out.print(arr[n-1]);
   }
   else{
       System.out.println("NO");
   }
}
    
}
