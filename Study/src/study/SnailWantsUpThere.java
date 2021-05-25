package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SnailWantsUpThere {	//백준 2869번 달팽이는 올라가고 싶다

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int a, b, v, day = 0;
		a = Integer.parseInt(st.nextToken());
		b = Integer.parseInt(st.nextToken());
		v = Integer.parseInt(st.nextToken());
		
		if(b > a) {
			System.out.println("b는 a보다 클 수 없습니다");
			return;
		}
		
		day = (v - b) / (a - b);
		if((v - b) % (a - b) != 0) ++day;
		System.out.println(day);
	}

}
