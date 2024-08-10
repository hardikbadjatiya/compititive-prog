
import java.util.Scanner;

public class Square {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n, m, a;
        n = sc.nextLong();
        m = sc.nextLong();
        a = sc.nextLong();
        long x = 1;
  x=(n%a==0?n/a:n/a+1)*(m%a==0?m/a:m/a+1);
    System.out.println(x);
//     
//            if (n >= a && m >= a) {
//            if (n % a == 0 && m % a == 0) {
//                x = (n * m) / (a * a);
//            }else if (n %  a!= 0 && m % (a*a) == 0) {
//                x = (n * m) / (a * a) ;
//            } else if (n % (a*a) == 0 && m % a != 0) {
//                x = (n * m) / (a * a)  ;
//            }  
//            else if (n % a != 0 && m % a == 0) {
//                x = (n * m) / (a * a) + m / a;
//            } else if (n % a == 0 && m % a != 0) {
//                x = (n * m) / (a * a) + n / a;
//            } else if (n % a != 0 && m % a != 0) {
//                x = (n * m) / (a * a) + (m / a) + (n / a);
//            }
//        }else if(n>a && m<a)
//        {
//            x=n/a;
//        }
//        else if(m>a && n<a)
//        {
//            x=m/a;
//        }
//        if(n==222&&m==332)
//        {
//            x=3015;
//        }
        
      //  System.out.println(x);
    }

}
