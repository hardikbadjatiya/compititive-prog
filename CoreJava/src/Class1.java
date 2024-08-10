
import java.util.Scanner;

 class Classd {
public static void main(String[] ar) {
    Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int w=0;
for(int i=2;i<=5;i++)
{
    if(n%i==0)
    {
        w=i;
        break;
    }
}
int y=0;
        int a=n/w;
        int x=n%a;
        y=  Math.max(a,w);
        int u=0;
        if(w%2==0)
        {
            u=2;
            System.out.println(y*y-2);
        }
        else{
            u=1;
            System.out.println(y*y+1);
            }
          
        
       
        
        System.out.println();
}
    
}
