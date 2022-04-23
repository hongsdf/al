package Math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/* (A+B)%C�� ((A%C) + (B%C))%C �� ������?

(A��B)%C�� ((A%C) �� (B%C))%C �� ������?

�� �� A, B, C�� �־����� ��, ���� �� ���� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.*/
// ù° �ٿ� (A+B)%C,
// ��° �ٿ� ((A%C) + (B%C))%C,
// ��° �ٿ� (A��B)%C,
// ��° �ٿ� ((A%C) �� (B%C))%C�� ����Ѵ�.

// 5 8 4
public class Divide {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		System.out.println((A+B)%C); // 1
		System.out.println(((A%C) + (B%C))%C);
		
		System.out.println((A*B)%C);
		System.out.println(((A%C) * (B%C))%C);

		
	}
}
