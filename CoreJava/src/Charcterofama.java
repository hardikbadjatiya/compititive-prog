
import java.util.ArrayList;
import java.util.Scanner;

public class Charcterofama {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
  int m=sc.nextInt();
  int k=sc.nextInt();
int ar[][]=new int[n][m];
for(int i=0;i<n;i++)
{
    String st=sc.next();
    for(int j=0;j<m;j++)
    {
        char c=st.charAt(j);
        if(c=='*')
        {
            ar[i][j]=1;
        }
        if(c=='.')
        {
            ar[i][j]=0;
        }
    }
}
ArrayList <Integer> l1=new ArrayList<Integer>();

for(int i=0;i<n-k+1;i++)
{
    for(int j=0;j<m-k+1;j++)
    {
        int s=0;
        for(int o=i;o<k+i;o++)
        {
            for(int l=j;l<k+j;l++)
            {
                s=s+ar[o][l];
            }
            
        }
        l1.add(s);
        
    }
}
java.util.Collections.sort(l1);
        System.out.println(l1.get(l1.size()-1));
}    
}
