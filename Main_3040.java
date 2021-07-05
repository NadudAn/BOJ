package study2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_3040 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int arr[] = new int[9];
		int sum = 0;
		
		for(int i = 0; i < 9; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			sum += arr[i];
		}

		aa: for(int i = 0; i < 9; i++) {
			for(int j = i + 1; j < 9; j++) {
				if(sum - arr[i] - arr[j] == 100) {
					arr[i] = -1;
					arr[j] = -1;
					break aa;
				}
			}
		}
		
		for(int i : arr) 
			if(i != -1) System.out.println(i);
		
	}

}
