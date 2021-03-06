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
	 * 피보나치 수열의 1~n번째 항을 배열에 저장하여 반환해주는 함수
	 * * 단, 항의 가장 뒤 8자리만을 저장한다.
	 * @param n
	 * @return fibo[i] := 피보나치 수열의 i번째 항
	 */
	public static int[] makeFibonacciTable(int n)
	{
		// 정적메모리에 공통 변수 생성(불변 변수)
		int temp[] = new int[n+1];
		temp[0] = 0;
		temp[1] = 1;
		for(int i = 2; i<=n; i++){
			temp[i] = (temp[i-1] + temp[i-2])%10000000;
		}
		return temp;
	}

	/**
	 * 피보나치 수열의 n번째 항을 반환하는 함수
	 * 단, 항의 가장 뒤 8자리만을 반환한다.
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

		//가능한 모든 범위에 대한 피보나치 수열의 값을 계산해두자
		FIBONACCI_TABLE = makeFibonacciTable(MAX_N);

		//테스트케이스를 반복 수행한다.
		int caseSize = scanner.nextInt();
		for (int caseIndex = 1; caseIndex <= caseSize; caseIndex += 1)
		{
			int n = scanner.nextInt();

			//피보나치 수열의 n번째 항을 계산하여 출력한다.
			int answer = getFibo(n);
			writer.write(String.valueOf(answer) + "\n");
		}

		//불필요한 배열은 가능하면 할당 해제해주는 버릇을 들이자.
		FIBONACCI_TABLE = null;

		writer.flush();
		writer.close();
	}

}
