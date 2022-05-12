package Monster;


import java.io.*;
import java.lang.*;
import java.util.*;

// ���� 
// ��ȯ�ֱⰡ �ٸ� �ѽ��� ���
// <x,y>�� ���� �ֱⰡ �ٸ���.
public class Chapter4_6 {
	public static final Scanner scanner = new Scanner(System.in);

	public static void testCase(int caseIndex) {
		int M = scanner.nextInt();
		int N = scanner.nextInt();
		int x = scanner.nextInt();
		int y = scanner.nextInt();

		// <1,1> ~ <M, N> ������ ǥ���ϴ� ī�� �޷��� �����Ѵ�
		KaingCalendar calendar = new KaingCalendar(M, N);

		// �� �޷¿��� <x, y>�� �� ��° �������� ����Ѵ�
		int answer = calendar.getIndex(x, y);

		// ������ ����Ѵ�
		System.out.println(answer);
	}

	public static void main(String[] args) throws Exception {
		int caseSize = scanner.nextInt();

		for (int caseIndex = 1; caseIndex <= caseSize; caseIndex += 1) {
			testCase(caseIndex);
		}
	}

}

class KaingCalendar
{
	final int M;    // ���� ��ȣ�� �ִ� ��
	final int N;    // ������ ��ȣ�� �ִ� ��

	KaingCalendar(int M, int N)
	{
		this.M   = M;
		this.N   = N;
	}

	/**
	 * 'index'��° ��¥�� X(���� ��ȣ)�� ��ȯ�ϴ� �Լ�
	 *
	 * @param index
	 * @return
	 */
	public int getXbyIndex(int index)
	{
		int numX = (index - 1 )%M +1;
		return numX;
	}

	/**
	 * 'index'��° ��¥�� Y(������ ��ȣ)�� ��ȯ�ϴ� �Լ�
	 *
	 * @param index
	 * @return
	 */
	public int getYByIndex(int index)
	{
		int numY = (index-1) %N +1;
		return numY;
	}

	/**
	 *
	 *
	 * @param x
	 * @param y
	 * @return  �� �޷¿��� <x, y>��� ������ ���ʷ� �����ϴ� ����
	 *          �������� �ʴ� ������� -1�� ��ȯ�Ѵ�
	 */
	public int getIndex(int x, int y)
	{
//		// native
//		for(int i = 1; i<= M * N; i+=1 ){
//			if(getXbyIndex(i) == x && getYByIndex(i) == y){
//				return i; // ��¥�� ã�Ҵ�.
//			}
//		}
//		return -1; //�ش� ��¥�� ����.
		
		// ����ȭ
		// �ϳ��� �� x�� �������ѵΰ� Ž���Ѵ�.
		//�׸��� M�� �ǳ� �ٸ� Ž���Ѵ�.
		// ��� ����� ���ȿ��� x�� �������� += M�� Ž���Ͽ��� ��� y�� ������ ���� �� �� �ִ�.
		// ex
		// M : 1,2
		// N : 1,2,3
		// <1,1>  
		// <2,2>
		// <1,3>
		// <2,1>
		// <1,2>
		// <2,3> 
		// <1,1> -- �ٽ� �������� ������ ��� ����,   ��� �����ȿ��� x�� 1�϶� y= 1,2,3�� ������ �� ������.
		//   :

		for(int i = x; i<= M * N; i+=M) {
			if( getXbyIndex(i) == y) {
				return i;
			}
		}
		return -1;
		
		
	}
}