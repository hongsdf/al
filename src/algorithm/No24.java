package algorithm;

import java.util.*;

public class No24 {
	public static void main(String[] args) {
		int student = 7; //�л���
		int st1 = 7 ; // �л�����
		int st2 = 100 ; // �л�����
		int st3 = 95 ; // �л�����
		int st4 = 80 ; // �л�����
		int st5 = 60 ; // �л�����
		int st6 = 70 ; // �л�����
		int st7 = 70 ; // �л�����
		
//		int avg = st1+st2+st3+st4+st5+st6+st7;
//		int m = avg/student;
//		System.out.print(m);
		
		Map<Integer,Integer> number = new HashMap<>();
		number.put(1, 7);
		number.put(2, 100);
		number.put(3, 95);
		number.put(4, 90);
		number.put(5, 80);
		number.put(6, 70);
		number.put(7, 60);
		number.put(8, 50);
		
		Set<Integer> set = number.keySet();
		System.out.println(set);
		
		// iterator�� �ѹ� ����ϰ� ���� �ٽ� ���� ������� ����Ҽ� ����
		Iterator<Integer> iter = set.iterator(); 
		Iterator<Integer> iter2 = set.iterator(); // �׷��� �ٽ� ����
		
		int total = 0;
		int cnt = 0;
		while(iter.hasNext()) {
//			int avg = 68;
			int v = iter.next();
			int num= number.get(v);
//			System.out.println(v+"�л��� ������ : " + num);
			
			
			total += num;
			
		}
		double avg = total/8;
		
		while(iter2.hasNext()) { //iter�� �״�� ����ϸ� ���� ����Ͽ��� ������ �ȵȴ� --> iter2�̿�
//			int avg = 68;
			int v = iter2.next();
			int num2= number.get(v);
		
			if(num2 > avg) {
				System.out.println(v+"�й� �л��� ����"+num2+"�� ����̻��Դϴ�");
				cnt++;
			}
			else {
				System.out.println(v+"�л��� ������ ������� ");
			}
		}
		
		
		
		System.out.println(total);
		
//		int avg = total/7;
		System.out.println("����� : "+ avg);
		System.out.println("����� �Ѵ� �л��� : " + cnt);
		System.out.println("����� �Ѵ� ��ü�л��� �� ���� : " + (double)cnt / 8 *100+"%" );
		
//		if()
//		
		
//		while(student > 0) {
//			 
//			int v = st1[i];
//			
//			
//			
//			student--;
//		}
//		
//		
//		
//		
//		
//		
//		int cnt = 0;
//		
//		if(n > m) {
//			System.out.println("����� �Ѵ� �л�");
//			cnt++;
//		}
			
			
			
		// 7 100 95 80 60 70 70
		// 70.14 ���
		// 7 �� 5 �� ����� �����Ƿ� 71.41
		
	}
}
