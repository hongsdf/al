package Math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
/*t (1 �� t �� 100)�� �־�����. �� �׽�Ʈ ���̽��� �� �ٷ� �̷���� �ִ�. �� �׽�Ʈ ���̽��� ���� ���� n (1 < n �� 100)�� �־�����,
 *  �������� n���� ���� �־�����. �Է����� �־����� ���� 1,000,000
 *  100000000
 *  */

/* ���� ���� n���� �־����� ��, ������ ��� ���� GCD�� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.*/
public class GCD {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		while(T-->0) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			int N = Integer.parseInt(st.nextToken());
			int arr[] = new int[N];
			for(int i = 0; i <N; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			int sum = 0;
//			Arrays.sort(arr);
//			for(int i = 0; i <arr.length-1; i++) {
//				sum += gcd(arr[i],arr[i+1]);
//			}
			
			
			for(int i = 0; i <N ; i++) { // i <N ���� �� j���忡���� arr[] ������ �ٷ� �����Ѵ� j = i+1�� �ϸ� ����
				for(int j = i+1; j<N; j++) {
					sum += gcd(arr[i],arr[j]);
					
				}
			}
			
			
			
			System.out.println(sum);
		}
	}

	
	
	
	// �ϴ� �ܿ��(GCD �ִ� ����� ����)
	private static int gcd(int x, int y) {
		if( y == 0) {
			return x;
		}else {
			return gcd(y,x%y); 
		}
		

	}





	private static int gcd2(int num1, int num2) {
		int gcd = 1; // �ʱⰪ 1
		for(int i = 2; i <=Math.min(num1, num2); i++) {
			if(num1 % i == 0 && num2 % i == 0) {
				gcd = i;
			}
		}
		return gcd;
	}
	
}
