package algorithm;

public class No31 {
	
	/*�ֿ� ����
	 * n-1 + n-2 : �Ǻ���ġ ������ ���� �߿�
	 * 1,2���� �������� �������� n-1 + n-2 : �Ǻ���ġ ������ ���� 
	 * 
	 * 
	 * */
	static int finbonaci(int n) {
		// 1����
		if(n == 1) {
			return 1;
		}
		// 2����
		if(n == 2) {
			return 1;
		}
		// �׿���
		// 4  :       2      +      1  : 3
		return finbonaci(n-1) + finbonaci(n-2);
		
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		int n = 4;
		int answer;
		// 1-1-2-3-5-8
		answer = finbonaci(n);
		
		System.out.println(answer);
	}
}
