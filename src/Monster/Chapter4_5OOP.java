package Monster;

import java.io.*;
import java.lang.*;
import java.math.BigInteger;
import java.util.*;

// 1000 1000 10000
public class Chapter4_5OOP {
	public static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		int nNumbers = scanner.nextInt();   // �迭�� ������ ��
		int nCommands = scanner.nextInt();  // ó���� ��ɾ��� ��

		// Shift ������ ������ �迭�� �����ϰ� ���Ҹ� ���ʷ� �Է��Ѵ�
		ShiftingArray<Integer> array = new ShiftingArray<>(nNumbers);
		for(int i = 0 ; i < nNumbers ; i ++)
		{
			array.set(i, scanner.nextInt());
		}

		// �� ��ɾ ó���Ѵ�
		for(int i = 0 ; i < nCommands; i+= 1)
		{
			// ��ɾ� ������ �Է¹޴´�
			int cmd = scanner.nextInt();
			if( cmd == 0 )
			{   // ���� �迭�� p�� �ε����� �ִ� ���Ҹ� ����ϴ� ���
				int p = scanner.nextInt();
				int value = array.get(p);
				System.out.println(value);
			}else if(cmd == 1)
			{   // ���� �迭�� �������� k�� shift�ϴ� ���
				int k = scanner.nextInt();
				array.shiftLeft(k);
			}else if(cmd == 2)
			{   // ���� �迭�� ���������� k�� shift�ϴ� ���
				int k = scanner.nextInt();
				array.shiftRight(k);
			}else if(cmd == 3)
			{   // ���� �迭�� ������ ��ġ�� �����ϴ� ���
				array.initializePosition();
			}
		}
	}
}



class ShiftingArray <T> {

	private final T[] array;        // ���ο� �����͸� ������ �迭
	public final int length;       // �迭�� ����
	public int leftIndex; // ����Ʈ �� ũ�⸦ �����ϴ� ����

	public ShiftingArray(int length)
	{
		this.length = length;
		this.array = (T[])(new Object[length]);
		this.leftIndex = 0;
	}

	/**
	 * ���� �迭���� 'index'��°�� �����ϴ� ���Ҹ� ��ȯ�ϴ� �Լ�
	 *
	 * @param index
	 * @return
	 */
	public T get(int index)
	{
//		leftIndex�� �������� ������ index�̴�
		int realindex = (leftIndex + index) % length;
		return array[realindex];
		
	}

	/**
	 * ���� �迭���� 'index'��°�� �����ϴ� ���Ҹ� 'value'�� �����ϴ� �Լ�
	 *
	 * @param index
	 * @param value
	 */
	public void set(int index, T value)
	{
		int realindex = (leftIndex + index) % length;
		array[realindex] = value;
	}

	/**
	 * ���� �迭�� ��� ���Ҹ� �������� 'times'�� �̵��ϴ� �Լ�
	 * @param times
	 */
	public void shiftLeft(int times){
		times = times % length; // �ǹ̴� �迭�� ���������γ����ϸ� ��ȯ������ �����. times�� length���̺��� Ŀ���� �����Ƿ� length�ȿ� times�� �־��Ѵ�.
		leftIndex = (leftIndex + times) % length; // �̵��� ���� �迭�ȿ� �ֱ� ���� % length
	}

	/**
	 * ���� �迭�� ��� ���Ҹ� ���������� 'times'�� �̵��ϴ� �Լ�
	 *
	 * @param times
	 */
	public void shiftRight(int times){
		times = times % length; // times�� 1000 �̾ length�� ��ȯ�ֱ⸦ �Ÿ��⶧���� length�̳� ���̴�.
		leftIndex = (leftIndex - times + length) % length; // ���������� ����Ʈ ������ �Ѱ��� �������� �����͸� �ű�Ͱ� ����.
		//times��ŭ �������� �ű�� ������ �߻��Ҽ� �ִ� + length
	}

	/**
	 * ���� �迭�� ��� ���Ҹ� ���� �ʱ� ��ġ�� �ǵ����� �Լ�
	 */
	public void initializePosition()
	{
		leftIndex = 0;
	}

}