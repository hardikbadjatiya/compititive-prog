
import java.util.Arrays;
import java.util.Scanner;

public class Puzzles {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int n=sc.nextInt();
   int m=sc.nextInt();
   int ar[]=new int[m];
   for(int i=0;i<m;i++)
   {
       ar[i]=sc.nextInt();
   }
   Arrays.sort(ar);
    System.out.println(Arrays.toString(ar));
   int arr[]=new int[m-1];
   
  for(int j=0;j<m-1;j++)
      {
          System.out.println(ar[j]+" "+ar[j+1]);
          arr[j]=ar[j+1]-ar[j];
      }
  
    System.out.println(Arrays.toString(arr));
}
        
}
