package study2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_24416 {
	static int cnt1 = 0, cnt2 = 0;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int f[] = new int[n];
		f[0] = 1;
		f[1] = 1;
		
		fib(n);
		
		for(int i = 2; i < n; i++) {
			cnt2++;
			f[i] = f[i - 1] + f[i - 2];
		}
		
		System.out.println(cnt1 + " " + cnt2);

	}
	
	public static int fib(int n) {
		if(n == 1 || n == 2) {
			cnt1++;
			return 1;
		}
		else return fib(n - 1) + fib(n - 2);
	}

}
