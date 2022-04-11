package BackBasic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// Queue : ������ ������� ó���ؾ� �Ҷ� �ַ� ���ȴ�.
// �߰� �Ҷ��� end�̵� ����������
// ���� �Ҥ����� start�̵� ����������
// q�� ������ ���� �������� �̵��ϴ� �����̴�, �׷��Ƿ� ������ �ݴ�� �����ؾ� �Ѵ�.

// ���� ������� �غ��� �迭�� ũ�⸦ ���̰ų� ���� ���Ҹ� �������� �ʴ´�.
public class Back_queue {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		int q[] = new int[T];
		int start = 0;
		int end = 0;
		while(T -->0) {
			String Line[] = br.readLine().split(" ");
			String command = Line[0];
			if(command.equals("push")) { // end �����Ͱ� �����δ�.
				q[end++] = Integer.parseInt(Line[1] ); 
			}else if(command.equals("pop")) { // pop�� �Ҷ��� start������
				if(start == end) { // start�� end�� ������ ������ ����.
					bw.write("-1\n");
				}else {
					bw.write(q[start]+"\n");
					start++;
				}	
			}else if(command.equals("size")) {
				// ab : end�� �߰� �Ͽ��� 2, start�� 0��� �ϸ�
				// 2  - 0
				bw.write(end-start+"\n");
				
			}else if(command.equals("empty")) {
				if(start == end) {
					bw.write("1\n");
				}else {
					bw.write("0\n");
				}
				 
			}else if(command.equals("front")) {
				// ��¸� �ϰ� ���� ������ �ʴ´�.
				// �׸��� start�����ʹ� �������� �ʴ´�. ���� �����ϱ�
				 if(start == end) { //��� �մ� ���� ����
					 bw.write("-1\n");
				 }else { // ��¸� �ϸ�ȴ�. start�̵� x
					 bw.write(q[start]+"\n");
				 }
			}else if(command.equals("back")) {
				if(start == end) {
					bw.write("-1\n");
				}else { //��¸� �ϸ� ��
					bw.write(q[end-1]+"\n"); 
					// end < 0 ���� �۾����ٸ� start�� �ƿ� ���������� �ʾ����� ���� ���� ���� �ʾ��� ���̴�
					// ���� end > start���� ũ��
				}
			}
		}
		bw.flush();
	}
}
