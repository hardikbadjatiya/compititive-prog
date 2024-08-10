
import java.util.Scanner;

public class Candles {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int n=sc.nextInt();
   int m=sc.nextInt();
   int y=n+((n-1)/(m-1));
    System.out.println(y);
}
    
}
