import java.util.Scanner;

   public class Hass {
   public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int t=sc.nextInt();
   for(int d=0;d<t;d++)
   {
    int n=sc.nextInt();
    String st=sc.next();
    String st1="";
    String st2="";
    int x=0;
    for(int i=0;i<n;i++)
    {
    
    if(st.charAt(i)=='1'&&x==0)
    {   st1=st1+"1";
        st2=st2+"0";
        x=i;
        break;
    }
    if(st.charAt(i)=='2')
    {
        st1=st1+"1";
        st2=st2+"1";
    }
    if(st.charAt(i)=='0')
    {   st1=st1+"0";
        st2=st2+"0";
    }
    }
    if(x!=0)
    {
    for(int i=x+1;i<n;i++)
    {
  
        st1=st1+"0";
    }
    }
       System.out.println(st1);
       System.out.println(st2);
       
   }

}
}
