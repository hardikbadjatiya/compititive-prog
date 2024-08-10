
import java.util.Scanner;
import java.util.*;
public class BugWriter {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   double d=sc.nextDouble();
   double ca=sc.nextDouble();
   double fa=sc.nextDouble();
   double oa=sc.nextDouble();
   double ct=sc.nextDouble();
   double mt=sc.nextDouble();
   double bt=sc.nextDouble();
   double et=sc.nextDouble();
    
    double costf=0;
    double costt=0;
//    if(d-(long)d!=0){
//       d=(long)d+1;
//    }
       if(d<=fa)
    {
        costf=ca;
    }
            else if(d>fa){
                double otmil=d-fa;
                costf=ca+(oa*otmil);
            }
               double minute=d/mt;
               costt=(ct*minute)+bt+(et*d);
           
//           else if((long)d%mt!=0)
//           {
//               double minute=(long)(d/mt)+1;
//               costt=ct*minute+bt+(et*d);
//               
//           }
           if(costt<costf)
           {
               System.out.println("Joey takes train");
           }
           else{
               System.out.println("Joey takes the flight");
           }
}
    
}
