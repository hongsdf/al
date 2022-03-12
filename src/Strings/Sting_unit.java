package Strings;

import java.util.Scanner;

public class Sting_unit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int ans = solution(s);
		System.out.println(ans);
		sc.close();
		
	}
	public static int solution(String s) { 
		int answer = s.length();
		
		for(int i =1; i <=s.length()/2; i++) { // ���ڿ� ���� ���� ũ�� 1 ~ ���ڿ�/2 ���� : ����?
			int idx = 0;
			int len = s.length();
			for( ; idx+i <= s.length(); ) { // ã�� ����ũ�⿡ �´� ������ ã�� ������ : [a]bbb, a[b]bb
				String unit = s.substring(idx,idx+i);
				idx += i; // unit�� �´� ���� �������� �ε����� �̵� : 0���� ������� 1�������� �ε��� �̵� 
				int cnt = 0;
				for( ;idx+i<=s.length()/*���� ������ ���� �������� */ ;) {
					if(unit.equals(s.substring(idx,idx+i))) {
						cnt++; // ������ �������� ���� ������ �¾ƾ� cnt++
						idx += i;
					}else break;
				}
				if(cnt > 0) { // ������ �´� �ϳ��ε� ����(cnt) �� �ִٸ�
					len -= i/*����ũ��*/ * cnt/*������ �´� ����*/; 
					if(cnt < 9) len += 1; //aaa aaa aaa a = > 10a - > i*cnt = 9
					else if(cnt < 99) len += 2;
					else if(cnt < 999) len += 3;
					else len+=4;
				}
				answer = Math.min(answer, len);
					
					
					
				
			}
			
		}
		
		
		return answer;
	}
}
