package Monster;

import java.io.*;
import java.lang.*;
import java.util.*;

// 1000000
// O(n)
public class Chapter4_primeNumber {
	public static final Scanner scanner = new Scanner(System.in);

	public static void testCase(int caseIndex) {
		long N = scanner.nextLong();

		// N�� ���μ� �����Ѵ�
		ArrayList<Long> factors = MathUtil1.factorize(N);

		// ������ ����Ѵ�
		System.out.printf("#%d:\n", caseIndex);
		for (int i = 0; i < factors.size(); i += 1) {
			System.out.print(factors.get(i));
			System.out.print(" ");
		}
		System.out.println();
	}

	public static void main(String[] args) throws Exception {
		int caseSize = scanner.nextInt();

		for (int caseIndex = 1; caseIndex <= caseSize; caseIndex += 1) {
			testCase(caseIndex);
		}
	}

}

class MathUtil1 {
	/**
	 * �ڿ��� N�� �����ϴ� ��� ���μ��� ��ȯ�ϴ� �Լ�
	 *
	 * @param N
	 * @return
	 */
	public static ArrayList<Long> factorize(long N)
	{
		ArrayList<Long> factors = new ArrayList<>();
		// ���� ������ ���
//		 while(N > 1){
//		 	for(long i = 2; i<=N; i++){
//		 		if(N % i == 0){
//		 			factors.add(i);
//					N/= i;
//		 			break;
//		 	}
//		 }
			
		// native
//			 for(long i = 2; i <= N; i++){
//			 	while(N % i == 0){ // ���� ���μ��� ���������� ��� ������ ex) 2,2,2..
//			 			factors.add(i);
//			 			N/=i;
//			 }
//		}
			 
		// optimal solution
	    // ex) number := 14�� ���
		for(long i = 2; i*i <= N; i++){ // sqrt(n) ������ ���Ǳ�
			while(N % i == 0){ // ���� ���μ��� ���������� ��� ������ ex) 2,2,2..
				factors.add(i);
				N/=i;
			}
		}
		
		// ������� ���� ��Ʈ(N)���� �μ��� �� ���Ѱ��̴�.
		// ���� N�� 1���� ũ�� N�� �Ҽ��� ���̴�.
		if(N > 1){
			factors.add(N);
		}

		return factors;
	}
}