package study2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main_2935 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BigInteger a = new BigInteger(br.readLine());
		String op = br.readLine();
		BigInteger b = new BigInteger(br.readLine());
		
		if(op.equals("+")) System.out.println(a.add(b));
		else System.out.println(a.multiply(b));

	}

}
