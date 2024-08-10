
import java.util.Scanner;

public class sdds {
     static int countMatches(String text, String str) {
		
		int index = 0, count = 0;
		while (true) {
			index = text.indexOf(str, index);
			if (index != -1) {
                            System.out.println(index);
                            count ++;
				index += 1;
			} else {
				break;
			}
		}
//while((index = str.contain(text)) != -1){
//            count++;
//            str = str.substring(index+1);
//        }
return count;
     }
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int t=sc.nextInt();
  for(int p=0;p<t;p++)
   {
       int n=sc.nextInt();
       int k=sc.nextInt();
       int ar[]=new int[n];
       String st="  ";
       for(int i=0;i<n;i++)
       {
           ar[i]=sc.nextInt();
           st=st+ar[i]+" ";
       }
       st=st+" ";
       String s=" ";
       for(int i=k;i>=1;i--)
       {
           s=s+i+" ";
       }
       
       
//       while((index = st.contain()) != -1){
//            count++;
//            st = st.substring(index+1);
//        }
       if(st.contains(s))
       {
         int l=countMatches(st, s);
           System.out.println("Case #"+(p+1)+": "+l);
       }
       else{
           System.out.println("Case #"+(p+1)+": "+"0");
       }
  
}
}
}
