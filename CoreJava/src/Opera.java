
import static java.lang.System.out;
import java.text.NumberFormat;
import java.util.Scanner;

public class Opera {
   public static void main(String[] args) {
      int b;


      Scanner in = new Scanner(System.in);

     // System.out.println("Enter verifying number: ");
      b = in.nextInt();
      //necessary to do due to Enter key pressed by user
      in.nextLine();
      String st[] = new String[b];
      for (int i=0; i<b; i++) {

          //System.out.println("Enter a string: ");
          st[i] = in.nextLine();

          // You can check at the same time if this is what you entered
        //  System.out.println("I have received this sring:  "+s[i]+"\n");
      }
      for(int i=0;i<b;i++){
  int l=0;
     //if(st[i].length()>10)
     l=st[i].length();
     if(l>10)
      {
  // int l=0;
     //if(st[i].length()>10)
    // l=st[i].length();
     int z;
     z=l-2;
    // System.out.println(l-2);
      char ch[]=new char[l];
   ch[1]=st[i].charAt(0);
     ch[2]=st[i].charAt(l-1);
     System.out.println(ch[1]+""+z+""+ch[2]);
   }
     else
              System.out.println(st[i]);
}
   }
}
