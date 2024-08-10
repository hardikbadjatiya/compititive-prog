
import java.util.Arrays;
import java.util.Scanner;

public class EvenOdd {
public static void main(String[] args) {
   Scanner sc =new Scanner (System.in);
   int n=sc.nextInt();
//   int a=sc.nextInt();
   int x=0;
   int y=0;
   if(n%2==0){
       x=n/2;
       y=n/2;
   }
   else{
       x=(n+1)/2;
   y=n/2;
   }
    System.out.println(x+""+y);
   int[] odd=new int[x];
   int[] eve=new int[y];
   int c=0;
           int b=0;
   
   for(int i=1;i<=n;i++)
   {
       
       if(i%2!=0)
       {
//           int c=1;
           odd[c]=i;
           
   c++;
       }
      else if(i%2==0)
       {
           eve[b]=i;
   b++;
           
       }
       }
    System.out.print(Arrays.toString(odd));
    System.out.print(Arrays.toString(eve));
   
}
    
}
