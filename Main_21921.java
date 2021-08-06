package study2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_21921 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken());
		int arr[] = new int[n];
		long max = 0, sum = 0, cnt = 1;
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			sum += arr[i];
			
			if(i >= x) sum -= arr[i - x];
			if(i >= x - 1) {
				if(sum == max) ++cnt;
				else if(sum > max) {
					max = sum;
					cnt = 1;
				}
			}
		}
		
		if(max == 0) System.out.println("SAD");
		else {
			System.out.println(max);
			System.out.println(cnt);
		}
		
	}

}
