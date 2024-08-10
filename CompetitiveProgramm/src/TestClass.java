/* IMPORTANT: Multiple classes and nested static classes are supported */
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        */

        // Write your code here
  Scanner sc = new Scanner(System.in);
    long n=sc.nextLong();
    long k=sc.nextLong();
    if(k<5)
    {
        if(k==0)
        {
            System.out.println(n%10);
        }
        else if(k>0&&k<5)
        {
            long w=1;
            for(long i=k;i>=1;i--)
            {
                w=w*i;
            }
            long s=w%10;
            long l=(long)Math.pow(n,s);
            System.out.println(l%10);
        }
    }
    else{
        System.out.println("1");
        }
    }
}
