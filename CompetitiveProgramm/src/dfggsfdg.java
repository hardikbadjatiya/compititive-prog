
    import java.util.Arrays;
    import java.util.Scanner;

    public class dfggsfdg {
    public static void main(String[] args) {
       Scanner sc=new Scanner (System.in);
       int t=sc.nextInt();
       while(t-->0)
       {
           int n=sc.nextInt();
           int ar[]=new int[n];
           int b[]=new int[n];
           int c[]=new int[n];
           for(int i=0;i<n;i++)
           {
             ar[i]=sc.nextInt();
            b[i]=ar[i]; 
           }
           String s="";
           for(int i=0;i<n;i++)
           {
             c[i]=sc.nextInt();
          s=s+c[i];
           }
           Arrays.sort(b);
           int u=0;
           for(int i=0;i<n;i++)
           {
               if(ar[i]!=b[i])
               {
           u=1;
           break;
               }
           }
           if(u==1)
           {
           int r=0;
          if(s.contains("1")&&s.contains("0")) 
          {
          u=0;
          }
            
          }
           if(u==0)
               {
                   System.out.println("Yes");
               }
               else
               {
                   System.out.println("No");
               }
       }
    }

    }
