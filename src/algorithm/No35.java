package algorithm;

import java.util.Scanner;

public class No35 {
	
	static void kitchen(int x,int nk, int y,int cnt) {
		
		// n : ����
		// nk: ġŲ ����
		// y : ġŲ �Ѹ����� ������
		// mk : �ٽ� ����Ͽ� ġŲ��
		if(x > 0) {
			x--; //���� ���
			nk++; // ���� ����
			cnt++;
			kitchen(x,nk,y,cnt); // 0,10, 3,10
			return;
		}
		
		else if (nk > 0)
			if(nk/y > 0) {
				nk -= y; // nk :10 - y: 3 = 7 4 1
				x++; // �ٽ� ���� ���� 
				kitchen(x,nk,y,cnt); // 0,10,3,10 -> 1,7,3,10 -> 0,7,3,11-> 1,4,3,11->
				// 0,4,3,12-> 1,1,3,13-> 0,1,3,14
				
				// 100 + 100/25 < 25
				// 10 + 10/3 > 3
			
		}
			if(x == 0 && nk/y == 0 ) {
				System.out.println(cnt);
			
		}
			
			
			
			
		
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		kitchen(n,0,m,0);
		
	}
}
