
import java.util.Scanner;

public class Tes2 {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int t=sc.nextInt();
   while(t-->0)
   {
       String st=sc.next();
       int l=st.length();
       int x=0;
       int y=0;
       if(st.charAt(0)=='1'&&st.charAt(l-1)=='1')
       {
          x=x+2;
       }
       if(st.charAt(0)=='0'&&st.charAt(l-1)=='0')
       {
          y=y+2;
       }
       
       int z=0;
       int o=0;
       int w=0;
       if(st.contains("01")&&st.contains("10"))
       {
           w=1;
       }
       int ar[]=new int[l];
       int arr[]=new int[l];
       
       
       for(int i=1;i<l-1;i++)
       {
           if(st.charAt(i)=='0')
           {
              z++;
           }
           if(st.charAt(i)=='1')
           {
              o++;
           }
           ar[i]=z;
           
           
           
       }
       
       if(z==0||o==0||w==0)
       {
           System.out.println(0);   
       }
       else{
           
           int index = 0, count = 0;
		while (true) {
			index = st.indexOf("10", index);
			if (index != -1) {
				count ++;
				index += 2+1;
			} else {
                            
				break;
			}
		}
                while (true) {
			index = st.indexOf("01", index);
			if (index != -1) {
				count ++;
				index += 2+1;
			} else {
                            
				break;
			}
		}
            if(st.charAt(0)=='1'||st.charAt(l-1)=='1')
            {
                System.out.println(count-1);   
            }
            else{
                System.out.println(count);
                }
                
//          if(z>=o)
//          {
//          }
//          else{
//                System.out.println(z);
//              }
       }
      
   }
}
    
}