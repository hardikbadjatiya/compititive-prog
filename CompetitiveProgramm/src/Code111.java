
import java.util.Scanner;

public class Code111 {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int  t=sc.nextInt();
   while(t-->0)
   {
        int n=sc.nextInt();
        String st="";
        if(n%4==0)
        {
            System.out.println("YES"); 
           for(int i=1;i<=n/2;i++)
           {
               int u=2*i;
               st=st+u+" ";
           }
           int l=1;
           int o=n/2-1;
           while(o-->0){
               st=st+l+" ";
               l=l+2;
           }
           o=n/2-1;
           int q=(o+1)*(o+2)-(o*o);
           st=st+q;
            System.out.println(st);
        }
        else{
            System.out.println("NO");
        }
   }
}
    
}
