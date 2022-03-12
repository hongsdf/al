package algorithm;

public class No27 {
	public static void main(String[] args) {
		int n = 5;
		/* ������ ���� need */
//		 1    2   3   4   5
//		 16  17  18  19   6
//		 15  24  25  20   7
//		 14  23  22  21   8
//		 13  12  11  10   9

		int arr[][] = new int[10][10];
		int x = 0; 
		int y = 0;
		int num = 1;
		int f = n; // �ݺ�Ƚ��
		// ������ ��Ģ
		// ���� ���� : R-> D -> L -> U
		// n : n*2-1
		// 2 : 3
		// 3 : 5
		// 4 : 7
		// 5 : 9

		/* ���� ���� */

		for (int i = 0; i < 2 * n - 1; i++) { // 2 * n - 1 : ȸ�� ��
			switch (i % 4) { // ������ 4��, 4���� (�ٸ����� 5�����̸� i%5 ...)
			case 0: // ������
				for (int k = 0; k < f; k++) {
					arr[y][x] = num; // 0,1 => 0,2 => 0,3 => 0,4
					x++; // 0,5
					num++; // 6
				}
				x--; // 4
				y++; // 1

				f--;
				break;

			case 1: // �Ʒ���
				for (int k = 0; k < f; k++) {
					arr[y][x] = num; // y : 1, 4
					y++; // 2,4=> 3,4 =>4,4;
					num++; // 10

				}
				y--; // 4
				x--; // 3

				break;

			case 2: // ����
				for (int k = 0; k < f; k++) {
					arr[y][x] = num; // y : 1, 4
					x--; // -1
					num++; // 14

				}
				x++; // 0
				y--; // 3
				
				f--;
				break;

			case 3: // ����
				for (int k = 0; k < f; k++) {
					arr[y][x] = num; // 14
					y--; // 0
					num++;

				}
				x++; // 1
				y++; // 1

				
				break;

			}
		}
		// ���� ���Ҵ� arr[][]�迭�ȿ� ������� �ִ� ����
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.printf("%3d",arr[i][j]);
			}
			System.out.println();

		}
	}
}
