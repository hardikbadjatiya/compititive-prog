import java.io.*;
import java.util.*;
 
public class Main1
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        while(t-->0)
        {
            String s1[] = br.readLine().trim().split(" ");
            String s2[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s1[0]);
            int l = Integer.parseInt(s1[1]);
            long a[] = new long[n];
            long b[] = new long[35];
            for(int i = 0; i < n; i++)
                a[i] = Long.parseLong(s2[i]);
            int k = 1,cnt;
            long tmp = 1l;
            while(k != 33)
            {
                for(int i = 0; i < n; i++)
                {
                    if((a[i]&1l) != 0)
                        b[k] += tmp;
                    a[i] = a[i]>>1;
                }
                tmp = tmp<<1;
                k++;
            }
            sort(b);
            l--;
            k = l-1;cnt = 1;
            while(k >= 0 && b[k] == b[l])
            {
                cnt++;
                k--;
            }
            int r = l - k;
            k = l + 1;
            while(k < 35 && b[k] == b[l])
            {
                cnt++;
                k++;
            }
            long ans = ncr(cnt, r);
            // bw.write(r+"\n");
            bw.write(ans+"\n");
        }
        bw.flush();
    }
    static void sort(long b[])
    {
        int n = 35;
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n - i -1; j++)
            {
                if(b[j] < b[j+1])
                {
                    long tmp = b[j];
                    b[j] = b[j+1];
                    b[j+1] = tmp;
                }
            }
        }
    }
    static long ncr(int n, int r) 
    { 
        long p = 1, k = 1; 
        if (n - r < r) 
			r = n - r; 
		if (r != 0) 
		{ 
			while (r > 0) 
			{ 
				p *= n; 
				k *= r; 
                long m = __gcd(p, k); 
                p /= m; 
				k /= m; 
                n--; 
				r--; 
			} 
		} 
		else
			p = 1; 
		return p;
	} 
	static long __gcd(long n1, long n2) { 
		long gcd = 1; 
 
		for (int i = 1; i <= n1 && i <= n2; ++i) { 
			if (n1 % i == 0 && n2 % i == 0) { 
				gcd = i; 
			} 
		} 
		return gcd; 
	}
}