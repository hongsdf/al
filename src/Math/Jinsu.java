package Math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 2���� -> 8���� 
 
 	�˰��ִ� ���� 
 	������ 8������ ��ȯ�ϱ� ���� 3���� ���´�
 	
 	16������� 
 	4���� ���´�.
 
 
  
  */
public class Jinsu {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
		String str = br.readLine(); // 1 100 010 011
		int n = str.length();
		// ������ ���� �Ϳ� ���� ó��
		if(n %3 == 1) {
			System.out.print(str.charAt(0)); // ��? 3���� ���� ������ ���ڷ� ��ȯ�Ǿ��� ���̴�.
			// �������� 1�� ���� ������ ���� ���̹Ƿ� ó��
		}else if(n%3 == 2) {
			// ������ 2�� ����
			// str.charAt(0), str.charAt(1) �� ó�� 2��
			System.out.print((str.charAt(0) - '0') * 2 + (str.charAt(1) -'0'));
		}
		// ���� �Ϳ� ���ؼ� ó��
		for(int i=n%3; i<n; i+=3) { 
			/* i = n%3 �� �ֱ� ���ؼ� ó���� ������ ��ġ��  ������ġ ���� �����Ѵٴ� �ǹ� */
			/* �׸��� �������� 3�� ����*/
			
			// str.charAt(0), str.charAt(1),str.charAt(2) ó�� 3��
			System.out.print((str.charAt(i) -'0') * 4 + (str.charAt(i+1) - '0') *2  + (str.charAt(i+2) - '0'));
		}
		
	 }
}
