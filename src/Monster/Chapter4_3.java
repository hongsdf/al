package Monster;

import java.util.Scanner;

public class Chapter4_3 {
	public static final Scanner scanner = new Scanner(System.in);

	public static void testCase(int caseIndex)
	{   //�� �׽�Ʈ���̽��� ���Ͽ�
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();

		// �� ������ �ִ� ������� �ּ� ������� ����Ѵ�
		long gcd =  MathUtil.getGCD(num1, num2);
		long lcm =  MathUtil.getLCM(num1, num2);

		// ������ ����Ѵ�
		System.out.printf("Case #%d:\n", caseIndex);
		System.out.printf("%d %d\n", gcd,lcm);
	}

	public static void main(String[] args) throws Exception {
		int caseSize = scanner.nextInt();

		for (int caseIndex = 1; caseIndex <= caseSize; caseIndex += 1) {
			testCase(caseIndex);
		}
	}

}

class MathUtil{

	/**
	 * a�� b�� �ִ� ������� ����ϴ� �Լ�
	 *
	 * @param a
	 * @param b
	 * @return
	 */
	static long getGCD(long a, long b)
	{
		// ��Ŭ���� ȣ����
		// �μ��� �������� ���
		// �μ��� ������ �������� �ʴ� ���
		while((a%b) != 0) {
			long c = a%b;
			a = b;
			b = c;
		}
		return b; 
	}

	/**
	 * a�� b�� �ּ� ������� ����ϴ� �Լ�
	 *
	 * @param a
	 * @param b
	 * @return
	 */
	static long getLCM(long a, long b)
	{
		return a*b / getGCD(a,b); // a * b / gcd(a,b)
	}
}

