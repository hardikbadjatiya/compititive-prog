
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MoonyIc {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   
    int n=sc.nextInt();
   for(int p=0;p<n;p++)
  {
     int k=sc.nextInt();
     long ar[]=new long[k];
   
     ar[0]=sc.nextLong();
     ar[1]=sc.nextLong();
     long arr[]=new long[k-2];
       ArrayList <Long> l1=new ArrayList<Long>();
     
     for(int i=2;i<k;i++)
     {
         ar[i]=sc.nextLong();
 long u=ar[i]+ar[i-1]+ar[i-2];
     l1.add(u);
     }
//        long arr1[]=new long[]{ar[0],ar[1],ar[k-1]};
//         long arr2[]=new long[]{ar[1],ar[k-1],ar[k-2]};
//         long arr3[]=new long[]{ar[0],ar[1],ar[k-3],ar[k-1],ar[k-2]};
//         long arr4[]=new long[]{ar[0],ar[k-4],ar[k-3],ar[k-1],ar[k-2]};
//         Arrays.sort(arr1);
//         Arrays.sort(arr2);
//         Arrays.sort(arr3);
//         Arrays.sort(arr4);
        l1.add(ar[0]+ar[1]+ar[k-1]);
         l1.add(ar[k-1]+ar[0]+ar[k-2]);
         
         java.util.Collections.sort(l1);
         System.out.println(l1.get(l1.size()-1)); 
     
     }
   }
   

    
}
