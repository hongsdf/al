package Monster;

import java.io.*;
import java.lang.*;
import java.util.*;


public class Chapter4_8 {
	public static final Scanner scanner = new Scanner(System.in);
	public static final int MAX_VALUE = 1000000;


	/**
	 * ������ ��Ģ�� �����ϸ鼭 ���� �� �ִ� ���� ū �ִ������� ��ȯ�ϴ� �Լ�
	 *
	 * @param n         �־��� ī���� ��
	 * @param cards     �� ī�忡 ���� ���� �迭
	 * @return
	 */
	public static int getMaximumGCD(int n, int[] cards)
	{
			int answer = 1;
			// �󵵼� �迭
			int freq[] = new int[MAX_VALUE+1] ;
			// n���� �� ���μ� ����
		for(int c : cards){
			ArrayList<Long> list = MathUtil2.factorize(c);
			for(long num : list){
				freq[(int)num]+=1;
			}
		}
		// �󵵼� �迭�� Ž���ϸ� �յ� �й�
		for(int i = 2; i<=MAX_VALUE ; i+=1){
			if(freq[i] == 0){
				continue;
			}
			int cnt = freq[i]/n;
			answer *= MathUtil2.powInt(i,cnt);
		}

		return answer;
	}

	public static void main(String[] args) throws Exception {
		int n = scanner.nextInt();
		int[] cards = new int[n];
		for(int i = 0 ; i < n ; i++)
		{
			cards[i] = scanner.nextInt();
		}

		int answer = getMaximumGCD(n, cards);

		System.out.println(answer);
	}

}

class MathUtil2{
	/**
	 *
	 * @param N
	 * @return
	 */
	public static ArrayList<Long> factorize(long N) // �ָ�
	{
		
		ArrayList<Long> factorlist = new ArrayList<>();
		// N�� ���μ� ����
		for(long i = 2; i * i <= N; i+=1){
			while(N % i == 0){
				factorlist.add(i);
				N/=i;
			}
		}
		if(N > 1){
			factorlist.add(N);
		}
		return factorlist;
	
	}


	/**
	 * �� ���� a, n�� ���� a ^ n�� ������ִ� �Լ�
	 *
	 * @param a
	 * @param n
	 * @return
	 */
	public static int powInt(int a, int n)
	{
//		double answer = Math.pow(a,n);
//		return (int)answer ;
		
		// Native
		
		int answer = 1;
		for(int i = 1; i<=n; i++) {
			answer *= a;	
		}
		return answer;
	}
}



