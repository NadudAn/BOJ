package study2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_2476 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		int arr[] = new int[3];
		int max[] = new int[n];
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());

			for(int j = 0; j < 3; j++) 
				arr[j] = Integer.parseInt(st.nextToken());
			
			Arrays.sort(arr);
			
			if(arr[0] == arr[1] && arr[1] == arr[2]) 
				max[i] = 10000 + (arr[0] * 1000);
			else if(arr[0] != arr[1] && arr[1] != arr[2] && arr[0] != arr[2]) 
				max[i] = arr[2] * 100;
			else max[i] = 1000 + (arr[1] * 100);
			
		}
		
		Arrays.sort(max);
		
		System.out.println(max[n - 1]);
		

	}

}
