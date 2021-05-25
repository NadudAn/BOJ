package study;

public class SelfNum {		//백준 4673번 셀프넘버

	public static void main(String[] args) {
		int num = 0;
		int arr[] = new int[10001];
		
		for(int i = 0; i < 10000; i++) arr[i] = d(i + 1);
		for(int i = 0; i < 10000; i++) {
			for (int j = 0; j < 10000; j++) if((i + 1) == arr[j]) num++;
			if(num == 0) System.out.println(i + 1);
			num = 0;
		}
	}

	public static int d(int n) {
		int sum = n;
		while(true) {
			sum += n % 10;
			n /= 10;
			if(n <= 0) break;
		}
		return sum;
	}

}
