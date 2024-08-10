/* IMPORTANT: Multiple classes and nested static classes are supported */
import java.util.*;

class dfsgf {
    static int check(String s)
    {
        String st="aeiou";
        for(int i=0;i<5;i++)
        {
            String o=""+st.charAt(i);
            if(s.contains(o))
            {
                return 0;
            }
        }
        return 1;
    }
    static int udaf(String s,String p[])
    {
        int y=p.length;
        for(int i=0;i<y;i++)
        {
            if(p[i].contains(s)!=true)
            {
                return 0;
            }
        }
        return 1;
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
            String st=sc.nextLine();
           
String[] splited = st.split("\\s+");
            int w=splited.length;
            int ar[]=new int[w];
            int min=st.length();
            
            int l=0;
            for(int i=0;i<w;i++)
            {
                ar[i]=splited[i].length();
                if(ar[i]<min)
                {
                    min=ar[i];
                    l=i;    
                }
            }
                System.out.println(Arrays.toString(splited));
                System.out.println(splited[l]);

            int l1=splited[l].length();
            int max=0;
                for(int i=0;i<l1;i++)
                {
                    for(int j=i;j<=l1;j++)
                    {
                        String s=splited[l].substring (i,j);
                        int y=check(s);
                        if(y==1)
                        {
                              int o=udaf( s, splited )  ;           
                              if(o==1)
                              {
                              int r=s.length();
                              if(r>max)
                              {
                                  max=r;
                              }
                              }
                        }

                    }
                }
                System.out.println(max);
            
            
    }
}
