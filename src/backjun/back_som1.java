package backjun;

import java.util.Scanner;

public class back_som1 {
	public static void main(String[] args) {
		// 1 666
		// 2 1666
		// 3 2666
		// 4 3666
		// 5 4666
		// 6 5666
		// 7 6660
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num = 666;
		int count = 1;
		while(count != n) {
			num++; // �ٽ� count�� if���� �ش����������� ���� ������ ����. num = 666 ���� ++ �Ǹ� 667�̵ȴ� --> ���� 666�� ���Ե� ���ڴ� 1666�̴� 666,667,668,669,670,671....1000 ...1660,..1665,1666
			String s = String.valueOf(num);
			
			if(s.contains("666")) {
				count++; // (666) ���� ���ԵǾ������� ���� ���� ã�ƶ�.
			}
		}
		System.out.println(num);
		sc.close();
	}
}
