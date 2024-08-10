
import java.util.Scanner;

public class dsfgh {
public static void main(String[] args) {
    
    Scanner sc =new Scanner(System.in);
    
    int t=sc.nextInt();
    
    while(t-->0)
    {
        int n=sc.nextInt();
        double s=sc.nextDouble();
        double v=sc.nextDouble();
        double e=s/v-(long)(s/v);
        long y=0;
       
        for(int i=0;i<n;i++)
        {
            y=y+(long)(10*e);
            e=e*10-(long)(e*10);
            
        }
        System.out.println(y);
       
    }
}
        
}
