
import java.util.Scanner;

public class Bannas {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int k=0;
   k=sc.nextInt();
   int r=0;
   r=sc.nextInt();
   int n=0;
   n=sc.nextInt();
   int sum=0;
   int sum1=0;
   for(int i=0;i<n;i++)
   {
       sum=k*(i+1);
//       System.out.println(sum);
       sum1=sum1+sum;
   }
    //System.out.println(k);
    if(sum1-r>0)
    {
    System.out.println(sum1-r);
   
}
    else{
        System.out.println(0);
    }
}

    
}
