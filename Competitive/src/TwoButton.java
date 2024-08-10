
import java.util.Scanner;

public class TwoButton {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int n=sc.nextInt();
   int m=sc.nextInt();
   if(n>=m)
   {
       System.out.println(n-m);
   }
   else{
       int x=0;
       int y=0;
       int c=0;
       int d=0;
       int e=0;
        int f=0;
        {
    while(n!=m){
        if(m%2==0 && m>n)
            m/=2;
            else
            m+=1;
            x++;
    }
     }
//       for(int i=1;i<1000000;i++)
//       {
//           y=(int) (n*Math.pow(2, i));
//           
////           if(m>y)
////           {
////               
////           ++e;
////           }
//if(m>y)
//{
//    continue;
//}
//
//           if(m<y)
//               
//           { 
//               System.out.println(i);
//               System.out.println(y);
//               f=y-m+i;
//               
//               break;
//           }
//           
             
       System.out.println(x);
   }
}
    
}
