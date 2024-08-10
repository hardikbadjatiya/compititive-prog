
import java.util.Arrays;
import java.util.Scanner;

public class Code15 {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int t=sc.nextInt();
    for(int k=0;k<t;k++)
    {
       int n=sc.nextInt();
       long arr[]=new long[n];
       for(int i=0;i<n;i++)
       {
           arr[i]=sc.nextLong();
       }
       Arrays.sort(arr);
       String st ="";
       for(int i=n/2;i>=i;i++)
       {
           
           st=st+arr[i]+" ";
           
       }
    }
}
    
}
