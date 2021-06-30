package study2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2920 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int arr[] = new int[8];
		int check = -1, cnt = 8;
		
		for(int i = 0; i < 8; i++) 
			arr[i] = Integer.parseInt(st.nextToken());
		
		for(int i = 0; i < 8; i++) {
			if(arr[i] == i + 1) check = 0;
			else {
				check = -1;
				break;
			}
		}
		
		if(check == -1) {
			for(int i = 0; i < 8; i++) {
				if(arr[i] == 8 - i) check = 1;
				else {
					check = -1;
					break;
				}
			}
		}

		if(check == -1) System.out.println("mixed");
		else if(check == 0) System.out.println("ascending");
		else if(check == 1) System.out.println("descending");

	}

}
