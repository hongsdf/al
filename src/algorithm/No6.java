package algorithm;

public class No6 {
// �ִ� ����� ���ϱ�
	/* �ٽ� ���� ����
	 * �μ� �� ū�� �� �������� ����
	 * (����� ��)
	 * num1 > num2
	 * num1 == num2
	 * num1 �� num2 �� ���� �� ��� (4 , 8)
	 * 
	 */
	public static void main(String[] args) {
		
		int num1 = 5;
		int num2 = 3;
		
//		�ִ� ����� : 2
		
//		2,4 
		int big;
		int small;
		
		int gcd =1; //�ִ� ����� �⺻ �ʱⰪ
		
		if(num1 >num2) {
			big = num1;
			small = num2;
		}else {
			big = num2;
			small = num1;
		}
		
		
//		1.num1 > num2 ���
//		6 10 == 7
		
		
//		2.num1 == num2
		
//		3.num1�� num2�� ���Եɰ��
//		4 8  ==4
		
		for(int i = 1; i <=small ;i++) {
			if(big % i ==0 && small % i ==0) {
				// �ִ� ����� ����
				gcd = i;
			}
		}
		System.out.println(gcd);
	}
}
