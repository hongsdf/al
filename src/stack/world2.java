package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class world2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s;
		while(true) {		
			s = br.readLine();
//			s = s.replaceAll("[a-zA-Z ]", ""); // ���ڸ� ��ü���� ����
			
			if(s.equals(".")) {	// ���� ���ǹ� 
				break; //. �� �Է��ϸ� ����
			}		
			System.out.println(solution(s));
		}
		
		
//		String s = br.readLine(); 
//		String rs = solution(s);
//		System.out.println(rs);
		
	}

	private static String solution(String s) {
		Stack<Character> st = new Stack<>();
		for(int i =0; i <s.length(); i++) {
			char c1 = s.charAt(i);
			
			if(c1 == '(' || c1 == '[') { // ������ȣ�� push
				st.push(c1);
			}
			else if(c1 == ')') { // ���� ��ȣ�� ����
				if(st.isEmpty() || st.peek() != '(') {
					return "no";
				}else {
					st.pop();
				}
			}
			else if(c1 == ']') { // ���� ��ȣ�� ����
				if(st.isEmpty()  || st.peek() != '[') { // st.isEmpty() :�� �ִ� ����
					// []]] �Է��ߴٰ� ��������
					// 1�ܰ� [] �� �����Ǿ���
					// ] �� ���ö� c1 == ']'�� ������ �Ǿ���. �׷��� st.peek()���� ������ �߻��Ѵ� �ֳ��ϸ� st�� ����־� 
					// peek �� �����⶧���̴�
					// �׷��� st.isEmpty() ������ �߰��ؾ��Ѵ�.
					return "no";
				}else {
					st.pop();
				}
			}
			
		}
		
		if(st.isEmpty()) {
			return "yes";
		}else {
			return "no";

		}
		
		
	}
}
