package Monster;

import java.util.Scanner;

public class Chapter_prime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		boolean flag = prime2(number);
		System.out.println(flag == true? "�Ҽ��Դϴ�": "�Ҽ��� �ƴϴ�" );
	}
	// O(sqrt(n))
	private static boolean prime(int number) {
		for(int i = 2; i<=(int)Math.sqrt(number); i++) {
			if(number % i == 0) { // ���������� �Ҽ��� �ƴϴ�
				return false;
			}
		}
		
		return true;
	}
	
	// ����ǥ������ ����ϴ� ���� ����
	// O(sqrt(n))
		private static boolean prime2(int number) {
			if(number <= 1) { //����ó�� 1���� ���� ���� �Ҽ��� x
				return false;
			}
			for(int i = 2; i * i <= number; i++) {
				if(number % i == 0) { // ���������� �Ҽ��� �ƴϴ�
					return false;
				}
			}
			
			return true;
		}
	
}
