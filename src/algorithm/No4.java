package algorithm;

public class No4 {
// 2���� ->2������
	public static void main(String[] args) {
		int in = 25;
//		25/2 == 12 ...1
//		12/2 == 6 ...0
//		6/2 == 3...0
//		3/2 == 1 ...1
//		1/2 == 0 ...1 == 11001 == 16+8+1
		
		int arr[] = new int[5];
		int i =0;
		
		int mok = in;
		
		while(mok !=0 ) {
			arr[i] = mok%2;
			mok = mok/2;
//			System.out.println(i +"���"+arr[i]);
			i++; 
		}
		
		i--; // �ϴ����� :  mok == 0 �� �ǰ� �������� �ѹ��� ������ �ȴ� �׷��� �ٽ� 1���ҽ��� �����Ѵ�
//		6 == 110
//		6/2 == 3 ...0
//		3/2 == 1...1
//		1/2 == 0...1		
		
		// �ݴ�� ���
		for(; i>=0; i--) {
			System.out.print(arr[i]);
		}
		
		
		
	}
}
