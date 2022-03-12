package backjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back1065 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		// ù°�� + (n-1)d : ���� ����
		int ans  = d(n);
		System.out.println(ans);
	}
	
	
	static int d(int n) {
		int cnt = 0;
		
		if(n<100) { // 99 ������ ������ 99
			return n; //���� ���� return �Ѵ�.
		}
		
		else { // 100 �̻� �� ��
			cnt = 99; //�ּ� ���� 99
			
			if(n == 1000) {
				n = 999;
			}
			
			for(int i = 100; i<= n; i++) {
				int hundred = i/100; // 1
				int ten = (i/10)%10; // 4
				int one = i%10; //7
				
				if((hundred -ten) == (ten - one))
					cnt++; // -3 == -3 
			}
		
		}
		
		
		return cnt;

	}
		
		
		
	

}
