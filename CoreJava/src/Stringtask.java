
import java.util.Arrays;
import static java.util.Collections.list;
import java.util.List;
import java.util.Scanner;

public class Stringtask {
    static String remVowel(String str) 
    { 
         Character vowels[] = {'a', 'e', 'i', 'o', 'u','y','A','E','I','O','U','Y'}; 
           
         List<Character> al = Arrays.asList(vowels); 
        
         StringBuffer sb = new StringBuffer(str.toLowerCase()); 
           
         for (int i = 0; i < sb.length(); i++) { 
              
             if(al.contains(sb.charAt(i))){ 
                sb.replace(i, i+1, "") ; 
                i--; 
             } 
        } 
           
          
        return sb.toString(); 
    }
   
public static void main(String[] args) throws Exception {
    Scanner sc=new Scanner(System.in);
    String str=sc.next();
    
    
//    int l=st.length();
//    String str=st.toLowerCase();
//    String str1=str.trim();
//    StringBuilder sb=new StringBuilder(str1);
//    char[] list = new char[l];
//    
//    for(int i=0;i<l;i++)
//    {
//      if(  sb.charAt(i)=='a'||sb.charAt(i)=='e'||sb.charAt(i)=='i'||sb.charAt(i)=='o'||sb.charAt(i)=='u'||sb.charAt(i)=='y')
//      {
//     
//      }
//    }
  // System.out.println(sb);
//System.out.println(remVowel(str));
String str1=Stringtask.remVowel(str);
for(int i=0;i<str1.length();i++)
{
    System.out.print("."+str1.charAt(i));
}

}
        
}