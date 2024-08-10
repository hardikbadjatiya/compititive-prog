
import java.util.Scanner;

public class ZomaPlaying {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   String st=sc.next();
   
   int l=0;
   int r=0;
   for(int i=0;i<n;i++)
   {
      if(st.charAt(i)=='L')
      {
          ++l;
      }
      else{
          ++r;
      }
   }
    System.out.println(1+l+r);
}
    
}
