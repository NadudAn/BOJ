package study2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_10828 {
	private static String instruction[] = {"push", "pop", "size", "empty", "top"};
	private static int top = -1;
	private static int arr[];
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		int inst = 0, x;
		String t;
		arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			
			if(st.countTokens() == 2) {
				t = st.nextToken();
				x = Integer.parseInt(st.nextToken());
				push(x);
			}
			else {
				t = st.nextToken();
				
				for(int j = 1; j < 5; j++) 
					if(t.equals(instruction[j])) inst = j;
				
				switch(inst) {
				case 1:
					pop();
					break;
				case 2:
					System.out.println(top + 1);
					break;
				case 3:
					empty();
					break;
				case 4:
					if(top != -1) System.out.println(arr[top]);
					else System.out.println(top);
				}
			}
		}
	}
	
	static void push(int n) {
		arr[top + 1] = n;
		++top;
	}
	
	static void pop() {
		if(top == -1) System.out.println(-1);
		else {
			System.out.println(arr[top]);
			arr[top] = 0;
			--top;
		}
	}
	
	static void empty() {
		if(top == -1) System.out.println(1);
		else System.out.println(0);
	}
}
