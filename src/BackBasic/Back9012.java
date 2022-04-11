package BackBasic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
/* ��ȣ ���ڿ�(Parenthesis String, PS)�� �� ���� ��ȣ ��ȣ�� ��(�� �� ��)�� ������ �����Ǿ� �ִ� ���ڿ��̴�.
 *  �� �߿��� ��ȣ�� ����� �ٸ��� ������ ���ڿ��� �ùٸ� ��ȣ ���ڿ�(Valid PS, VPS)�̶�� �θ���.
 *   �� ���� ��ȣ ��ȣ�� �� ��( )�� ���ڿ��� �⺻ VPS �̶�� �θ���.
 *    ���� x �� VPS ��� �̰��� �ϳ��� ��ȣ�� ���� ���ο� ���ڿ� ��(x)���� VPS �� �ȴ�.
 *     �׸��� �� VPS x �� y�� ����(concatenation)��Ų ���ο� ���ڿ� xy�� VPS �� �ȴ�.
 *      ���� ��� ��(())()���� ��((()))�� �� VPS ������ ��(()(��, ��(())()))�� , �׸��� ��(()�� �� ��� VPS �� �ƴ� ���ڿ��̴�. 

�������� �Է����� �־��� ��ȣ ���ڿ��� VPS ���� �ƴ����� �Ǵ��ؼ� �� ����� YES �� NO �� ��Ÿ����� �Ѵ�. */


// ���� ��ȣ ���������� �Ϲ������� *���� ��ȣ�� üũ�Ѵ�
// st�� ���� ��ȣ�� ���� �ʰ� ������ȣ�� �ְ�
// ���� ��ȣ�� ������ ����� ������ȣ�� (¦�� �ξ������ʴ� ������ȣ)�� ���� pop()�� �ȴ�.



public class Back9012 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		while(T --> 0) {
			String s = br.readLine();
			// ������ȣ�� �߿��ϴ�
			int cnt = 0;
			for(char c : s.toCharArray()) {
				if(c =='(') {
					cnt++;
				}else {
					cnt--;
				}
				
				if(cnt < 0) { // 0 �� �Ǵ� ���� ���� ��ȣ�� ���� �� ���ٴ� �� ( ������ȣ�� ������ȣ�� ã���� �տ� �մ� ���� ��ȣ�� ã�� �ȴ�)
					break;
				}
			}
			if( cnt == 0) {
				bw.write("Yes\n");
			}else {
				bw.write("No\n");
			}
			
		}
		bw.flush();
		
	}
}
