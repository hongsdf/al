package algorithm;

public class No14 {
	public static void main(String[] args) {
		int input = 333091029;
		
		// 0 : 3 => �ֺ��
		// 1 : 1
		// 2 : 1
		// 3 : 0
		// 4:  1
		// 5:  1
		// 6 : 0
		// 7 : 0
		// 8 : 0
		// 9 : 2
		
		int arr[] = new int[10];
		
		
		while(input > 0) {
			/* arr[input%10] : 10���� ���� ������ ���ڸ� ����Ƚ�� 1���� */
			arr[input%10]++;
			input /=10;
		}
		
		
		
		for(int i =0; i <=9; i++) {
			// arr[i] : ���� Ƚ�� 
			System.out.println(i+" : "+arr[i]);

		}
		int cnt = 0 ; // �ֺ�� ����Ƚ��
		int cn = 0; // �ֺ��
		
		// arr[] �迭�� ��������� ��� ��ȿ
		for(int i =0; i<10; i++) {
		if(cnt < arr[i]) { // 0 < 3
			cn = i;
			cnt = arr[i];
			}
		}
		System.out.println("�ֺ���� : "+cn+" �Դϴ�. ����Ƚ�� : "+cnt);
		
		
		
		
	}
}
