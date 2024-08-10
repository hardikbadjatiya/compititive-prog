
import java.util.Scanner;

public class Word {
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   String str=new String();
   str=sc.next();
   int len=str.length();
   char ch[]=str.toCharArray();
   int x=0;
   int y=0;
   

//               if (ch[0] >= 'a' && ch[0] <= 'z') { 
  
                    // Convert into Upper-case 
//                    ch[0] = (char)(ch[0] - 'a' + 'A'); 
//                    System.out.println(ch[0]);
           
//               String st = new String(ch); 
//               System.out.println(st);
//char ch[]=new char[len];
            for(int i=0;i<len;i++)
            {
                if(ch[i]>='a'&&ch[i]<='z')
                {
                  ++x;  
                }
                else{
                    ++y;
                }
            }
            if(x>=y)
            {
                System.out.println(str.toLowerCase());
                
            }
            else
            {
                System.out.println(str.toUpperCase()); 
            }
            
}
    
}
