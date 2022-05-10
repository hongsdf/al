package Monster;


import java.io.*;
import java.lang.*;
import java.util.*;


public class Chapter4_ara {
	public static final Scanner scanner = new Scanner(System.in);
	public static final int MAX_VALUE = 1000000;
	public static final Sieve sieve = new Sieve(MAX_VALUE);

	public static ArrayList<Integer> getAllPrimeNumbers(int from, int to)
	{
		ArrayList<Integer> primes = new ArrayList<>();

		for(int num = from; num <= to; num += 1)
		{
			if(sieve.isPrimeNumber(num) == true)
			{
				primes.add(num);
			}
		}

		return primes;
	}

	public static void testCase(int caseIndex) {
		int L = scanner.nextInt();
		int R = scanner.nextInt();

		ArrayList<Integer> allPrimeNumbers = getAllPrimeNumbers(L, R);

		System.out.printf("Case #%d:\n", caseIndex);
		System.out.println(allPrimeNumbers.size());
	}

	public static void main(String[] args) throws Exception {
		int caseSize = scanner.nextInt();

		for (int caseIndex = 1; caseIndex <= caseSize; caseIndex += 1) {
			testCase(caseIndex);
		}
	}

}


class Sieve //���μ� ���ظ� ������
{
	final int maximumValue;     // �����佺�׳׽��� ü���� �ٷ� ���� ū ������ ��
	final boolean[] isPrime;    // �� ���ں� �Ҽ� ����
	Sieve(int maximumValue)
	{
		this.maximumValue = maximumValue;
		this.isPrime = new boolean[maximumValue+1];
		this.fillSieve();
	}

	/**
	 *
	 * @param num
	 * @return 'num'�� �Ҽ���� true, �׷��� ������ false
	 */
	public boolean isPrimeNumber(int num)
	{
		return this.isPrime[num];
	}

	/**
	 * isPrime �迭�� ���� ä��� �Լ�
	 */
	private void fillSieve()
	{
		// false := ������(�Ҽ� x), true : ������ �ʾҴ�(�Ҽ� o) 
		
		// ��ü�迭�� true�� �ʱ�ȭ
		Arrays.fill(isPrime,true);
		// 1�� �Ҽ��� �ƴϴ� ����ó��
		isPrime[1] = false;
		// 2~ N���� k�� ��ȸ�ϸ� �Ҽ��� ��ȸ�Ұ��̴�.
		for(int i = 2; i<= maximumValue; i++){
			// �̹� i�� ����� �����ٸ� ��ŵ
			if(isPrime[i] == false){ 
				continue;
			}
			for(int j = i + i; j<= maximumValue ; j+=i){
				// ��ȸ�Ҷ� k�� ����� �����
					isPrime[j] = false;
			}
		}
		
		
		
	}
}