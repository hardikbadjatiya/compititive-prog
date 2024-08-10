
import java.util.Scanner;

public class Testing2 {
    public static void prime( int n)
    {
         int i,flag=0;
         int x=0;
         int y=0;
         
        
   for(i=4;i<=n/2;i++){   
       if(n!=i)
           
    if(n%i==0){      
    if((n-i)%i==0)
    {
        
        x=i;
        y=n-i;
        break;
    }
        
    }
   }
        System.out.println(x+" "+y);
    }
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   prime(n);
}
    
}
