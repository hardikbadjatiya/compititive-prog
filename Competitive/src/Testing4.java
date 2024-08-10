
import java.util.Arrays;
import java.util.Scanner;

public class Testing4 {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int n=sc.nextInt();
    int ar[]=new int[12];
    for(int i=0;i<12;i++)
    {
        ar[i]=sc.nextInt();
        
    }
    Arrays.sort(ar);
    int x=0;
    int u=0;
    if(n==0)
        {
            System.out.println(0);
            
        }
    else{
    for(int i=11;i>=0;i--)
    {
        
        x=x+ar[i];
        
        if(x>=n)
        {
            u=12-i;
            break;
        }
        
        
    }
    if(u==0)
    {
        System.out.println("-1");
    }
    else{
        System.out.println(u);
    } 
    
    }
}
}
