package study2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_10815 {
	static int arr[];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		arr = new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < n; i++) 
			arr[i] = Integer.parseInt(st.nextToken());
		
		Arrays.sort(arr);
		
		int m = Integer.parseInt(br.readLine()), t;
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < m; i++) {
			t = Integer.parseInt(st.nextToken());
			System.out.print(BS(t, 0, n - 1) + " ");
		}
		
	}
	
	public static int BS(int key, int low, int high) {
		int mid;
		
		while(low <= high) {
			mid = (low + high) / 2;
			
			if(arr[mid] == key)
				return 1;
			
			if(arr[mid] < key) low = mid + 1;
			else high = mid - 1;
		}
		return 0;
	}

}
