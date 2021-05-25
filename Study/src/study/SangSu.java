package study;

import java.util.Scanner;

public class SangSu {			//백준 2908번 상수

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int index = 0;
		int ab[] = new int[2];
		int num[] = new int[2];
		
		for(int i = 0; i < 2; i++) ab[i] = sc.nextInt();
		for(int i = 0; i < 2; i++) 
			while(true) {
				num[i] += ab[i] % 10;
				ab[i] /= 10;
				++index;
				if(ab[i] <= 0) break;
				num[i] *= 10;
			}
		
		if(num[0] > num[1]) System.out.println(num[0]);
		else System.out.println(num[1]);

	}

}
