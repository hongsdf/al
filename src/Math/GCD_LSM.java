package Math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// �ִ������� �ٿ��� GCD��� ����.
// �� �� A�� B�� �ִ����� G�� A�� B�� ����� ��� �߿��� ���� ū �����̴�.
// �ִ������� ���ϴ� ���� ���� ����� 2���� min(A, B)���� ��� ������ ������ ���� ���
// �ִ������� 1�� �� ���� ���μ�(Coprime)��� �Ѵ�.
public class GCD_LSM {
	public static int GCD =1;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
//		GCD(A, B);
		GCD = gcd(A,B);
		LSM(A, B);

	}

	// LSM �ּ� ����� �� ���� GCD�� ������ * GCD
	private static void LSM(int a, int b) {
		// �ּҰ���� l = g * (a/g) * (b/g) : �ִ� ������� �̿��Ͽ� ���Ҽ� �ִ�.
		// ���1
		int LCM = GCD * (a / GCD) * (b / GCD);
		// ���2
		//int LCM = a * b / GCD; 
		// 24/6 * 18/6 = 4 * 3 * 6
		System.out.println(LCM);

	}

	// 24 18 6
	// �ִ� �����(�Ϲ������� ����)
	private static void GCD(int a, int b) {
		// �� �� �� ���� ������ ���Ѵ�.
		for (int i = 2; i <= Math.min(a, b); i++) {
			if (a % i == 0 && b % i == 0) {
				GCD = i;
			}
		}
		System.out.println(GCD);

	}
	// �ִ� ����� ��� �Լ� ���
	static int gcd(int a, int b) { // 24 18 -> 
		if (b == 0) { // base - case Ż�� ���� 
			return a;
		} else {
			return gcd(b, a % b); 
			// 18%24(����) 24,18 -> 18,6 ->  6,0
			// 24%18(����) 18,6 -> 6,0 
		}
	}
	// Swap �� �ʿ���� (�������� ū������) 18%24 = 18, 24%18 = 6
	// 
}