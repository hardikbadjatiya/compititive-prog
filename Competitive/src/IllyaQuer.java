
import java.util.Scanner;

public class IllyaQuer {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   String st=sc.next();
   int m=sc.nextInt();
   int n=st.length();
  int r[]=new int[n];
  r[0]=0;
  for(int i=1;i<n;i++)
  {
      if (st.charAt(i)==st.charAt(i-1))
				r[i]=1;
			else
          r[i]=0;
  }
  for(int i=1;i<n;i++)
  {
      r[i]=r[i]+r[i-1];
  }
  while(m-->0)
   {
       int a = sc.nextInt();
       int b = sc.nextInt();
       System.out.println(r[b-1]-r[a-1]);
   }
}
}
