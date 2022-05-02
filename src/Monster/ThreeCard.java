package Monster;

import java.io.*;
import java.lang.*;
import java.util.*;


public class ThreeCard {
	public static final Scanner scanner = new Scanner(System.in);

	/**
	 * �ߺ��� ������ �� ī���� ������ ���� �� �ִ� ��÷��ȣ���� ����Ʈ�� ��ȯ�ϴ� �Լ�
	 * @param n     ī���� ��
	 * @param m     �˻��Ϸ��� ��÷��ȣ�� ��
	 * @param cards   �� ī�忡 ���� ���ڵ�
	 * @param target  �˻��Ϸ��� �� ��÷��ȣ ����Ʈ
	 * @return      �� ī���� ������ ǥ���� �� �ִ� ��÷��ȣ���� �������� ����Ʈ
	 */
	public static ArrayList<Integer> getPossibleTargets(int n, int m, int[] cards, int[] target)
	{
		ArrayList<Integer> possibleTargets = new ArrayList<>(); //���� �� �ִ� ��÷��ȣ��
		Arrays.sort(cards); //����
		for(int k : target){
			boolean flag = false;
			for(int a: cards){
				for(int b: cards){
					int x = k - (a + b);
					if(Arrays.binarySearch(cards,x) >= 0){
						flag = true;
						break;
					}
				}
			}
			if(flag){
				possibleTargets.add(k);
			}
		}
		Collections.sort(possibleTargets);

		return possibleTargets;
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

		ArrayList<Integer> answers = getPossibleTargets(n, m, cards, targets);

		if(answers.size() == 0)
		{
			System.out.print("NO");
		}else{
			for(int i = 0 ; i < answers.size() ; i++)
			{
				if( i > 0 )
				{
					System.out.print(" ");
				}
				System.out.print(answers.get(i));
			}
		}
	}

}

