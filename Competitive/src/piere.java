
import java.util.Scanner;

public class piere {
    static int countMatches(String text, String str) {
		
		int index = 0, count = 0;
		while (true) {
                	index = text.indexOf(str, index);
			if (index != -1) {
                            
				count ++;
				index += 1;
			} else {
				break;
			}
		}

		return count;
	}

public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   String st=sc.next();
  int n=st.length();
  int max=0;
  String se="";
  for(int i=0;i<n;i++)
  {
     for(int j=i+1;j<n;j++)
     {
        String s=st.substring(i, j);
     int o=countMatches(st, s);
     if(o>=max)
     {
        
         max=o;
         se=s;
     }
     }
  }
    System.out.println(se);
  
}
    
}
