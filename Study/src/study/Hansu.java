package study;

import java.util.Scanner;

public class Hansu {		//백준 1065번 한수

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n, sum = 0;
		n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) if(hansu(i) == true) sum++;
		System.out.println(sum);
	}

	public static boolean hansu(int n) {
		boolean flag = true;
		int i = 0, t = 0;
		int arr[] = new int[5];

		if (n < 100) return true;
		
		while(true) {
			arr[i] = n % 10;
			n /= 10;
			i++;
			if (n <= 0) break;
		}
		
		t = arr[1] - arr[0];
		
		for(int j = 1; j < i; j++) if (t != arr[j] - arr[j - 1]) flag = false;

		return flag;
	}

}
