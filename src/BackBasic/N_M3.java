package BackBasic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// �ߺ��� ������ ����
// ������ rũ���� ��������� �־���Ѵ�
// pos == r �����϶� Ż�� ����
// ������ pos�� �����δ�.

// pos := ���̸� �ǹ�

public class N_M3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken()); // N�� ��
		int M = Integer.parseInt(st.nextToken()); // M���� �����
		int[] output = new int[M]; // ���� ���� ����
		permute(0, output, N, M);

	}
	// 4 2

	private static void permute(int pos, int[] output, int n, int m) {
		if (pos == m) {
			print(output, m); // ��������� �ִ� ���� ���
			return;
		}
		for (int i = 0; i < n; i++) {
			// �ߺ��� �����ϸ� visit �湮���θ� ������ �ʾƵ� �ȴ�.
			output[pos] = i + 1;
			permute(pos + 1, output, n, m);

		}
	}

	private static void print(int[] output, int m) {
		for (int i = 0; i < m; i++) {
			System.out.print(output[i] + " ");
		}
		System.out.println();

	}

}
