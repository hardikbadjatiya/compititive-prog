
import java.util.Scanner;

public class RepeatingCypher {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int k=sc.nextInt();
    int n=0;
    int m=0;
    for(int i=0;i<k;i++)
    {
    int p=sc.nextInt();
    if(p==25)
    {
        n++;
        
    }
  else  if(p==50)
    {
        if(n>0)
        {
            --n;
            ++m;
        }
        else{
            System.out.println("NO");
            System.exit(0);
        }
    }
  else if(p==100)
    {
         if(n>0&&m>0)
            {
            n--;
            m--;
            }
        else if(n>2&&m==0)
        {
            n=n-3;
        }
        
        else{
            System.out.println("NO");
            System.exit(0);
        }
    }
    }
        System.out.println("YES");
    
    }
    
}
