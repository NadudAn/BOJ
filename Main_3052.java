package study2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_3052 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[10];
		int cnt = 0;
		
		for(int i = 0; i < 10; i++)
			arr[i] = Integer.parseInt(br.readLine()) % 42;
		
		for(int i = 0; i < 10; i++) 
			for(int j = 0; j < 10; j++) 
				if(i != j && arr[i] == arr[j] && arr[i] != -1) arr[j] = -1;
		
		for(int i = 0; i < 10; i++)
			if(arr[i] != -1) cnt++;
			
		System.out.println(cnt);

	}

}
