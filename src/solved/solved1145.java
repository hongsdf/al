package solved;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//�ټ� ���� �ڿ����� �ִ�. �� ���� ��� ��κ��� ����� ���� �� �� ��� �� ���� ������ ���� ���� ���� �ڿ����̴�.
//���� �ٸ� �ټ� ���� �ڿ����� �־��� ��, ��� ��κ��� ����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
// 30 42 70 35 90   210
// 30 35 42 70 90

// 30 45 23 26 56 -> 23 26 30 45 56
// 1170

// 1 2 3 4 5  := 1�� ������ ������ ������� �ִ����� ã�´�.
// 5c3 = 52/ 2 321
// 4

// 2 / 1 = 2 .. 0
// 26 /23 = 1 .. 3

// ���� ���� �迭���� 3���� �ּ� ����� ã��

public class solved1145 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int arr[] = new int[5];
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		for(int i = 0; i <arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
//		int arr[] = { 30, 45, 23, 26, 56 };
		Arrays.sort(arr); // n log n
		int n = arr.length;
		// ����Ʈ 1 ����
		List<Integer> list1 = new ArrayList<>();

		// 5000 * 5000 * 5 == 125
		for (int i = 0; i < n; i++) {
			// GCD����
			for (int j = i + 1; j < n-1; j++) {
				int ans = gcd(arr[i], arr[j]);
				int lcs  = (arr[i] * arr[j] / ans);
				for (int k = j + 1; k < n; k++) {
					int numlcs = gcd(arr[k], lcs);
					list1.add((arr[k] * lcs / numlcs));
				}

			}

		}
		Collections.sort(list1); // n log n
		System.out.println(list1.get(0));
	}

	// �ִ� ����� ���� + �ּҰ����
	private static int gcd(int a, int b) {
		int gcd = 1;
		for (int i = 2; i <= a * b; i++) {
			if (a % i == 0 && b % i == 0) {
				gcd = i;
			}
		}
		return gcd;

	}
}
