package solved;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* �ٽɳ���
 * 1. ����Ʈ �̵� ��� : ���������� ��� ����� �־����� �ʾ����� 8������� �����δ�.
 * 2. �������� ������ ���� ������ ���� str[36] = str[0] �������������� ���ƿ;� ����
 * 3. �湮�ߴ� ���� �� �湮�ϸ� false || ������ �������� ���ƿ��� �ʰ� || ����Ʈ �̵���θ� ��� ���
 * 
 * */
public class solvedac1331 {
	// ����Ʈ �̵�
	static int dmoxve[] = {1,2,2,1,-1,-2,-2,-1}; 
	static int dmoyve[] = {2,1,-1,-2,-2,-1,1,2};
	static String str[];
	static boolean[][] board;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// ù ��ǥ
		str = new String[37];
		
		
		for(int i = 0; i <36; i++) {
			str[i] = br.readLine();
		}
		boolean check = true; // ���Ȯ��
		board = new boolean[6][6];
		// �������� ������ ����
		str[36] = str[0];
		int idx = 0;
		while(idx < 36) { // 36��°���� �ö����� ����
			String current = str[idx];
			String next = str[idx+1];
			
			char nowX = current.charAt(0);
			char nowY = current.charAt(1);
			board[nowY -'0'-1][nowX - 'A'] = true;
			
			char NEXTX = next.charAt(0);
			char NEXTY = next.charAt(1);
			
			int distX = Math.abs(NEXTX - nowX );
			int distY = Math.abs(NEXTY - nowY );
			boolean flag = false;
			for(int i = 0; i <8; i++) {
				if(dmoxve[i] == distX && dmoyve[i] == distY) {
					flag = true;
					break;
				}
			}
			// ����Ʈ �̵�������� ������� ���� ���
			if(!flag) {
				check = false;
				System.out.println("Invalid");
				return;
			}
			
			// ����Ʈ �̵���� Ž
			if(board[NEXTY -'0'-1][NEXTX - 'A']) { // ���� �湮�ߴ� �̷��� �ִ� ���
				if(idx != 35) { // ������ ��ȣ�� �ƴҰ�� = ������ ���ҷ� �ǵ��� �;� ���� 
					check = false;
					System.out.println("Invalid");
					return;
				}
			}

			idx+=1;
		}
		
		if(check) {
			System.out.println("Valid");
		}
		
		
	}
}	
