import java.io.*;
import java.util.*;


public class TestClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        for(int t_i=0; t_i<T; t_i++)
        {
            String[] NK = br.readLine().split(" ");
            int N = Integer.parseInt(NK[0]);
            int K = Integer.parseInt(NK[1]);
            String[] arr_arr = br.readLine().split(" ");
            int[] arr = new int[N];
            for(int i_arr=0; i_arr<arr_arr.length; i_arr++)
            {
            	arr[i_arr] = Integer.parseInt(arr_arr[i_arr]);
            }

            int out_ = Solution(N, K, arr);
            System.out.println(out_);
         }

         wr.close();
         br.close();
    }
    static int Solution(int N, int K, int[] arr){
        int p=0;
       int min=0;
       int r=0;
         for(int i=0;i<N;i++)
            {
                int x=0;
                for(int j=i;j<N;j++)
                {
                    x=x+arr[j];
                if(x%K==0)
                { ++r;
                    if(r==1)
                    {
                    min=j-i+1;
                    }
                    else if(r>1){
                        min=Math.min(j-i+1, min);
                    }
                    
                }    
                }
            }
        
            if(r==0)
            {
            min=-1;
            }
         
    return min;
    }
}
2
bcaadac
abcabad
bdacdaba
ababd