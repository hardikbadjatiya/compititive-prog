
import static java.lang.System.out;
//import java.lang.String;
public class Stringopera {
 public static void main(String[] args) {
   String str="hardik";
out.println(str.toUpperCase());
   String str2="        hello sghdshfhfg you       ";
   out.println(str2.replace('h','H' ));
   out.println(str2.length());
   out.println(str2.startsWith("hello"));
   out.println(str2.endsWith("you"));
out.println(str2.trim());
out.println(str2);
StringBuilder sb=new StringBuilder("hardik");
sb.reverse();
sb.insert(3,"bad");
out.println(sb);

sb.delete(1,2);
out.println(sb);
sb.append(" fuck you");
out.println(sb);
 }
        
}
