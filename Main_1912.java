package study2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1912 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int arr[] = new int[n + 1];
		
		for(int i = 0; i < n; i++) 
			arr[i] = Integer.parseInt(st.nextToken());
		
		int d[] = new int[n];
		d[0] = arr[0];
		int max = arr[0];
		
		for(int i = 1; i < n; i++) {
			d[i] = Math.max(d[i - 1] + arr[i], arr[i]);
			max = Math.max(max, d[i]);
		}
		
		System.out.println(max);
		
	}

}
