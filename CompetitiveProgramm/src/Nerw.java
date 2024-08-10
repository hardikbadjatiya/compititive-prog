
import java.util.Scanner;

public class Nerw {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int t=sc.nextInt();
   while(t-->0)
   {
       int n=sc.nextInt();
       int m=sc.nextInt();
       int o=sc.nextInt();
       int tw=sc.nextInt();
       int e=0;
       int f=0;
       int u=0;
       for(int i=0;i<n;i++)
       {
          String st=sc.next();
         int index = 0, count = 0;
		while (true) {
			index = st.indexOf("..", index);
			if (index != -1) {
			f++;
			       	index += 2;
			} else {
                               index=index+1;
				break;
			}
		}
            for(int j=0;j<st.length();j++)
            {
                if(st.charAt(j)=='.')
                {
                    ++u;
                }
            }
//          while(st.contains("."))
//         {
//             if(st.contains(".."))
//             {
//                 st=""+st.replace("..", "");
//                 e=e+2;
//                 f=f+1;
//             }
//             if(st.contains("..")!=true&&st.contains(".")==true)
//             {
//                 st=""+st.replaceAll(".", "");
//                 System.out.println(st);
//                 u=u+1;
//             }
//         }
////if(m>1)
////{
////         for(int j=0;j<m;j++)
////         {
////             int x=0;
////             if(i<=m-2)
////             {
////             if(st.charAt(i)=='.'&&st.charAt(i+1)=='.'&&x==0)
////             {
////                 e=e+2;
////                 f=f+1;
////                 i++;
////                 x=1;
////             }
////             if(x==0)
////             {
////             if(st.charAt(i)=='.'&&st.charAt(i+1)!='.')
////             {
////                 u=u+1;
////                 i++;
////                 
////             }
////             
////             
//////             if(st.charAt(i)!='.'&&st.charAt(i+1)=='.')
//////             
//////             {
//////             u=u+1;
//////             i=i+2;
//////             }
////             }
////             
////             }
////                          
////             
////         }
////          
////       }
////else{
////    if(st.contains("."))
////    {
////        u++;
////    }
////}
//       }
       }
       e=2*f;
       int r=(u)*o;
       int k=(f*tw)+((u-2*f)*o);
       if(r==0||k==0)
       {
       System.out.println(Math.abs(k-r));
           
       }
       else{
           System.out.println(Math.min(r,k));
       }
       
   
}
}
}
