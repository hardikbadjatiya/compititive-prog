
import java.util.Scanner;

public class StrTask {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
long a=sc.nextLong();
long b=sc.nextLong();
long s=0;    
for(int i=0;i<64;i++)
    {
    if(b==Math.pow(2, i))
    {
        s=i;
        break;
    }
    if(b<Math.pow(2, i))
    {
        s=i-1;
        break;
    }
    }
  
long e=(long)Math.pow(2, s)-a;
    long d=b-(long)Math.pow(2, s)+1;
    long we=(long)(Math.pow(2, s+1)-Math.pow(2, s));
    long t=Math.min(d+e,we);
    
    System.out.println(t+((long)Math.pow(2, s)-a));
    
}
    
}
