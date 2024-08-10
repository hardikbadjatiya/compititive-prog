
import java.util.Arrays;
import java.util.Scanner;

public class sdsd {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int t=sc.nextInt();
   while(t-->0)
   {
       int n=sc.nextInt();
       int ar[]=new int[n];
       
       for(int i=0;i<n;i++)
      {
          ar[i]=sc.nextInt();
          
      }
       Arrays.sort(ar);
      String st=Arrays.toString(ar);
           
       int arr[]=new int[n];
     int x=-1;
       for(int i=1;i<=1023;i++)
       {
             arr=ar.clone();
           for(int j=0;j<n;j++)
           {
             arr[j]=arr[j]^i;
           }
           Arrays.sort(arr);
           String s=Arrays.toString(arr);
           if(st.equals(s))
           {
           x=i;
               break;
           }
       }
       System.out.println(x);
   }
}
    
}
