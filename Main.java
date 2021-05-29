package study2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {								//백준 1929번 소수 구하기

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		for(int i = n; i <= m; i++) {
			if(IsPrime(i)) System.out.println(i);
		}

	}
	
	public static boolean IsPrime(int n) {
		if(n <= 1) return false;
		
		for(int i = 2; i <= Math.sqrt(n); i++) 
			if(n % i == 0) return false;
		
		return true;
	}

}
