package study2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_2231 {		//백준 2231번 분해합

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int cnt = 0;
		
		int num = n;
		while(num > 0) {
			num /= 10;
			++cnt;
		}
	
		System.out.println(decomposition(n, cnt));
	}
	
	static int decomposition(int n, int digit) {
		int sum = 0;
		char arr[] = new char[10];		
		String num;
		
		for(int i = n - (9 * digit); i < n; i++) {
			num = String.valueOf(i);
			arr = num.toCharArray();
			sum = i;
			
			for(int j = 0; j < arr.length; j++) 
				sum += (arr[j] - '0');
			
			if(sum == n) return i;
		}
		
		return 0;
	}

}
