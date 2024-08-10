
import java.util.Scanner;

public class BuyShowel {
public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
        int k=sc.nextInt();
        int r=sc.nextInt();
        if(k==r||(k-r)%10==0)
        {
            System.out.println("1");
        }
        else if(k%10==0)
        {
            System.out.println("1");
        }
        else if((k)%10==5)
        {
            System.out.println("2");
        }else {
        for(int i=1;i<=10;i++)
        {
                
        if((k*i)%10==r)
        {
            System.out.println(i);
            break;
        }
        else if((k*i)%10==0)
        {
            System.out.println(i);
            break;
        }
        }
}
        
        
}
    
}
