
import java.util.Scanner;

public class wertyui 
{
    static int calculate(int x)
    {
        if(x==0)
        {
           return 1; 
        }
        if(x==1)
        {
           return 1;
        }
        return calculate(x-1)+calculate(x-2);
    }
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in)
;
   int n=11;
   int x=calculate(n);
    System.out.println(x);
}
        
}
