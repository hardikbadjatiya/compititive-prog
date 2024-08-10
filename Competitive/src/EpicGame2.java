
import java.util.Scanner;

public class EpicGame2 {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int a=sc.nextInt();
   int b=sc.nextInt();
   int n=sc.nextInt();
    int x=n;
    int c=0;
    int d=0;
 
     while(x>0){ 
      for(int i=a;i>=1;i--)
      {
          if(a%i==0&&x%i==0&&x>0)
          {
              x=x-i;
              ++c;
              break;
          }
   }
                
      for(int k=b;k>=1;k--)
      {
          if(b%k==0&&x%k==0&&x>0)
          {
              
              x=x-k;
              ++d;
              break;
          }
      
   }}
   if(c>d)
   {
       System.out.println("0");
   }
   else if(c==d){
       System.out.println("1");
   }
}
    
}
