import java.util.Arrays;
import java.util.Scanner;

public class CahrDelete {
    public static String maxval(String sb1)
    {
           StringBuilder sb=new StringBuilder(sb1);
  
           char ar[]=new char[sb.length()];
           for(int i=0;i<sb.length();i++)
           {
               ar[i]=sb.charAt(i);
               
           }
           Arrays.sort(ar);
           System.out.println(Arrays.toString(ar));
        int max=0;
        
        int p=sb.length()-1;
        System.out.println(p+" "+ar[p-1]);
        
        for(int i=0;i<sb.length();i++)
       {
           System.out.println("hi"+i);
           if(sb.charAt(i)==ar[p])
           {
               System.out.println("deleted"+ i );
               max=i;
               p--;
           }
        
          if(sb.charAt(max)-sb.charAt(max+1)==1||sb.charAt(max)-sb.charAt(max-1)==1)
    {
        
           sb.deleteCharAt(max);
    }
   
            }
           
    return sb.toString();
     
    }
    public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int n=sc.nextInt();
   String st=sc.next();
   StringBuilder sb=new StringBuilder(st);
      char g=sb.charAt(0);
       char h=sb.charAt(1);
            String sg=CahrDelete.maxval(sb.toString());
          System.out.println(sg);   
//          for(int i=0;i<sb.length()-1;i++)
//   {
//              double s=sb.charAt(i);
//       double r=sb.charAt(i+1);
//       if(r>s&&r-s==1)
//       {
//           sb.deleteCharAt(i+1);
//           
//       }
//       if(s>r&&s-r==1)
//       {
//           sb.deleteCharAt(i);
//           
//       }
//    System.out.println(sb);
//       
//   }

    }
}
