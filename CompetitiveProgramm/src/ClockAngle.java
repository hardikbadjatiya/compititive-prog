
import java.text.NumberFormat;
import java.util.Scanner;



 class ClockAngle {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   double t=sc.nextDouble();
   double r=sc.nextDouble();
   double w=360;
   double e=(t*r)/w;
   double q=e*30;
   double qw=(e-(long)e)*360;
    
    double ses=Math.max(q, qw)-Math.min(q, qw);
    
    if(ses>=180)
    {
    ses=360-ses;    
    }
    System.out.println(ses);
 }
 
}