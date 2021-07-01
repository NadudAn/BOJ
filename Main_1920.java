package study2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_1920 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int arrN[] = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < n; i++) 
			arrN[i] = Integer.parseInt(st.nextToken());
		
		Arrays.sort(arrN);
		
		int m = Integer.parseInt(br.readLine());
		int arr[] = new int[m];
		int t;
		st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < m; i++) {
			t = Integer.parseInt(st.nextToken());
			
			arr[i] = BSearch(arrN, t);
		}
		
		for(int i : arr) bw.write(i + "\n");
		bw.flush();
		bw.close();
	}

	static int BSearch(int arr[], int target) {
		int low = 0;
		int high = arr.length - 1;
		int mid;
		
		while(low <= high) {
			mid = (low + high) / 2;
			
			if(arr[mid] == target) return 1;
			else if(arr[mid] > target) high = mid - 1;
			else low = mid + 1;
		}
		
		return 0;
	}
}
