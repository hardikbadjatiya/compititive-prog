
import java.util.Scanner;

public class wewewe {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int t=sc.nextInt();
   while(t-->0)
   {
    int n=sc.nextInt();
    int ar[]=new int[n];
    String s="";
    for(int i=0;i<n;i++)
    {
        ar[i]=sc.nextInt();
        if(ar[i]==0||ar[i]==1||ar[i]==2)
        {
            s=s+"0 ";
        
        }
        else{
            s=s+"1 ";
        }
    }
       System.out.println(s);
    }
}
    
}
