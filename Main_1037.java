package study2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_1037 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		if(n == 2) {
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			System.out.println(a * b);
		}
		else {
			Integer arr[] = new Integer[n];
		
			for(int i = 0; i < n; i++) 
				arr[i] = Integer.parseInt(st.nextToken());
			
			Arrays.sort(arr);
			System.out.println(arr[0] * arr[n - 1]);
			
		}
		
	}

}
