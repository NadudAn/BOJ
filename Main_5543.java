package study2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main_5543 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int hambuger[] = new int[3];
		int drink[] = new int[2];
		
		for(int i = 0; i < 5; i++) {
			if(i < 3) hambuger[i] = Integer.parseInt(br.readLine());
			else drink[i - 3] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(hambuger);
		Arrays.sort(drink);
		
		System.out.println(hambuger[0] + drink[0] - 50);
	}

}
