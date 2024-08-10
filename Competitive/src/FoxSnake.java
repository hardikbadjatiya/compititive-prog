
import java.util.Scanner;

public class FoxSnake {
public static void main(String[] args) {
    int count=0;
   Scanner sc=new Scanner (System.in);
   int r=sc.nextInt();
   int c=sc.nextInt();
   for(int i=1;i<=r;i++)
   {
       if(i==1)
       {
       for(int j=1;j<=c;j++)
        {
           System.out.print("#");
        }
         
       }
       else if(i%2==0&&count==0)
       { System.out.print("\n");
       
           for (int j=0;j<c-1;j++)
           {
               System.out.print(".");
           }
           System.out.print("#");
           count++;
       }
       else if(i%2==0&&count==1)
       { System.out.print("\n");
        System.out.print("#");
             
       for (int j=0;j<c-1;j++)
           {
               System.out.print(".");
           }
           count--;
       }
      else  if(i%2==1)
       {
           System.out.print("\n");
       for(int j=1;j<=c;j++)
        {
           
           System.out.print("#");
        }
   }
//    for(int i=1;i<r;i++)
//    {
//       if(i%2==0 && count==0)
//       {
//           for(int j=1;j<c;j++)
//           {
//                if(j<c)
//                {
//                    System.out.print(".");
//                }
//                else
//                {
//                    System.out.print("#");
//                    count++;
//                }
//        
//            }
//       }
//       else
//       {
//                for(int j=1;j<c;j++)
//                {
//                    if(j==1)
//                    {
//                        System.out.print("#");
//                    } 
//                    else
//                    {
//                        System.out.print(".");
//                        count--;
//                    }
//                }   
//           
//   
//       
//       }
   
}
    
}
}