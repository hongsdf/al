package leetcode;

import java.util.HashMap;
import java.util.*;

public class gwalHo {
	public static void main(String[] args) {
		Solution30 m = new Solution30();
		String s = "))(("; // () ()()()
		// "() ))((()" "() (())()"
		String ans = m.solution(s);
		System.out.println(ans);
	}
}

class Solution30 {
	int pos = 0;

	public boolean correct(String s) {
		boolean flag = true;
		Stack<Character> st = new Stack<Character>();
		// left = ")" , right = "("
		int left = 0;
		int right = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(') {
				right++;
				st.push('(');
			} else {
				left++;
				// st�� ����� ���� �� ����
				if (st.isEmpty()) {
					flag = false;
				} else {
					// ¦�� ����
					st.pop();
				}
			}
			// *���� �߿��� �κ�*
			// �ּ� ���� ��ȯ (�̶� �������� ���ڿ��̴�)
			if (left == right) {
				pos = i + 1; // v ���� ��ġ
				return flag; // �ּ� ���� ã���� ����
			}

		}

		return true;
	}

	public String solution(String p) {
		if (p.isEmpty())
			return p;
		// flag�� false�� ���� �������� �ʴ´� ��? �Ű������� ó������ �������� ���ڿ��� �����Ƿ� �׻� �������� ���ڿ��� ã�� �� �ִ�.
		boolean flag = correct(p);// correct ���� u,v�� �и�
		// �������� �ּ� ����ã�� �������� u,v �и�
		String u = p.substring(0, pos);
		String v = p.substring(pos, p.length());
		if (flag) {
			return u + solution(v);
		}
		String answer = "("+solution(v) + ")";
//		answer += "(" + solution(v) + ")";
		// u�� ó�� ���ڿ� ���������ڸ� �����ϰ� ������ ��ȣ ���� ����
		for (int i = 1; i < u.length() - 1; i++) {
			if (u.charAt(i) == ')') {
				answer += "(";
			} else {
				answer += ")";
			}
		}

		return answer;
	}
}