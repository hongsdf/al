package algorithm;

public class No8 {
	public static void main(String[] args) {
		int in = 3;
		
		int account = 1; // 1�� �����ؾ� ���� �� ����
//		3! = 3 * 2 * 1
		// ���1
		for(int i = in; i >=1; i--) {
			// ������� account ����
			account = account * i; // 3 * 1 , 2 * 1, 1 * 1
		}
		System.out.println("���1"+account);
	
		account = 1;
		// ���2
		for(int i =1; i <= in ; i++) {
			account = account * i;
		}
		System.out.println("���2"+account);
	}
}
