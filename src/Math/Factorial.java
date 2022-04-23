package Math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*N!���� �ڿ������� ó�� 0�� �ƴ� ���ڰ� ���� ������ 0�� ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.*/
public class Factorial {
	public static List<int[]> list;
//	public static int<Integer> list;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		list = new ArrayList<>();
		fac(N); // 10 = ���μ� ���� 1 2 5 10 2�� 5�� ������ ������
		solve(N); 
		// 10�� ����� ���ؼ� 2 �� 5�� �ʿ��ϴ�
		// 2�� ������ ���� 
		// 5�� ��� ������ ���� �ָ� �ȴ�
		// 20 = 4 5
		// 1 2 4 5 10 20(2 5 2 )
		
	}


	private static void solve(int n) {
	int sum = 0;
	for(int i = 5; i <=n; i*=5) {
		sum += n/i;
	}
	System.out.println(sum);
	
}


	private static void fac(int n) {
		int sum = 1;
		for(int i = n; i >= 1; i--) {
			sum *= i;
		}
		System.out.println(sum);
		
	}
}
