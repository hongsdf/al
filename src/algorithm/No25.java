package algorithm;

public class No25 {
	public static void main(String[] args) {
		
		// 26 => 2 + 6 = 8  -->  68
		// 68 => 6 + 8 = 14 -->  84
		// 84 => 4 + 8 = 12 -->  42
		// 42 => 4 + 2 = 6  -->  26
		
		int n = 79; // �ʱ�
		int res = n;
		int tmp = 0;
		int cnt = 0;
		
		do{ // �ѹ��� ������ ���� ������ Ȯ���Ͽ� true�̸� ���� �ƴϸ� ����
			tmp = res/10 + res%10;
		//         2     +   6
			res = res%10 * 10 + tmp %10; 
		//	       60   +    8
			cnt++;
			
			
		}while(n!=res); // ������ �������� ����
		
		System.out.println(cnt);
		
	}
}
