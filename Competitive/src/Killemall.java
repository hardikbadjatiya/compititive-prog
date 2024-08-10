
import java.util.Scanner;

public class Killemall {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   String st=sc.next();
   int n=st.length();
   char ch[]=new char[n];
   ch[0]=st.charAt(0);
   int x=0;
   x=Math.min(ch[0]-97, 122-ch[0]+1);
   for(int i=1;i<n;i++)
   {
       ch[i]=st.charAt(i);
       if(ch[i]>=ch[i-1])
       {
       x=x+Math.min( ch[i]-ch[i-1] , 122-ch[i]+ch[i-1]-97+1 );

       }
       else if(ch[i]<ch[i-1]){
       x=x+Math.min( ch[i-1]-ch[i] , 122-ch[i-1]+ch[i]-97+1 );
       
       
       }
       
   }
       
    System.out.println(x);
}
    
}
