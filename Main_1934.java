package study2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1934 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int t = Integer.parseInt(br.readLine());
		int arr[] = new int[2];
		
		for(int i = 0; i < t; i++) {
			st = new StringTokenizer(br.readLine());
			
			arr[0] = Integer.parseInt(st.nextToken());
			arr[1] = Integer.parseInt(st.nextToken());
			
			if(arr[0] == 1) System.out.println(arr[1]);
			else if(arr[1] == 1) System.out.println(arr[0]);
			else System.out.println(lmc(arr[0], arr[1]));
			
		}
	}
	
	static int gcd(int n1, int n2) {
		if(n2 == 0) return n1;
		return gcd(n2, n1 % n2);
	}
	
	static int lmc(int n1, int n2) { return n1 * n2 / gcd(n1, n2); }

}
