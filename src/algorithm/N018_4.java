package algorithm;

public class N018_4 {

	public static void main(String[] args) {
		/*
		 * �ֿ� ��������
		 * 1. ��� *�� ���踦 �ľ��Ѵ�
		 * ex) 0�� : * 1, 3�� : *4..
		 * 2. �� ���� ����(5��)
		 * 
		 * 3. i(��)�� *�� �����̹Ƿ� i�� ������ 
		 */
		 
		
		int n =5;
		for(int i = n; i > 0; i--) { // 5 4 3 2 1
			for(int j = 0; j < n; j++) { // 5�� �� ����
				if(i > j+1) {
					// 0 : *
					System.out.print(" ");
				}else {
					System.out.print("*");
					
				}
			}
			System.out.println();
		}

	}

}
