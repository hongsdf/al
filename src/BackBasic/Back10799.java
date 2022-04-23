package BackBasic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/*�������� ���� ��ȣ�� �ݴ� ��ȣ�� ������ �� ��( ) �� ���� ǥ���ȴ�. ����, ��� ��( ) ���� �ݵ�� �������� ǥ���Ѵ�.
	�踷����� ���� ���� ���� ��ȣ �� ( �� ��, ������ ���� ���� ��ȣ ��) �� �� ǥ���ȴ�. */
public class Back10799 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String pipe = br.readLine();
		solve(pipe);
	}
	//()(((()())(())()))(())
	// ������ȣ�� st�� push
	// ���� ��ȣ�� ������ üũ
	// 1. �̿��� ������ȣ�� ��ȣ���� -1
	// 2. 1���̰� �ƴϸ� �������� ���̴� �ǹ�
	private static void solve(String pipe) {
		char c[] = pipe.toCharArray();
		Stack<Integer> st = new Stack<>();
		int sum = 0;
		for(int i = 0; i <c.length; i++) {
			char word = c[i];
			if(word == '(') {
				st.push(i);
			}else {
				int num = st.peek();
				if(i - num == 1) { // ��������� �ǹ�
					st.pop();
					sum += st.size();
				}else {
					st.pop();
					sum++;
				}
			}
		}
		System.out.println(sum);
		
	}
}
