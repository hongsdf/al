package Monster;


import java.io.*;
import java.lang.*;
import java.math.BigInteger;
import java.util.*;

// 1000 1000 10000
public class OOP2 {
	public static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		int nNumbers = scanner.nextInt();   // �迭�� ������ ��
		int nCommands = scanner.nextInt();  // ó���� ��ɾ��� ��

		// Shift ������ ������ �迭�� �����ϰ� ���Ҹ� ���ʷ� �Է��Ѵ�
		ShiftingArray1<Integer> array = new ShiftingArray1<>(nNumbers);
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


// ��ü ���� �����
// ���ο� Ŭ������ Ÿ���� �����Ҷ��� ���׸��� �̿��Ѵ�
class ShiftingArray1 <T> {
	final int length; // ���̴� ������ �ʴ´�.
	//�迭�� ����
	private final T arr[]; // ������ �ʰ� �ܺο��� ���� �Ҽ� ����.
	int leftIndex = 0; // �����迭�� �ű��� �ʰ� �����ͷ� �����ϱ� ���� ���
	
	//������
	ShiftingArray1(int length){
		this.length = length;
		this.arr = (T[])(new Object[length]);
		this.leftIndex = 0;
	}




	public T get(int index) {
		// realIndex := �迭�� ����Ʈ������ �����ϸ� ����� leftIndex �������� ���� ��ȯ�ϴ� ���̴�. ������ ���� �������ǰ����� �ش� index����
		// ��ȯ�ϱ� ���ؼ��� leftIndex�κ��� + index������ ���ϰ��̴�. ���ϸ� ������ �ʰ� �� �� �־� ������ �������
		int realIndex = (index + leftIndex) % length; 
		return arr[realIndex];
	}
	// private �迭�� ���� �ϱ� ���� public set�޼���
	public void set(int index, T value) {
		int real = ( index + leftIndex ) % length;
		arr[real] = value;
		
	}
	
	public void shiftLeft(int times) {
		// ������ ���� := times�� �������� ũ�ٸ� �����ȿ� �־���Ѵ� �׷��� ���� ������ ������ �����Ѵ�.
		times = times % length;// times == 50�̶�� 50%3 == 2
		// ���� ����Ʈ ���������� �����ʹ� ���������� �̵��Ѵ�.
		leftIndex = (leftIndex + times) % length; // �������� ū ���� �����ϱ� ���� ������ ����
	}
	
	public void shiftRight(int times) {
		times = times % length;
		// �����ʽ���Ʈ ������ ������ �����͸� �������� �̵��ϴ� ��
		leftIndex = (leftIndex - times +length) % length; //  + length�� ���ϴ� ���� times�� ������ ����ȭ�� �Ǵ� ���� ���� ���ؼ���
		
	}
	
    // �ʱ�ȭ �ż���
	public void initializePosition() {
		leftIndex = 0; // ó�� 0���� �����͸� ����Ű�� ���������Ƿ� ���� �����Ͱ� ��� �ְ� 0���� ���ƿ��� �ʱ�ȭ�� �� ���̴�.
		
	}
}