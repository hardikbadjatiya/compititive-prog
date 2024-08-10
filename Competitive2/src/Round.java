import java.io.*;
import java.util.*;

public class Round {

    public static  String swap( String st )
    {
        int l=st.length();
        if(l%2==0)
        {
            for(int i=0;i<l/2;i++)
            {
                st=st.replace(st.charAt(2*i),st.charAt(2*(i+1)) );
            }
        }
        return st;
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int a=sc.nextInt();
            String st=sc.next();
        }
        
    }
    
}