package Monster;

import java.io.*;
import java.lang.*;
import java.util.*;


public class FourCard {
	public static final Scanner scanner = new Scanner(System.in);

	/**
	 * �ߺ��� ������ �� ī���� ������ ���� �� �ִ� ��÷��ȣ���� ����Ʈ�� ��ȯ�ϴ� �Լ�
	 * @param n     ī���� ��
	 * @param m     �˻��Ϸ��� ��÷��ȣ�� ��
	 * @param cards   �� ī�忡 ���� ���ڵ�
	 * @param target  �˻��Ϸ��� �� ��÷��ȣ ����Ʈ
	 * @return      �� ī���� ������ ǥ���� �� �ִ� ��÷��ȣ���� �������� ����Ʈ
	 */
	
	/*
	 * ���� ����
	 * ��ī��� ��ī�� ���� Ǯ�� :=   target�� k���� - (a +b ) ���� ���� �� ���� x��� ����
	 * �׷��� cards�迭���� Ž���Ͽ� x�� ������ k�� ����� �ְ�, ������ ������ ���Ѵ�.
	 * 
	 * Ž���Ҷ�
	 * binarySearch(���ĵ� �迭 , ã���ϴ� ��) >= 0 := ���� ����
	 * < 0 : =ã���� �ϴ� ���� ����
	 * 1.�Է°����� ���ĵ� �迭, ã�����ϴ� ��
	 * 2.��°� := �ε�����ġ ��ȯ
	 * 3.�ð� ���⵵ ( o(log2n))
	 * 
	 * ������ ��ī�� ������ �ð����⵵�� o(n^3)�̹Ƿ� �ð��ʰ��� �߻��Ѵ�.
	 * �׷���
	 * 2ī�徿 ��� �����ϸ�
	 * S = (a+b)  + (c+d) : 2���� 2���� ī��� ġȯ�Ͽ� ��� ��
	 * 
	 * ����
	 * 1.2ī�带 �ѽ��� ���� ���
	 * 
	 * 
	 * 2.target�迭���� �ֵ鿡���� �ݴ� ���� ���� �ϸ�
	 * ã�� ��
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * */
	
		
		
		 
	
	
	
	
	public static ArrayList<Integer> getPossibleTargets(int n, int m, int[] cards, int[] target)
	{
		ArrayList<Integer> answer = new ArrayList<Integer>();
		
		ArrayList<Pair> list = new ArrayList<>(); //  ��ī�带 ���� �����迭 ����(=�ѽ�)
		for(int a : cards ) {
			for(int b : cards) {
				list.add(new Pair(a,b));
			}
		}
		Collections.sort(list);
		
		for(int t : target) {
			boolean flag = false;
			for(Pair p : list) {
				int x = t - p.sum; // �ݴ��� �ѽ��� ã��(���� ���Ұ� �߿� X ,���� �߿�)
				Pair pairs = new Pair(x); // �Ű����� �Ѱ�  �ѽֿ� ���� ����(=�ո� �߿�)
				if(Collections.binarySearch(list, pairs) >= 0) {
					flag = true; // Ÿ�ٰ��� �߰��ߴ�.
					break;
				}
			}
			if(flag) {
				answer.add(t);
			}
		}
		Collections.sort(answer);
		
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

		ArrayList<Integer> answers = getPossibleTargets(n, m, cards, targets);


		if(answers.size() == 0)
		{ // ������ ��÷��ȣ�� ���ٸ� NO�� ����Ѵ�
			System.out.print("NO");
		}else
		{ //������ ��÷��ȣ�� �����Ѵٸ� �� ����� ����Ѵ�.
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
//1. ī�带 ���� Ŭ���� ����
	class Pair implements Comparable<Pair>{
		int card1; // ī�� 1
		int card2; // ī�� 2
		int sum; // ī��1 + ī��2 ��
		
		public Pair(int card1,int card2){
		 this.card1 = card1;
		 this.card2 = card2;
		 this.sum = this.card1 + this.card2; // ����
		}
		// �Ű����� �ϳ�
		public Pair(int sum) {
			this.sum = sum;
		}

		@Override
		public int compareTo(Pair o) {
			
			return this.sum - o.sum;
		}
		
	}







