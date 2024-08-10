
import java.util.Scanner;

public class Khan {
    public static void main(String[] args) {
       
    Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   for(int i=0;i<n;i++)
   {
  int x=sc.nextInt();
  int h=sc.nextInt();
  int m=sc.nextInt();
  int y=0;
  int o=0;
  if(x<=m*10)
    {
       o=1;
    }
  else{       
  for(int j=0;j<h;j++)
     {
             if(x<=m*10)
             {
                 o=1;
                 break;
             }
         
             x=x/2+10;
         
    }
         if(x<=m*10)
         {
            o=1;
          }
   }
  if(o==1)
  {
      System.out.println("YES");
  }
  else{
      System.out.println("NO");
  }
  }    
}
}