
import java.util.Scanner;

public class dsdsd {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int n=sc.nextInt();
   int u=1;
   
       System.out.println(u);
       char a=sc.next().charAt(0);
    if(a=='E')
    {
       System.exit(0);
    }
    
       System.out.println(u);
       char b=sc.next().charAt(0);
    if(b=='E')
    {
       System.exit(0);
    }
           
       while(a==b)
       {
       System.out.println(u);
        a=sc.next().charAt(0);
       System.out.println(u);
        b=sc.next().charAt(0);
       }
       int mid=1;
       int min=1;
       int max=n;
       if(a=='G')
       {
           while(a!='E')
           {
            mid=(max+min)/2;   
           System.out.println(mid);  
        a=sc.next().charAt(0);
        if(a=='E')
            {
            break;
            }  
        System.out.println(mid);
        
        char l=sc.next().charAt(0);
        if(l=='E')
            {
            break;
            }
        if(a=='G')
            {
            min=mid+1;
            }
            if(a=='L')
            {
              max=mid-1; 
            }
            if(a=='E')
            {
                break;
            }
           }
       }
       if(a=='L')
       {
           while(b!='E')
           {
           mid=(max+min)/2;   
           System.out.println(mid);  
           a=sc.next().charAt(0);
           
           System.out.println(mid);
           if(a=='E')
            {
            break;
            }
           b=sc.next().charAt(0);
           if(b=='E')
            {
            break;
            }
           if(b=='G')
            {
            min=mid+1;
            }
            if(b=='L')
            {
            max=mid-1; 
            }
            
           }
       }
}
    
}
