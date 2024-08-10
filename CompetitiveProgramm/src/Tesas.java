
import java.util.HashMap;
import java.util.Scanner;

public class Tesas {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int t=sc.nextInt();
   while(t-->0)
   {
    int n=sc.nextInt();
    
          int ar[]=new int[n];
           for(int j=0;j<n;j++)
            {
                ar[j]=sc.nextInt();
            }
                 
           
           
           
           int x=1;
           String w=" ";
           String st=" "+ar[0]+" ";
           int l=0;
           if(n>1)
           {
           if(ar[0]!=ar[1])
           {
           w=w+1+" ";
           }
           }
           
           for(int i=1;i<n;i++)
           {
           if(ar[i]==ar[i-1])
           {
           x++;  
           if(i==n-1)
           {
               String a=" "+x+" ";
               
               if(w.contains(a)!=true)
                {
                    
                w=w+x+" ";
                x=1;
                }
                else{
                   l=1;
                   break;
                }
              
                }
           }
           else if(ar[i]!=ar[i-1])
           {
               String s=" "+ar[i]+" ";
               if(st.contains(s)!=true)
               {
                   
                st=st+ar[i]+" ";
                String a=" "+x+" ";
                if(w.contains(a)!=true)
                {
                    
                 w=w+a; 
                 x=1;
                 
                }
                else
                {
                   l=1;
                   break;
                
                }
              }
               else{
                   l=1;
                   break;
               }
             if(i==n-1)
           {
               String a=" "+x+" ";
               if(w.contains(a)!=true)
                {
                w=w+x+" ";
                x=1;
                }
                else{
                   l=1;
                   break;
                }
                }
           }
           }
           if(l==0)
           {
               System.out.println("YES");
           }
           else{
               System.out.println("NO");
           }
   }
}    
}
