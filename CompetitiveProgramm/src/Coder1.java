
import java.util.Arrays;
import java.util.Scanner;

public class Coder1 {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int t=sc.nextInt();
   while(t-->0)
   {
       int n=sc.nextInt();
       int ar[]=new int[n];
       int e=0;
       int o=0;
       for(int i=0;i<n;i++)
       {
           ar[i]=sc.nextInt();
           if(ar[i]%2==0)
           {
               e++;
           }
           else{
               o++;
           }
       }
     if(o%2==0&&e%2==0)
     {
         System.out.println("YES");
     }
     else{
      int arr[]=new int[n];
      int a[]=new int[n];
     Arrays.sort(ar);
     int c=0; 
     for(int i=0;i<n-1;i++)
      {
          if(ar[i+1]-ar[i]==1)
          {
              c++;
          }
      }
        if(c>0)
        
       System.out.println("YES");
        
        else{
            System.out.println("NO");
        }
     }
     
   }
}
    
}
