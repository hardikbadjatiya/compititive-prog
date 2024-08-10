public class sdsdfs {
public static void main(String[] args) {
   int t=7;
   String st[]=new String[t];
   for(int i=1;i<=7;i++)
   {
      String s=" ";
        
      for(int j=7;j>=1;j--)
      {
         if(i<j)
         {
             s=s+"  ";
         }
         else{
             s=s+j+" ";
         }
      }
      for(int j=2;j<=7;j++)
      {
          if(j<=i)
          {
              s=s+j+" ";
          }
      }
       System.out.println(s);
   }
}
        
}
//             1
//           2 1 2
//         3 2 1 2 3
//       4 3 2 1 2 3 4
//     5 4 3 2 1 2 3 4 5
//   6 5 4 3 2 1 2 3 4 5 6
// 7 6 5 4 3 2 1 2 3 4 5 6 7