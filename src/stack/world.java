package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.Format;
import java.util.LinkedList;
import java.util.Stack;

public class world {
	public static void main(String[] args) throws IOException {
		// So when I die (the [first] I will see in (heaven) is a score list).
//		[ first in ] ( first out ).
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
//		String str = "a_bcd";
		System.out.println(str);
//		String regex = Format.
		str = str.replaceAll("[a-zA-Z .]", "");
		System.out.println(str);
		char[] c1 = str.toCharArray();
//		Stack<Character> st = new Stack<>();
		LinkedList<Character> st = new LinkedList<>();
		
		for(int i=0; i<c1.length; i++) {
			char c2 = c1[i];

			if(c2 == '(' || c2 =='[') {  // ��ȣ ���� �ٽ��� �ٷﺸ��
			    // 1.���� ���ÿ� �����Ҷ� ), ]	���� ��ȣ�� ���� �ٷ� Ż���̴�
				// 2. �׷��� ( , [ ó�� ���� �� �ִ� ��ȣ�� ���� ��ȣ
				// 3. (������ȣ�� ��� push�Ѵ�) ����
				// 4.  ���� ��ȣ�� ������ �������Ѵ�.
				// 4-1 ��ȣ�� ������ ���� ���ǹ��� ����
				// �ش��ȣ�� ������ ���� ��ȣ�� �ƴϸ� ���� || �׸��� st�� ��������� �ȵȴ� (1�� �����ش�)
				// �ش��ȣ�� ������ ���� ��ȣ�̸� pop
			
				st.push(c2);
			}
			else if(c2 == ')') {
				
				if(st.isEmpty() || st.peek() != '(') {
					System.out.println("no");
					break;
				}else { // st.peek == '('
					st.pop();
				}
			}else if(c2 == ']') {
				
				if(st.isEmpty() || st.peek() != '[') {
					System.out.println("no");
					break;
				}else  {
					
					st.pop();
				}
			}
		}
		
		if(st.isEmpty()) {
			System.out.println("yes");
		}
		
		
		
		
//		if(st.isEmpty() || st.pop() == '.') {
//			System.out.println("yes");
//		}else {
//			System.out.println("no");
//		}
		
//		for(int i =0; i<c1.length; i++) {
//			if(st.isEmpty()) {
//				st.push(c1[i]);
//				
//			}else {
//				if(st.peek() == '[' && c1[i] ==']') {
//					st.pop();
//				}
//				if(st.peek() == '(' && c1[i] ==')') {
//					st.pop();
//				}
//			}
//			
//			
//			
//		}
//		while(!st.isEmpty()) {
//			char curr = st.pop();
//			System.out.print(curr+" ");
//		}
		
//		
//		for(int i =0; i<c1.length; i++) {
//			if(st.isEmpty()) {
//				st.push(c1[i]);
//			}else {
//				if(st.peek() == '[' && c1[i] == ']') {
//					st.pop();
//				}
////				if(st.peek() =='(' && c1[i] == ')') {
////					st.pop();
////				}
//			}
//		}
//		
//		while(!st.isEmpty()) {
//			int curr = st.pop();
//			System.out.println(+curr+" ");
//		}
	}
}
