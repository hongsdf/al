package algorithm;

public class No28 {
	
	/* ��� �Լ� */
	// �ֿ��� : Ż������
	public static int fac(int n) {
		
		if(n > 0) {
			return n * fac(n-1); //5 * 4 * 3 * 2 * 1
			
		}
		else
			return 1;
		
	}
	
	
	
	public static void main(String[] args) {
		int n = 5;
		int answer;
		// 4 * 3 *2 *1 = 24
		
		 answer = fac(n);
		 System.out.println(answer);
	}
}
