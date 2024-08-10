
import java.util.Scanner;

public class VasyaCoder {
    void sort(int arr[]) 
    { 
        int n = arr.length; 
    for (int i = 0; i < n-1; i++) 
        { 
//            int min_idx = i; 
//            for (int j = i+1; j < n; j++) 
//                if (arr[j] < arr[min_idx]) 
//                    min_idx = j; 
        int x=0;
        for(int j=i+1;j<n;i++)
        {
            if(arr[i]>arr[j])
            {
                ++x;
            }
        }
        } 
    } 
public static void main(String[] args) {
    
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   int ar[]=new int[n];
   for(int i=0;i<n;i++)
   {
       ar[i]=sc.nextInt();
       
   }
   VasyaCoder vs=new VasyaCoder();
   vs.sort(ar);
   
}
    
}
