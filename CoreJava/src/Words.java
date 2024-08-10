
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Words {
public static void main(String[] args) throws Exception{
   Scanner sc =new Scanner(System.in);
//   String st=sc.next();
    //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
   int n=sc.nextInt();
// String st = null;
    String st[] = new String[6];
    
   for(int j=1; j<=n; j++)
  {
   st[j] = sc.next();
        }
//    System.out.println(st);
//String strCopy=st;
//NullPointerException
//public void run()
//{
//try{
//    
//}  
//catch(NullPointerException ex)
//    {
//       ex.printStackTrace();
//    }
//}

for(int i=0;i<n;i++)
  {
   int l=0;
     if(st[i].length()>10)
     l=st[i].length();
     
     System.out.println(l-2);
//     char ch[]=new char[l];
//     ch[1]=st[i].charAt(0);
//     ch[2]=st[i].charAt(l-1);
//     System.out.println(ch[1]+""+z+""+ch[2]);
}
        
}
        
}
