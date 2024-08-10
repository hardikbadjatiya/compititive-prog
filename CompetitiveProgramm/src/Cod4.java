
import java.util.Arrays;
import java.util.Scanner;

public class Cod4 {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int t=sc.nextInt();
   while(t-->0)
   {
      int n=sc.nextInt();
      int ar[]=new int[n];
      int arr[]=new int[n];
      
      for(int i=0;i<n;i++)
      {
        ar[i]=sc.nextInt();
      arr[i]=0;
      }
    int g=0;
  int w=0;
    for(int j=0;j<n;j++)
   {
     int x=1;

    for(int i=0;i<n;i++)
    {
        if(ar[i]>=x&&arr[i]==0)
        {
            x=x+1;
            arr[i]=1;
          ++w;  
        }
        
    }
    
    if(x>1)
    {
        ++g;
    }
    if(w==n)
    {
     break;   
    }
    
    }
       System.out.println(g);
}
}    
}
