
import java.util.Arrays;
import java.util.Scanner;

public class PashMakFlow {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int n=sc.nextInt();
   int ar[]=new int[n];
   
   for(int i=0;i<n;i++)
   {
       ar[i]=sc.nextInt();
   }
   Arrays.sort(ar);
   long a=0;
   long b=0;
   long num=1;
   int max=ar[n-1]-ar[0];
   if(max>0){
       for(int i=0;i<n;i++)
   {
    if(ar[i]==ar[0])
    {
        ++a;
    }
    if(ar[i]==ar[n-1])
    {
        ++b;
    }
    
   }
   num=(long)a*(long)b;
   }
   else{
       num=(long)n*(long)(n-1)/2;
   }
   
   
                if(ar[0]==ar[n-1])
        	System.out.println(max+" "+num);
		else
                 System.out.println(max+" "+num);
   
}
    
}
