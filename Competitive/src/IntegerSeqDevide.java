
import java.util.Scanner;

public class IntegerSeqDevide {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int n=sc.nextInt();
   int x=(n+1)/2;
   if(x%2==0)
   {
       System.out.println("0");
   }
   else if(x%2==1){
       System.out.println("1");
   }
}
    
}
