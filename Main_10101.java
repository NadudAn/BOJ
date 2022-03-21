package study2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main_10101 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum = 0, i = 3;
		int arr[] = new int[3];

		while(i --> 0) {
			arr[i] = Integer.parseInt(br.readLine());
			sum += arr[i];
		}
		
		Arrays.sort(arr);
		
		if(arr[0] == 60 && arr[2] == 60) 
			System.out.println("Equilateral");
		else if(sum == 180) {
			if(arr[0] == arr[1] || arr[1] == arr[2])
				System.out.println("Isosceles");
			else System.out.println("Scalene");
		}
		else
			System.out.println("Error");
		
	}

}
