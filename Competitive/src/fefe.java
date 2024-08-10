
import java.util.Scanner;

public class fefe {
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
    if(ar[0]<ar[n-1])
    {
        System.out.println("YES");
    }
    else{
        System.out.println("NO");
    }
   }
}
    
}
