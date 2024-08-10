
import java.util.Scanner;

public class Buyings 
{
    static int find(String st[],int ar[],String stt)
    {
        int x=0;
      for(int j=0;j<st.length;j++)
    {
      if(stt.contains(st[j]))
      {
 for(int k=0;k<stt.length();k++)
       {
           for(int l=k+1;l<=stt.length();l++)
           {
               String o=stt.substring(k,l);
       if(o.equals(st[j]))
        {
            x=x+ar[j];
        }
    }
       }
//			if (index != -1) {
//				count ++;
//				index += st[i].length();
//                                if(index==stt.length())
//                                {
//                                x=x+ar[i]*count;     
//                                }
//                        } else 
//                        {
//                                x=x+ar[i]*count;
//				break;
//			}
        
    }
}
        return x;
        
        
    }
public static void main(String[] args) {
   Scanner sc=new  Scanner(System.in);
   int t=sc.nextInt();
   while(t-->0)
   {
       String a=sc.next();
       String b=sc.next();
       int n=sc.nextInt();
       String st[]=new String[n];
       int ar[]=new int[n];
       for(int i=0;i<n;i++)
       {
           st[i]=sc.next();
           ar[i]=sc.nextInt();
            
       }
       int max=0;
       for(int i=0;i<a.length();i++)
       {
           for(int j=i+1;j<=a.length();j++)
           {
             String  s=a.substring(i,j);
       for(int k=0;k<b.length();k++)
       {
           for(int l=k+1;l<=b.length();l++)
           {
               String o=b.substring(k,l);
               String we=s+o;
               int x=find(st, ar, we);
               if(x>max)
               {
                   max=x;
               }
                   }
       }
            }
       }
       System.out.println(max);
   }
}
    
}
