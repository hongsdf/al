package datastructure;

import java.util.Scanner;

public class Printf1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("================================");
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 3; i++) {
			String s1 = sc.next();
//			int x = sc.nextInt();
			Double d = sc.nextDouble();
			// Complete this line
			System.out.printf("%-15s %.5f %n",s1,d); // "%-15s : �������� 15��ŭ, %03d : ������ 3ĭ���� �ϰ�  
			System.out.println();
			// "%-15s : �������� 15��ŭ, %03d : ������ 3ĭ���� �ϰ� 3ĭ�� �̸��϶� �տ� 0���� ä�� 3�ڸ��� �����.
			// %n : �ٹٲ�
			// %b%n : boolean �ϰ� �ٹٲ�, %s :���ڿ� ���, %5d :���� 5�ڸ�, %.3f : �Ǽ� (�Ҽ��� 3�ڸ����� �ݿø�) 
		}
		System.out.println("================================");

	}

}
