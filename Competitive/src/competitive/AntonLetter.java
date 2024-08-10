package competitive;

import java.util.Scanner;

public class AntonLetter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=new String();
        str=sc.nextLine();
        String stri = str.replaceAll("\\s+", ""); 
//        StringBuilder sb=new StringBuilder(str);
//        
//        sb.delete(n-2,n-1);
//        System.out.println(sb);
//        sb.delete(0, 1);
//        String st=sb.toString();
         long COUNT=0;
  COUNT= stri.chars().distinct().count();
//        System.out.println(COUNT-3);
          if(COUNT==2){
              System.out.println("0");
          }
          else if(COUNT==3)
          {
              System.out.println("1");
          }
          else{
              System.out.println(COUNT-3);
          }
    }

        
}
