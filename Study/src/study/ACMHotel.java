package study;

import java.util.Scanner;

public class ACMHotel {			//백준 10250번 ACM호텔

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int h, w, n, x, y;
		int t = sc.nextInt();
		int arr[] = new int[t];
		
		for(int i = 0; i < t; i++) {
			h = sc.nextInt();
			w = sc.nextInt();
			n = sc.nextInt();

			if(n % h == 0) {
				x = h;
				y = n / h;
			}
			else {
				x = n % h;
				y = n / h + 1;
			}

			arr[i] = (x * 100) + y;
		}
		
		for(int i : arr) System.out.println(i);
	}

}
