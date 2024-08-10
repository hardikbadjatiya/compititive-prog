
import java.util.Scanner;

public class loki {
public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int t=sc.nextInt();
   while(t-->0)
   {
       String st=sc.next();
		
		int index = 0, count = 0;
		while (true) {
			index = st.indexOf("10", index);
			if (index != -1) {
				count ++;
				index += 1;
			} else {
				break;
			}
                }
	int inde = 0, coun = 0;
		while (true) {
			inde = st.indexOf("01", inde);
			if (inde != -1) {
				coun ++;
                                                              
			     	inde += 1;
			} else {
				break;
			}
	}
                int c=count+coun;
                if(c%2==0)
                {
                    System.out.println("NET");
                }
                
   }
}
    
}
