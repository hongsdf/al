package backjun;

import java.util.Scanner;

public class IF_1 {

	public static void main(String[] args) {
		/*
		 * ù° �ٿ� �� ���� H�� M�� �־�����. (0 �� H �� 23, 0 �� M �� 59) �׸��� �̰��� ���� ����̰� ������ ���� �˶� �ð� H�� M���� �ǹ��Ѵ�.
�Է� �ð��� 24�ð� ǥ���� ����Ѵ�.
 24�ð� ǥ������ �Ϸ��� ������ 0:0(����)�̰�, ���� 23:59(������ ���� 1�� ��)�̴�. �ð��� ��Ÿ�� ��, ���ʿ��� 0�� ������� �ʴ´�.*/
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int M = sc.nextInt();
		
		
		if(H >= 0 && H <= 23 && M >= 0 && M <= 59) {
			clock(H,M);
		}


}

	 static void clock(int h, int m) {
//		 0h 0m = 0m
//		 0h 1m = 1m
//		 1h = 60m
//		 2h = 100m
//		   :
//		 11h = 660m
//		 12h = 720m
//		 13h = 780m
//		 14h = 840m
//		 	:
		 
//		 23h = 1380m
//		 23h 59m = 1,439
		 
//		 14h 30m => 870�� => 835 => 13�� 55
		 
		 // 0 30 => 23 45 =  a  =  1,425 + 45
		 // 0 20 => 23 35
		 
		 
		 if(h == 0 && m < 45) {
			 h = 24;
		 }
		 int time = h * 60 + m -45;
		 h = time/60;
		 m = time - (h *60); // 835 - (13 * 60)	 
		 System.out.print(h);
		 if(m < 10) {
			String min = "0" + m;
			if(!min.equals("00"))
			System.out.println(min);
		 }else {
			 System.out.print(m);
		 }
//		  13 53
//		   1380 -> 1308

		 
//		System.out.println(h+"��"+m+"���Դϴ�");
		
		
	}
}
