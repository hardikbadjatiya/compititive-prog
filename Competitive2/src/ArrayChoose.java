
import java.util.Scanner;

public class ArrayChoose {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int k=sc.nextInt();
   for(int j=0;j<k;j++)
   {
       int n=sc.nextInt();
       int ar[]=new int[n];
       int arr[]=new int[n];
       for(int i=0;i<n;i++)
       {
           ar[i]=sc.nextInt();
           arr[i]=ar[i];
       }
       if(n==1)
       {
           if(ar[0]%2==0)
           {
               System.out.println("1");
               System.out.println("1");
           }
           else{
               System.out.println("-1");
           }
       }
       if(n>=2)
       {
           if(ar[0]%2!=0&&ar[1]%2!=0)
           {
               System.out.println("2");
               System.out.println("1"+" "+"2");
           }
           else if(ar[0]%2==0){
               System.out.println("1");
               System.out.println("1");         
           }
           else if(ar[0]%2!=0&&ar[1]%2==0){
               System.out.println("1");
               System.out.println("2");
           }
       }
       
       
       
//       int s=0;
//       int x=0;
//       int y=0;
//       int u=0;
//       for(int i=0;i<n;i++)
//       {
//           for(int l=i;l<n;l++)
//           {
//               s=s+ar[l];
//               if(s%2==0)
//               {
//                u=1;
//                  x=i;
//                  y=l;
//                  break;
//                }
//           }
//       }
//       
//       if(x==0&&y==0&&u==0)
//       {
//           System.out.println("-1");
//       }
//       
//       if(x==0&&y==0&&u==1)
//       {
//           System.out.println("1");
//           System.out.println(ar[0]);
//       }
//       if(x>0&&y==0)
//       {
//           System.out.println("1");
//           System.out.println(x+1);
//       }
//       if(x>=0&&y>0)
//       {
//           
//           System.out.println(y-x+1);
//           if(x==y)
//           {
//               System.out.println(x+1);
//           }
//           else{
//       for(int i=x+1;i<=y+1;i++)
//       {
//           System.out.print(i+" ");
//           
//       }
//           System.out.println("");
//        
//       }}
      
   }
}
    
}
