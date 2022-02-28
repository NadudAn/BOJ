package study2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_17608 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()), max = 0, cnt = 1;
		int arr[] = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		max = arr[n - 1];
		
		for(int i = n - 1; i >= 0; i--) {
			if(max < arr[i]) {
				max = arr[i];
				cnt++;
			}
		}
		
		System.out.println(cnt);
		

	}

}
