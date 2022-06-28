package solved;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

// 2008 12 27
// 2009 1 22

// ���� ����
// ���� ���
// �ſ����� �ϼ��� �ٸ��� Month �迭
// �׸��� ������ ������ �޾� 4�⸶�� 366���� �´�
// �׸��� 2�� ���� 3�� ���� ������ ����

public class solvedac1 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str1[] = br.readLine().split(" ");
		String str2[] = br.readLine().split(" ");
		int y = Integer.parseInt(str1[0]);
		int m = Integer.parseInt(str1[1]);
		int d = Integer.parseInt(str1[2]);
		
		int y1 = Integer.parseInt(str2[0]);
		int m1 = Integer.parseInt(str2[1]);
		int d1 = Integer.parseInt(str2[2]);
		
		int Day = 0;
		
		int Month[] = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		
		// õ�� �ʰ���
		if((y+1000 < y1) || (y+1000 == y1 && m < m1) || (y+1000 == y1 && m == m1 && d <= d1 )) {
			System.out.println("gg");
		}
		else { // õ�� �ʰ��ð� �ƴ� ��� ���
			for(int year = y+1; year < y1; year++) {
				// ���� üũ
				if((year%4 == 0 && year%100 != 0) || year%400 == 0) {
					Day += 366;
				}else {
					Day += 365;
				}
			}
			
			// �⵵�� ���� ���
			if(y == y1) {
				// �� ��
				if(m == m1) {
					Day = Day + (d1-d);
				}else {
					for(int month = d+1; month<d1; month+=1) {
						Day  = Day + Month[month];
					}
					// ����ؾ��� �κ�
					if(((y%4 == 0 && y%100 != 0) || y%400 == 0 ) && m <=2 && m1 <= 3) {
						Day++;
					}
					// ���ۿ�
						Day = Day + Month[m-1] - d;
					// �����
					    Day = Day + d1;
				}
			}else { // ���� ��,���� �ٸ� ��
				
				for(int month = 0; month < m1-1; month+=1) {
					Day = Day+Month[month];
				}
				
				for(int month = m; month < 12; month++) {
					Day = Day + Month[month];
				}
				
				
				// ���۳⵵�� �����̰� ���ۿ��� 2�� �����ΰ��
				if(((y%4 == 0 && y%100 != 0) || y%400 == 0) && m <= 2) {
					Day+=1;
				}
				
				// �� �⵵�� �����̰� ������� 3���� ���
				if(((y1%4 == 0 && y1%100 != 0) || y1%400 == 0) && m1 >= 3) {
					Day++;
				}
				
				// ���ۿ�
				Day = Day + Month[m-1] - d;
				
				// �����
				Day = Day +d1;
			}
			System.out.println("D-"+Day);
		}
	}
}
