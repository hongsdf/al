package BackBasic;

import java.util.Scanner;

// �� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
// �׽�Ʈ ���̽� ���� ����. (���� �˼� ����)

public class Back10951 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num < 5) {
			System.out.println("5���� �۴�");
		}else if(num >= 5) {
			System.out.println("5���� ���ų� ũ��");
		}else if(num >= 5) {
			System.out.println("10���� ũ�ų� ����");
		}else {
			System.out.println("�ش� ����");
		}
		
		/* if���� ������ �ΰ� ������ Ȯ��*/ 
		/* else if���� ������ �ƴϿ��� ���� else if���� ������ �ؿ� else if���� �´��� ���� ���� ����*/
//		if(num < 5) {
//			System.out.println("5���� �۴�");
//		} 
//		if(num <= 15) {
//			System.out.println("10���� ũ�ų� ����");
//		}else if(num == 15){
//			System.out.println(15);
//		}
		
	}
}
