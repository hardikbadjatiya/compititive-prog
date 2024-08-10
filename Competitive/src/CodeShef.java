
import java.util.Scanner;

public class CodeShef {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
  int n=sc.nextInt();
  for(int i=0;i<n;i++)
  {
      long a=sc.nextLong();
      long b=sc.nextLong();
      for(int j=0;j<10000;i++)
      {
           if(a==b)
                {
                    System.out.println("YES");
                break;}
            if(a<b&&a%2==0)
            {
                a=(3*a)/2;
                if(a==b)
                {
                    System.out.println("YES");
                break;}
                
            }
            else
            {
                if(a>b)
                {
                    a=a-1;
                     if(a==b)
                {
                    System.out.println("YES");
                break;
                }
                }
            }
            
          
  }
      System.out.println("NO");
  }
  
        
   

} 
}
