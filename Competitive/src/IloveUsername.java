
import java.util.Arrays;
import java.util.Scanner;

public class IloveUsername {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int n=sc.nextInt();
   int ar[]=new int[n];
  if(n==1)
  {
      ar[0]=sc.nextInt();
              
      System.out.println("0");
  }
  else{
      
  
   ar[0]=sc.nextInt();
   ar[1]=sc.nextInt();
   int x;
   if(ar[0]==ar[1])
   {
    x=0;
               
   }
   else
   {
   x=1;    
   }
     int max=Math.max(ar[0],ar[1]);
      int min=Math.min(ar[0],ar[1]);
   
   for(int i=2;i<n;i++)
   {ar[i]=sc.nextInt();
//       if(ar[i]>ar[i-1]||ar[i]<ar[0])
//       {
//       ++x;    
//       }
//       System.out.println(x);
//       Arrays.sort(ar);
//       System.out.println(Arrays.toString(ar));
        if(ar[i]>max)
        {
           max=ar[i];
           ++x;
        }
        else if(ar[i]<min){
            min=ar[i];
            ++x;
        }
   }
    System.out.println(x);
}
}  
}
