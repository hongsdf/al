package leetcode;
import java.util.*;

public class Correctgwalho {
	public static void main(String[] args) {
		Solution1 m = new Solution1();
		String s = "))(("; // () ()()()
		// "() ))((()" "() (())()"
		String ans = m.solution(s);
		System.out.println(ans);
	}
}
class Solution1{
	int pos = 0;
	
	public String solution(String s) { // �Ű������δ� �������� ���ڿ�
		if(s.equals("")) return s;
		
		boolean flag = isCorrect(s); // �ùٸ� ���ڿ� ���� �Ǵ�
		String u = s.substring(0,pos);
		String v = s.substring(pos,s.length());
		
		// s�� �ùٸ� ���ڿ��̶��
		if(flag) {
			return u + solution(v);
		}
		
		//�ùٸ� ���ڿ��� �ƴ϶��
		String answer = "("+solution(v) + ")";
		// ó���� ������ ���ڿ��� ���� ������
		for(int i = 1; i< u.length()-1 ; i++) {
			if(u.charAt(i) == '(') {
				answer += ")";
			}else {
				answer +="(";
			}
		}
		
		return answer;
	}

	
	private boolean isCorrect(String s) {
		boolean correct = true;
		int left = 0; int right = 0 ;
		Stack<Character> st =new Stack<Character>();
		// u,v �и�
		for(int i = 0; i <s.length(); i++) {
			// ��ȣ ���� ���� , �ùٸ��ּҹ��ڿ�ã��
			if(s.charAt(i) == '(') {
				left++;
				st.push(s.charAt(i));
			}else {
				right++;
				if(st.isEmpty()) {
					correct = false;
//					return false; // false�� �����ص� �����ϸ� �ȵ�
					// �ᱹ ã�ƾ��ϴ� ���� �ùٸ� ���ڿ��� �� ã�ƾ��ϱ⶧��
				}else {
					if(st.peek() != s.charAt(i)) {
						st.pop();
					}
				}
			}
			
			if(left == right) {
				//�ùٸ� ���ڿ� �ּұ��� ã��
				pos = i + 1;
				return true ;
			}
		
		}
		
		return correct;
	}
}