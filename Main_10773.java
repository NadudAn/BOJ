package study2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_10773 {
	static int stack[];
	static int top = -1;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int ans = -1, sum = 0;
		stack = new int[n];
		
		for(int i = 0; i < n; i++) {
			ans = Integer.parseInt(br.readLine());
			if(ans == 0) pop();
			else push(ans);
		}
		
		if(top == -1) {
			System.out.println(0);
			return;
		}
		
		for(int i = 0; i < top + 1; i++) sum += stack[i];
		System.out.println(sum);
		
	}
	
	public static void push(int ans) {
		top++;
		stack[top] = ans;
	}
	
	public static void pop() {
		if(top != -1) top--;
	}

}
