
import java.util.Scanner;

public class Matrix1 {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int ar[][]=new int [5][5];
   int x=0;
   int y=0;
   for(int i=0;i<5;i++)
   {
       for(int j=0;j<5;j++)
       {
           ar[i][j]=sc.nextInt();
           if(ar[i][j]==1)
           {
//               System.out.println(i+1);
//               System.out.println(j+1);
               x=i+1;
               y=j+1;
               if(x>=3&&y>=3)
               {
                   System.out.println(x+y-6);
               }
               else
               if(x<3&&y<3)
               {
                   System.out.println(6-x-y);
               }
               else if(x>=3&&y<3)
               {
                   System.out.println(x-y);
               } 
               else if(x<3&&y>=3)
               {
                   System.out.println(y-x);
               }
               break;
               
           }
           
           
       }
   }
//    System.out.println(x);
//    System.out.println(y);
//    
//   int x=0;
//   int y=0;
//   for(int i=0;i<5;i++)
//   {
//       for(int j=0;j<5;j++)
//       {
////           ar[i][j]=sc.nextInt();
//            if(ar[i][j]==1)
//           {
//               i=x;
//               j=y;
//           }
//               
//       }
//   }
//  System.out.println(ar[][]);
    
    
}
    
}
