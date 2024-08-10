package Pack;

import java.util.Scanner;

public class StronNo {
  public static  int factorial(int fact)
   {
       int f=1;
       for(int i=fact;i>=1;i--)
       {
           f=f*i;
       }
       return f;
   }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        String st=Integer.toString(n);
        int sum=0;
        int l=st.length();
        for(int i=0;i<l;i++)
        {
         int x=  Integer.parseInt( Character.toString( st.charAt(i)));
        sum=sum+StronNo.factorial(x);
        
        }
        if(sum==n)
        {
            System.out.println("Yes");
        }
        
    }
    
}
