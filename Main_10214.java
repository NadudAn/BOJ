package study2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_10214 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int arr[] = new int[2];
		
		StringTokenizer st;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < 9; j++) {
				st = new StringTokenizer(br.readLine());
				
				arr[0] += Integer.parseInt(st.nextToken());
				arr[1] += Integer.parseInt(st.nextToken());
			}
			
			if(arr[0] > arr[1]) System.out.println("Yonsei");
			else if(arr[0] < arr[1]) System.out.println("Korea");
			else System.out.println("Draw");
			
			arr[0] = 0;
			arr[1] = 0;
		}
		
	}

}
