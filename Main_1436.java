package study2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main_1436 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int cnt = 0, c = 666;
		
		while(true) {
			if(String.valueOf(c).contains("666")) ++cnt;
			if(cnt == n) break;
			++c;
		}
		
		bw.write(c + "\n");
		bw.flush();
		bw.close();
		br.close();
	}

}
