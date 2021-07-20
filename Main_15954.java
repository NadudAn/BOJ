package study2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_15954 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		int arr[] = new int[n];
		st = new StringTokenizer(br.readLine());
		double min = 0, m = 0, ans = Double.MAX_VALUE;
		
		for(int i = 0; i < n; i++) 
			arr[i] = Integer.parseInt(st.nextToken());
		
		for(int i = k; i <= n; i++) 
			for(int j = 0; j <= n - i; j++) {
				m = mean(arr, j, i);
				min = d(arr, m, j, i);
				ans = Math.min(min, ans);
			}
			
		System.out.println(String.format("%.11f", ans));
	}
	
	static double mean(int[] arr, int start, int k) {
		double sum = 0;
		for(int i = 0; i < k; i++) sum += arr[start + i];
		return sum / k;
	}
	
	static double d(int[] arr, double m, int start, int k) {
		double sum = 0;
		for(int i = 0; i < k; i++) sum += Math.pow(arr[start + i] - m, 2);
		return Math.sqrt(sum / k);
	}

}
