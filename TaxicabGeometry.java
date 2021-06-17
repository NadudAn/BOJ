package study2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TaxicabGeometry {					//백준 3053번 택시 기하학

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n, area;
		n = Integer.parseInt(br.readLine());
		
		area = n * n * 2;		// 택시 기하학에서 원의 넓이 공식
		System.out.printf("%.6f\n", n * n * Math.PI);
		System.out.println(area);
	}

}
