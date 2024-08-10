
import java.util.Arrays;
import java.util.Scanner;

public class TPrime {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int n=sc.nextInt();
   int ar[]=new int[n];
   double arr[]=new double[n];
  int[] a=new int[10000001];
       for(int i=2;i<=1000000;i++)
       {
           a[i]=1;
       }
       for(int i=2;i<=1000;i++)
       {
           for(int j=2*i;j<=1000000;j+=i)
           {
               a[j]=0;
           }
       }
   for(int i=0;i<n;i++)
   {
       ar[i]=sc.nextInt();
       
   }
   
   for(int i=0;i<n;i++)
   {
   int x=0;
   float y=0;
       
      
//           if(ar[i]>1000)
//           {
//               y=1;
//           break;
//           }
//           else if(ar[i]%(j)==0)
//       {
//       ++x;
//       
//       }
          arr[i]=  Math.sqrt(ar[i]);
          System.out.println(Arrays.toString(arr));
       for(int j=2;j<arr[i]/2;j++)
       {    
            if (arr[i] == (int)arr[i] && a[(int)arr[i]] == 1){
                System.out.println("YES");
            }
            else
                System.out.println("NO");
       }
           
           
}
     
//       if(x==3)
//  {
//      System.out.println("YES");
//  }
//       else if(x!=3||y==1){
//      System.out.println("NO");
   
}}