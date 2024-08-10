
import java.util.Scanner;

public class sdfgh {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   
   int t=sc.nextInt();
while(t-->0)
{
    int n=sc.nextInt();
    int m=sc.nextInt();
    int k=sc.nextInt();
    if(n/k>=m)
    {
        System.out.println(m);
    }
    else{
        int y=n/k;
        int u=m-y;
        
        int o=u/(k-1);
       if(u%(k+1)!=0)
       {
           o=o+1;
       }
        
        int g=o;
            
        System.out.println(y-g); 
    }
    }
        

}
   
}
