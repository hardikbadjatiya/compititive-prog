
import java.util.Scanner;

public class IQtest {
public static void main(String[] args) {
   Scanner sc =new Scanner (System.in);
   int n=sc.nextInt();
   int ar[]=new int[n];
   int x=0;
   int y=0;
   int a=0;
   int b=0;
   for(int i=0;i<n;i++)
   {
       ar[i]=sc.nextInt();
       if(ar[i]%2==0)
       {
           ++x;
//           if(x>2)
//           {
//               continue;
//           }
//           else {
//               if(x==2)
//               {
//                   continue;
//               }
//               else{
//                   
//               System.out.println(ar[i]);
//           }}
       }
   
       else if(ar[i]%2!=0)
       {
           ++y;
//           if(y>2)
//           {
//               continue;
//           } 
//           else{
//               System.out.println(ar[i]);
//           }
       }
   }
   if(x==1)
   {
    for(int i=0;i<n;i++)
    {
        if(ar[i]%2==0)
        {
            System.out.println(i+1);
        }
    }
    
   }
   else if(y==1){
       for(int i=0;i<n;i++)
       {
           if(ar[i]%2!=0)
           {
               System.out.println(i+1);
           }
       }
   }
}
    
}
