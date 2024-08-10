
import java.util.Scanner;

public class adsaf {
public static void main(String[] args) {
    Scanner sc=new Scanner (System.in);
     long a=sc.nextInt();
     String st="";
    int x=2;
    int i=0;
    while(a-->0)
    {
        if((long)Math.pow(x,i)>30000)
        {
        x=x++;
        i=1;
        }
        
        st=st+(long)Math.pow(x,i)+" ";
        i++;
    }
     System.out.println(st);
}
    
}
