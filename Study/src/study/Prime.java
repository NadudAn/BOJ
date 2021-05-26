package study;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Prime {				//백준 2581번 소수
									//제출할 땐 클래스 이름을 Main으로 바꿀 것.
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int m = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		int sum = 0, min = 0, cnt = 0;
		
		if(m == n) {
			if(isPrime(m)) {
				System.out.println(m);
				System.out.println(m);
			}
			else System.out.println(-1);
			return;
		}
		for(int i = m; i <= n; i++) {
			if(isPrime(i)) {
				sum += i;
				++cnt;
				if(cnt == 1) min = i;
			}
		}
		if(sum == 0) System.out.println(-1);
		else {
			System.out.println(sum);
			System.out.println(min);
		}
	}
	
	public static boolean isPrime(int n) {
		if(n == 0 || n == 1) return false;
		
		for(int i = 2; i <= Math.sqrt(n); i++) 
			if(n % i == 0) return false;
		
		return true;
	}
}
