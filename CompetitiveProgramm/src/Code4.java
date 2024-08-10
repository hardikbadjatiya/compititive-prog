
import java.util.ArrayList;
import java.util.Scanner;

public class Code4 {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
     int t=sc.nextInt();
   
     for(int k=0;k<t;k++)
   {
       int n=sc.nextInt();
       int ar[]=new int[n];
       String st=" ";
       for(int i=0;i<n;i++)
       {
           ar[i]=sc.nextInt();
           st=st+ar[i]+" ";
       }
       ArrayList <Integer>l1=new ArrayList<Integer>();
       ArrayList <Integer>l2=new ArrayList<Integer>();
       
       for(int i=1;i<=n-1;i++)
       {
           String s=" "+st.substring(0, 2*i+1)+" ";
           int u=0;
           int r=0;
           
           for(int j=1;j<=i;j++)
           {
               String re=" "+j+" ";
               if(s.contains(re)!=true)
               {
                   r=1;
                   break;
               }
           }
           if(r==0)
           {
String stt=" "+st.substring(2*i+1, 2*n+1)+" ";
           
               for(int j=1;j<=n-i;j++)
           {
                String re=" "+j+" ";
               if(stt.contains(re)!=true)
               {
                   u=1;
                   break;
               }
           }
           }
           if(r==0&&u==0)
           {
           l1.add(i);
           l2.add(n-i);
           }
       }
       
       if(l1.isEmpty())
       {
           System.out.println("0");
       }
       else{
           System.out.println(l1.size());
           for(int w=0;w<l1.size();w++)
           {
               System.out.println(l1.get(w)+" "+l2.get(w));
           }
       }       
   }
}
}
