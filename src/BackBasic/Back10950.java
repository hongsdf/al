package BackBasic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*�� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.*/
// �׽�Ʈ ���̽��� �־�����
public class Back10950 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		// �׽�Ʈ ���̽��� �ִ� ��� : �Է��� �� ��Ƽ� ����ϴ� ���̾ƴ�
		// �׽�Ʈ ���̽� ���پ� �Է��� �ް� ���(�ٷιٷ�)
		while(T --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			System.out.println(a + b); 
//			BufferedWriter
			
		}
	}
}
