package study2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;

public class Main_2981 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		BigInteger arr[] = new BigInteger[n];

		
		for(int i = 0; i < n; i++)
			arr[i] = new BigInteger(br.readLine());
		
		Arrays.sort(arr);
		
		BigInteger GCD = arr[1].subtract(arr[0]);
		
		for(int i = 2; i < n; i++) 
			GCD = GCD.gcd(arr[i].subtract(arr[i - 1]));
		
		int gcd = GCD.intValue();
		
		for(int i = 2; i <= gcd; i++) 
			if(gcd % i == 0) System.out.print(i + " ");
		
	}

}
