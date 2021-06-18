package study2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fibonacci {		//백준 10870번 피보나치 수 5

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		System.out.println(FibonacciNum(n));
		
	}
	
	public static int FibonacciNum(int n) {
		int result = 0;
		
		if(n == 0) return 0;
		else if(n == 1) return 1;
		
		result = FibonacciNum(n - 1) + FibonacciNum(n - 2);
		
		return result;
	}

}
