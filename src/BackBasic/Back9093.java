package BackBasic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

/*������ �־����� ��, �ܾ ��� ����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. ��, �ܾ��� ������ �ٲ� �� ����. 
  �ܾ�� ���� ���ĺ����θ� �̷���� �ִ�.*/ 
// stack�� ������ �۾� �ϱ⿡ ����  *�߰��� �մ� ���Ұ� �����Ǿ��ϸ� stack�� ���� ���� �ƴϴ�.
// ���� ���� ���� ���پȿ� ����(���๮�ڰ� ���ԵǾ�������� ) ���๮�ڵ� �ѱ��ڷ� ����ؾ��Ѵ�.

public class Back9093 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		while(T --> 0) {
			String s = br.readLine()+"\n"; // �ñ���?
			Stack<Character> st = new Stack<>();
			for(char c : s.toCharArray()) { 
				if(c == '\n' || c == ' ') { // ���๮�ڶ�� �׶� ������ ����
					while(!st.isEmpty()) {
						bw.write(st.pop());
					}
					bw.write(c); // ���๮�� ���
				}else {
					st.push(c);
				}
			}
			
		}
		bw.flush();
	}
}
