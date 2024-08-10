

public class Testre {
public static void main(String[] args) {
   int e=1;
  int s =0;
   
   
   for(;e<=6;e++)
   {
      s=s+e;
      if(s==10)
      {
          continue;
      }
      if(s>e*2)
      {
          break;
          
      }
   }
   do{
       s-=e;
   }
   while(s>e);
    System.out.println("sum"+s);
}
    
}
