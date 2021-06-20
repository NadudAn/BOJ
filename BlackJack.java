package study2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BlackJack {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int t = Integer.parseInt(st.nextToken());
		int max = Integer.parseInt(st.nextToken());
		
		int arr[] = new int[t];
		st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < t; i++) 
			arr[i] = Integer.parseInt(st.nextToken());
		
		Arrays.sort(arr);
		
		System.out.println(card(t, max, arr));
	}
	
	static int card(int t, int max, int arr[]) {
		int first, second, third, result = 0, jack;
		
		for(int i = 0; i < t - 2; i++) {
			first = arr[i];
			if(first > max) continue;
			
			for(int j = i + 1; j < t - 1; j++) {
				second = arr[j];
				if(first + second > max) continue;
				
				for(int u = i + 2; u < t; u++) {
					third = arr[u];
					jack = first + second + third;
					
					if(jack > max) continue;
					if(jack == max) return jack;
					if(jack < max && jack > result) result = jack;
				}
			}
		}
		return result;
	}

}
