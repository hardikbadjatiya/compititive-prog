
import java.util.Scanner;

public class OneGcd {
    static int swi(int n)
    {
        
       if(n==14)
       {
           
        System.out.println("2 "+n+" "+(n-1));
        n=n-2;
        System.out.println("2 "+n+" "+(n-1));
        n=n-2;
        System.out.println("2 "+n+" "+(n-1));
        n=n-2;
        System.out.println("2 "+n+" "+(n-1));
        n=n-2;
        System.out.println("2 "+n+" "+(n-1));
        
        n=n-2;
        System.out.println("1 4");
       return 0;
       }
       if(n>=13)
       {
        System.out.println("2 "+n+" "+(n-1));
        n=n-2;
        System.out.println("2 "+n+" "+(n-1));
        n=n-2;
        System.out.println("2 "+n+" "+(n-1));
        n=n-2;
        System.out.println("2 "+n+" "+(n-1));
        n=n-2;
        System.out.println("2 "+n+" "+(n-1));
        
        n=n-2;
        
        return swi(n); 
   
       }
       return n;
        }
public static void main(String[] args) {
   
 Scanner sc=new Scanner(System.in);
  
    int t=sc.nextInt();
   
     for(int k=0;k<t;k++)
   {
       int n=sc.nextInt();
       if(n==1)
       {
           System.out.println("1");
           System.out.println("1 1");
       }
       if(n==2)
       {
           System.out.println("1");
           System.out.println("2 1 2");
           
       }
       if(n==3)
       {
       System.out.println("1");
       System.out.println("3 1 2 3");
           
       }
       if(n==4)
       {System.out.println("2");
       
       System.out.println("3 1 2 3");
       System.out.println("1 4");
           
       }
       if(n>4){
           int o=(n-3)/2+(n-3)%2+1;
           System.out.println(o);
       System.out.println("3 1 2 3");
       
       if(n<=100)
       {
       for(int i=2;i<=n/2;i++)
       {
           if(2*i==n)
           {
               System.out.println("1"+" "+2*i);
           }
           else{
           System.out.println("2 "+(2*i)+" "+(2*i+1));
           }
          }
          
       }
       else{
       
           int y=swi(n);
       for(int i=2;i<=y/2;i++)
       {
           if(2*i==y)
           {
               System.out.println("1"+" "+2*i);
           }
           else{
           System.out.println("2 "+(2*i)+" "+(2*i+1));
       
           }
          
       }
       
       
       }
       }
    }
}
}
