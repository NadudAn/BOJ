package study2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_4344 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int t = Integer.parseInt(br.readLine());
		int n, cnt = 0;
		int arr[];
		double upavg[] = new double[t];
		double sum = 0;
		
		for(int i = 0; i < t; i++) {
			st = new StringTokenizer(br.readLine());
			n = Integer.parseInt(st.nextToken());
			arr = new int[n];
			
			for(int j = 0; j < n; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
				sum += arr[j];
			}
	
			sum /= n;
			
			for(int j = 0; j < n; j++) {
				if((double)arr[j] > sum) ++cnt;
			}
			upavg[i] = (double)cnt / n * 100;
			cnt = 0;
			sum = 0;
		}
		
		for(double i : upavg) System.out.printf("%.3f%%\n",i);
	}

}
