/* IMPORTANT: Multiple classes and nested static classes are supported */

import java.util.*;

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class Code6 {
    static int check(String st)
{
    int l=st.length();
    if(st.charAt(1)=='1'&&st.charAt(l-1)=='1')
            {
                return 0;
            }
    int ar[]=new int[3];
  int x=0;
    for(int i=1;i<st.length();i++)
  {
      
    if(st.charAt(i)=='1')
    {
        
        ar[x]=i;
        x++;
    }

  }
    if(ar[2]-ar[1]==1||ar[1]-ar[0]==1)
    {
        return Math.max(ar[2]-ar[1]+1,ar[1]-ar[0]+1);
    }
    return ar[2]-ar[0]+1;
            
}
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        */

        // Write your code here
   Scanner sc=new Scanner(System.in);
     int t=sc.nextInt();
   int ar[]=new int[t-1];
   int arr[]=new int[t-1];
   
   String st="";
    for(int k=0;k<t-1;k++)
        
   {
        ar[k]=sc.nextInt();
         arr[k]=sc.nextInt();
      
    }
    int a[]=new int[t];
    for(int i=0;i<t;i++)
    {
        a[i]=sc.nextInt();
    }
    
    int max=0;
    
    for(int i=0;i<t-1;i++)
    {
       String h=""+a[i];
        int x=3;
        for(int j=i+1;j<t;j++)
        {
            if(a[j]==1)
            {
                x--;
            }
               if(x<0)
               {
           int n=check(h);
            if(n>max)
            {
                max=n;
            }
                   break;
               }
           h=h+a[j]+"";
           int n=check(h);
            if(n>max)
            {
                max=n;
            }
            
        }
        
    }
    System.out.println(max);
    }
}
