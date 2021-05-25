package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BeeHouse {			//백준 2292번 벌집

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int pre = 1, to = 8;
		
		if(n == 1) System.out.println(n);
		else {
			for(int i = 1; i < n; i++) {
				if(pre < n && to > n) {
					System.out.println(i + 1);
					break;
				}	
				else {
					pre = pre + (6 * i);
					to = to + (6 * (i + 1));
				}
			}
		}
	}

}
