package Monster;

import java.io.*;
import java.lang.*;
import java.util.*;


public class Chapter5_C1 {
	public static final Scanner scanner = new Scanner(System.in);

	/**
	 * ���ʿ��� ���������� ���ʷ� ������ ������׷��� ���ο� ���� �� �ִ�
	 * �ִ��� ���簢�� ���̸� ����ϴ� �Լ�
	 *
	 * @param n             ������׷��� ��
	 * @param histograms    ������׷��� ���ʷ� ����� �迭
	 * @return
	 */
	public static long getLargestRectangleArea(int n, Histogram[] histograms) {
		long answer = 0;    // �ִ� ���簢���� ����

		// ���� �������� Ȯ�� ���ɼ��� �ִ� ������׷���
		Stack<Histogram> continuedHistograms = new Stack<>();
		// ����ũ := ������ ���̸� 2�� �����
		continuedHistograms.add(new Histogram(-1, 0));
		for(int i = 0; i<n+1; i++) {
			// ������׷� ����
			Histogram h = null;
			// �������� ����
			if( i < n) {
				h = histograms[i];
			}else{
				// ������ �������� ���
				h = new Histogram(n, 0);
			}
			
			while(continuedHistograms.size() > 1 && continuedHistograms.peek().height >= h.height) {
				// ������ ���� ����� �߰��������
				Histogram lh = continuedHistograms.pop(); // �׶� h�� ������ ���� ����̴�.
				
				Histogram bh = continuedHistograms.peek();
				
				long width = h.leftX - bh.rightX ;
				long hei = lh.height;
				// �ش� ��տ� ���� ���̸� ã�´�
				long area = width * hei ;
				// �ִ� ���� ����
				answer = Math.max(answer, area);
				
			}
			// ���� ����� ã�� ���� h��� ����
			continuedHistograms.add(h);
			// �������� ó�� ���̿� ������ 0���̰� ������.
			// �׷��� ó�� ���̴� �ڽ��� ���̸� ����
		}

		return answer;
	}

	public static void testCase(int caseIndex) {
		int n = scanner.nextInt();

		Histogram[] histograms = new Histogram[n];
		for(int i = 0 ; i < n ; i ++) {
			int height = scanner.nextInt();
			histograms[i] = new Histogram(i, height);
		}

		long answer = getLargestRectangleArea(n, histograms);
		System.out.println(answer);
	}

	public static void main(String[] args) throws Exception {
		int caseSize = scanner.nextInt();

		for (int caseIndex = 1; caseIndex <= caseSize; caseIndex += 1) {
			testCase(caseIndex);
		}
	}

}

class Histogram{
	public final int height;    // ������׷��� ����
	public final int leftX;     // �ε��� Ȥ�� ������׷��� ���� ���� x ��ǥ
	public final int rightX;    // ������׷��� ������ ���� x��ǥ

	public Histogram(int index, int height) {
		this.leftX = index;
		this.rightX = this.leftX + 1;   // �� ������׷��� �ʺ� 1�̹Ƿ�
		this.height = height;
	}

}