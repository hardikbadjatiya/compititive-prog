
import java.util.Scanner;

public class inf {
public static void main(String[] args) {
   
Scanner sc=new  Scanner(System.in);
int t=sc.nextInt();
for(int i=0;i<t;i++)
{
String st=sc.next();
StringBuilder sw=new StringBuilder(st);
String sb=sw.reverse().toString();
 int l=st.length();
   
int x=0;
for(int j=0;j<l;j++)
{
    if(sb.charAt(j)=='0')
    {
        x++;
    }
    else{
        break;
    }
    
}
    String h=sb.substring(x, l);
    System.out.println(h);

}
}
    
}
