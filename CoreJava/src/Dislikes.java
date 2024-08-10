
import java.util.Scanner;

public class Dislikes {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   long n=sc.nextInt();
   String st=new String();
   long o=0;
   for(long i=0;i<10;i++)
   {
       long x=sc.nextLong();
      long ar[]=new long[9];
       for(int j=0;j<9;j++)
       {
      ar[j]=sc.nextLong();
      String s=" "+x+"*"+ar[j]+" ";
      String f=" "+ar[j]+"*"+x+" ";
      long l=0;
      if(st.contains(s)||st.contains(f))
      {
          l=1;
      }
      if(l==0)
      {
          st=st+s;
          ++o;
      }
       }
   }
   
    
   long k=((n*(n-1))/2);
    System.out.println(k-o);   
   
}
    
}
