
import java.util.Scanner;

public class ABTeamForm {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int n=sc.nextInt();
   int m=sc.nextInt();
  if(n==0||m==0)
  {
      System.out.println(0);
  System.exit(0);
  }
  
   if(m>=2*n)
   {
       System.out.println(n);
   }
   if(n>=2*m)
   {
       System.out.println(m);
   }
   if(n==1&&m==1)
   {
       System.out.println("0");
   }
   else if((n>=m&&n<2*m)||(n<=m&&m<2*n))
   {
              int x=0;
              int y=n*m;
              for(int j=0;j<y;j++)
              {
            int l=0;
            if(n>=m&&(n>0&&m>0)&&((n>=1&&m>1)||(n>1&&m>=1)))
            { 
                l=1;           
                ++x;
                n=n-2;
                m=m-1;
             if(m<1||n<1&&(m==1&&n==1)){
                 System.out.println(x);
       System.exit(0);
             }   
            }
             if(m>n&&(n>0&&m>0)&&((n>=1&&m>1)||(n>1&&m>=1)))
            { l=1;
                ++x;
                m=m-2;
                n=n-1;
                
             if(m<1||n<1&&(m==1&&n==1)){
                 System.out.println(x);
       System.exit(0);
            }
             
            }
             if(l==0)
             {
       System.out.println(x);
       System.exit(0);
             }
        }
       System.out.println(x);
        }
   }

    
}
