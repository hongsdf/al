package Monster;

import java.io.*;
import java.lang.*;
import java.util.*;


public class TwoCard {
	public static final Scanner scanner = new Scanner(System.in);

	/**
	 * �ߺ��� ������ �� ī���� ������ ���� �� �ִ� ��÷��ȣ�� ���� ����ϴ� �Լ�
	 * @param n     ī���� ��
	 * @param m     �˻��Ϸ��� ��÷��ȣ�� ��
	 * @param cards   �� ī�忡 ���� ���ڵ�
	 * @param target  �˻��Ϸ��� �� ��÷��ȣ ����Ʈ
	 * @return
	 */
	public static int getPossibleTargetNumber(int n, int m, int[] cards, int[] target)
	{
		int answer = 0; //���� �� �ִ� ��÷��ȣ�� ��
		
//		for(int i = 0; i < n; i++){
//			for(int j = 0; j < n; j++){
//				 int sum = cards[i] + cards[j];
//				for(int k = 0; k<m; k++){
//					if(target[k] == sum){
//						target[k] = -1;
//						answer++;
//						
//					}
//				}
//			}
//		}
		Arrays.sort(cards); // ����
		for(int k : target) {
			boolean flag = false;
			for(int a : cards) {
				int x = k -a;
				if(Arrays.binarySearch(cards,x) >= 0) { // ���� ã�Ҵ�.
					// < 0 ���� ������ := ��ã��
					flag = true;
					break;
				}
			}
			if(flag) {
				answer +=1;
			}
		}
		
		
		return answer;
	}

	public static void main(String[] args) throws Exception {
		int n = scanner.nextInt();  // ī���� ��
		int m = scanner.nextInt();  // �˻� �� �ĺ� ��÷��ȣ�� ��

		int[] cards = new int[n];
		int[] targets = new int[m];

		// �� ī�� ������ �Է¹޴´�
		for(int i = 0 ; i < n ; i ++)
		{
			cards[i] = scanner.nextInt();
		}

		// �� ��÷��ȣ�� �Է¹޴´�
		for(int i = 0 ; i < m ; i ++)
		{
			targets[i] = scanner.nextInt();
		}

		int answer = getPossibleTargetNumber(n, m, cards, targets);

		System.out.println(answer);
	}

}
