package Monster;

import java.io.*;
import java.lang.*;
import java.util.*;


public class Circle {
	public static final Scanner scanner = new Scanner(System.in);

	/**
	 * ���� �Ʒ� ��ǥ�� (x,y)�� �ȼ��� ������ R�� ���� ���ԵǴ°�?
	 * @param x
	 * @param y
	 * @param R
	 * @return  ���Եȴٸ� true, else false
	 */
	public static boolean isInside(long x, long y, long R)
	{
		// ��ǥ��ĭ�� ���� ����� := ���� �Ʒ� ��
		long d = x*x +y*y;
		if(d < R*R){
			return true;
		}
		return false;
	}

	public static void testCase(int caseIndex) {
		long R = scanner.nextLong();
		long cnt = 0;
		long j = R; // j:= ������ �ʴ´�.
	   // 3��° ���
		// ���簢������ 1���̷� �����ϰ�, ���� �������� break
		for(int i = 0; i<=R; i++){
			for(; j>= 0; j--){ // j�����ϴ� ��� := �ؿ� if���� ��������������� j--�� ����ȴ�.
				// j := ���� ������ �����Ͽ� ���뺯���� �Ǿ���. j --> 0 ���� �����Ҷ������� ����(���� ������ ����)
				if(isInside(i,j,R)){
					 //�̶� ���� ����
					long height = j+1; // y��ǥ +1
					cnt += height;
					break; // break�� ������ j�� ���� �ȴ�.
				}
				
			}
		}
		
		
		
		System.out.printf("#%d\n", caseIndex);
		System.out.println(cnt*4);
	}

	public static void main(String[] args) throws Exception {
		int caseSize = scanner.nextInt();

		for (int caseIndex = 1; caseIndex <= caseSize; caseIndex += 1) {
			testCase(caseIndex);
		}
	}

}

