
import java.util.Scanner;

public class DiceGame {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
int n=1;
while(n>=0)
{
    int m=sc.nextInt();
    if(m==42)
    {
        System.exit(0);
    }
    System.out.println(m);
}
}
    
}
