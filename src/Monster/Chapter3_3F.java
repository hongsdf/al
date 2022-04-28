package Monster;

import java.io.*;
import java.lang.*;
import java.util.*;


public class Chapter3_3F {
	public static final Scanner scanner = new Scanner(System.in);


	/**
	 *
	 * @param n   ī���� ��
	 * @param m   �ٹ��� ������ ���� ��
	 * @param cards   �� ī�忡 ���� ������ ����Ʈ (cards[1] ~ card[n])
	 * @param ranges  �� ���� ������ ������ ����Ʈ (ranges[0] ~ ranges[m-1])
	 * @return        �� ������ ���� ���� ū ���� ��ü
	 */
	public static Range getBestRange(int n, int m, int[] cards, Range[] ranges) {
		Range answer = ranges[0];
		
		// ������:= ������ Ȱ���ϸ� �ð����⵵�� �� �� �� �ִ�.
		// ������ �迭 ���� := 1 ~ cards[i]���� ������ ���� �迭
		long Rangsum[] = new long[n+1];
		
		// ������ �迭 ä���ֱ�
		for(int i =1; i<=n; i++){ // 1�������ϴ� ����:= i-1 �̷���Ȳ�� ����ó��
			Rangsum[i] = Rangsum[i-1] + cards[i]; // i-1������ + card[i]
		}
		//������ �ϼ�
		// �ҵ� ��ȯ
			for(Range r : ranges ){
				r.totalPoint = Rangsum[r.right] - Rangsum[r.left-1];
				if(answer.totalPoint < r.totalPoint){
					answer = r;
				}
			}


		return answer;
	}

	public static void main(String[] args) throws Exception {
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int[] cards = new int[n+1];
		Range[] ranges = new Range[m];

		// �� ī���� ������ �Է¹޴´�.
		for(int i = 1 ; i <= n ; i ++)
		{
			cards[i] = scanner.nextInt();
		}

		// �ҵ��� ������ �Է¹޴´�.
		for(int i = 0 ; i < m; i ++)
		{
			int l = scanner.nextInt();
			int r = scanner.nextInt();
			ranges[i] = new Range(i + 1, l, r); // �� ��ȣ 1������
		}

		//������ ���� ���� ū ������ ����Ѵ�.
		Range answer = getBestRange(n, m, cards, ranges);

		System.out.printf("%d %d\n", answer.index, answer.totalPoint);
	}

}

class Range{
	int index; // �� ��ȣ
	int left;  // ���ʰ�
	int right; // ������ ��
	long totalPoint; // ����
	Range(int index, int left, int right)
	{
		this.index = index;
		this.left = left;
		this.right = right;
		this.totalPoint = 0;
	}
}