
import java.util.Scanner;

public class CombinationalLock {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int n=sc.nextInt();
//   long a=sc.nextLong();
//   long  b=sc.nextLong();
    String a=new String();
    a=sc.next();
    
    String b=new String();
    b=sc.next();
    int ar[]=new int[n];  
    int arr[]=new int[n]; 
    int arr1[]=new int[n];
    int arr2[]=new int[n];
    int arr3[]=new int[n];
    int x=0;
    for(int i=0;i<n;i++)
   {
//       if(i==0)
//       {
//   
//           ar[0]=(int) (a%10);
//           arr[0]=(int) (b%10);
//       }
//       else if(i==n-1)
//       {
//           ar[n-1]=(int) (a/Math.pow(10, n-1));
//           arr[n-1]=(int) (b/Math.pow(10, n-1));
//           
//       }
//       
//       else if(i>0||i<n-1)
//               {
//          ar[i]=(int) (a/Math.pow(10, i))%10;
//          arr[i]=(int) (b/Math.pow(10, i))%10;
//          
//       }
       ar[i]=(int)a.charAt(i);
       arr[i]=(int )b.charAt(i);
           arr1[i]=Math.max(ar[i], arr[i])-Math.min(ar[i], arr[i]);
       arr2[i]=(9-Math.max(ar[i], arr[i])+Math.min(ar[i], arr[i])+1 );
       arr3[i]=Math.min(arr1[i], arr2[i]);
       x=x+arr3[i];
   }
    System.out.println(x);
}
    
}
