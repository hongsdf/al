package backjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BackBuffer {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// buffer�� �ѱ��� �Է� �޴� ���
		// br.readLine()�� ���ڿ� ������ �Է� �޴´�
		// �ѱ� �� �� �Է� �ޱ� ���ؼ� br.readLine().replace(arg1 ,ag2 )
		// replace(arg1 ,ag2 )�� �ǹ� : arg1�� arg2�� ��� ��ü�Ѵ�
		// a b c�� �Է¹����� --> abc���� ��ü
		// br.readLine().replace(" ","").toCharArray() �޾� �ѱ��� �� ����� �����ϰ� �Ѵ�.
		char[] s1 = br.readLine().replace(" ", "").toCharArray();
		for(char c:s1) {
			System.out.print(c);		
		}
	}
}
