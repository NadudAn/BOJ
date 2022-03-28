package study2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_13241 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		long a = Long.parseLong(st.nextToken());
		long b = Long.parseLong(st.nextToken());
		
		if(a > b) System.out.println(lcm(a, b));
		else System.out.println(lcm(b, a));

		
	}
	
	public static long gcd(long a, long b) {
		while(b != 0) {
			long r = a % b;
			
			a = b;
			b = r;
		}
		
		return a;
	}
	
	public static long lcm(long a, long b) {
		return a * b / gcd(a, b);
	}

}
