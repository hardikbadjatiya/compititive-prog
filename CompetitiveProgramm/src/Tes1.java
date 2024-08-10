
import java.util.Scanner;

public class Tes1 {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int t=sc.nextInt();
   while(t-->0)
   {
    int n=sc.nextInt();
    int m=sc.nextInt();
    int ar[]=new int[n];
    int o=0;
    int e=0;
    for(int i=0;i<n;i++)
    {
    ar[i]=sc.nextInt();
    if(ar[i]%2==0)
    {
        ++e;
    }
    else
    {
        ++o;
    }
    }
  
    int x=0;
    if(m<n)
    {
        if(o>0&&e>0)
        {
         x=1; 
        }
        else if(m%2==1&&o>=m)
        {
            x=1;
        }
        
    }
    else{
        if(o%2==1)
        {
            x=1;
        }
    }
    if(x==1)
    {
        System.out.println("Yes");
    }
    else
    {
        System.out.println("No");
    }
        
   }
}
    
}
