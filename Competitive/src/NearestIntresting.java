
import java.util.Scanner;

public class NearestIntresting {
//    int sum(int a)
//    {
//        for(int i=0;i<12;i++)
//       {a=a+i;
//        int c=a%10;
//        int d=a/10;
//           
//        if((c+d+i)%4==0)
//          {
//           System.out.println(a+i);
//           System.exit(0);
//       }
//       }return a;
//    }
    public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   
   int a=sc.nextInt();
   if(a>97&&a<100)
   {
        System.out.println("103");
   }
   if(a<=97)    
   { for(int i=0;i<12;i++)
       {
   int x=a+i;   
       int c=x%10;
       int d=x/10;
           if((c+d)%4==0)
       {
           System.out.println(x);
           System.exit(0);
       }
   
      }
      
   }
   else if(a>99&&a<997){
       for(int i=0;i<12;i++)
       {
      int y=a+i;
       int c=y%10;
       int d=((y%100)-c)/10;
       int e=y/100;
       if((e+c+d)%4==0)
       {
           System.out.println(y);
           System.exit(0);
       }
       
   }
   }
   else if(a>=997)
       {
           System.out.println(1003);
       }
           
}
    
}
