import java.util.*;
public class Tram {
    public static void main(String[] args) { 
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ar1[]=new int[n];
        int ar2[]=new int[n];
        int sum=0;
        int sum1=0;
        int arr[]=new int[n];
        for(int i=0;i<n;i++ )
        {
            ar1[i]=sc.nextInt();
            sum=sum+ar1[i];
            ar2[i]=sc.nextInt();
            sum1=sum1+ar2[i];
            arr[i]=sum1-sum;
        }
        Arrays.sort(arr);
        System.out.println(arr[n-1]);
//        System.out.println(Arrays.toString(ar1));
//        System.out.println(Arrays.toString(ar2));
            
    }
}
