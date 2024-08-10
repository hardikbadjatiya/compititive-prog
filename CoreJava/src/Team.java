
import java.util.Scanner;

public class Team {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int n;
   n=sc.nextInt();
   //byte a=0;
  // byte b=0;
   //byte c=0;
   int COUNT=0;
   for(int i=0;i<n;++i)
   {
     
        if((sc.nextInt()+sc.nextInt()+sc.nextInt())>=2)
        {
            ++COUNT;
        }
        //System.out.println(a);
      

   }
    System.out.println(COUNT);
   //System.out.println(a);
//   for(int i=0;i<n;i++)
//   {
//       if(a==0&&b==1&&c==1)
//       {
//           COUNT++;
//       }
//       if(a==1&&b==0&&c==1)
//       {
//           COUNT++;
//       }
//       if(a==1&&b==1&&c==0)
//       {
//           COUNT++;
//       }
//   
   }
//    System.out.println(COUNT);

    
}
