package Monster;

import java.io.*;
import java.lang.*;
import java.util.*;


public class Pibo {
	public static final Scanner scanner = new Scanner(System.in);
	public static final BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

	public static final int MAX_N = 100000000 + 1;
	public static int[] FIBONACCI_TABLE;

	/**
	 * �Ǻ���ġ ������ 1~n��° ���� �迭�� �����Ͽ� ��ȯ���ִ� �Լ�
	 * * ��, ���� ���� �� 8�ڸ����� �����Ѵ�.
	 * @param n
	 * @return fibo[i] := �Ǻ���ġ ������ i��° ��
	 */
	public static int[] makeFibonacciTable(int n)
	{
		// �����޸𸮿� ���� ���� ����(�Һ� ����)
		int temp[] = new int[n+1];
		temp[0] = 0;
		temp[1] = 1;
		for(int i = 2; i<=n; i++){
			temp[i] = (temp[i-1] + temp[i-2])%10000000;
		}
		return temp;
	}

	/**
	 * �Ǻ���ġ ������ n��° ���� ��ȯ�ϴ� �Լ�
	 * ��, ���� ���� �� 8�ڸ����� ��ȯ�Ѵ�.
	 * @param n
	 * @return
	 */
	public static int getFibo(int n)
	{
		int answer = 0;
		int temp[] = makeFibonacciTable(n);
		answer = temp[n];
		return answer;
	}

	public static void main(String[] args) throws Exception {

		//������ ��� ������ ���� �Ǻ���ġ ������ ���� ����ص���
		FIBONACCI_TABLE = makeFibonacciTable(MAX_N);

		//�׽�Ʈ���̽��� �ݺ� �����Ѵ�.
		int caseSize = scanner.nextInt();
		for (int caseIndex = 1; caseIndex <= caseSize; caseIndex += 1)
		{
			int n = scanner.nextInt();

			//�Ǻ���ġ ������ n��° ���� ����Ͽ� ����Ѵ�.
			int answer = getFibo(n);
			writer.write(String.valueOf(answer) + "\n");
		}

		//���ʿ��� �迭�� �����ϸ� �Ҵ� �������ִ� ������ ������.
		FIBONACCI_TABLE = null;

		writer.flush();
		writer.close();
	}

}
