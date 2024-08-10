
import java.util.ArrayList;
import java.util.Scanner;

public class NextPrimeNo {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int m=sc.nextInt();
    ArrayList <Integer> l1=new ArrayList<Integer>();
 for(int i=2;i<=50;i++)
 {
     int x=0;
     for(int j=2;j<=i/2;j++)
     {
         if(i%j==0)
         {  x=1;
             break;
         }
         
     }
     if(x==0){
     l1.add(i);
     }
     
         
 }
   int i = 0;
    switch (i)
    {
        case '0':
            System.out.println("dfbdf");
            break;
        case '1': 
            System.out.println("dsfdgfbdf");
            
            break;
        default: System.out.println("dfbdfvfbvfdgdfgfdgcxv");
            
    }
        for(int l=0;i<l1.size()-1;i++)
        {
            int y=l1.get(i);
            if(l1.get(i)==n)
            {
                if(l1.get(i+1)==m)
                {
                    System.out.println("YES");
                System.exit(0);
                }
                
            }
        }
        
    System.out.println("NO");
}
    
}
