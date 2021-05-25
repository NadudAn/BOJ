package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FindPrime {		//백준 1978번 소수 찾기

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()), t, cnt = 0;
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		for(int i = 0; i < n; i++) {
			t = Integer.parseInt(st.nextToken());
			if(isPrime(t)) ++cnt;
		}
		System.out.println(cnt);
	}
	
	public static boolean isPrime(int n) {	
		if(n == 1) return false;
		
		for(int i = 2; i <= Math.sqrt(n); i++) {
			if(n % i == 0) return false;
		}
		return true;
	}
}
