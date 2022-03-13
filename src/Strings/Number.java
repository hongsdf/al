package Strings;

import java.util.Scanner;

public class Number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String ans = solution(s);
		System.out.println(ans);
		
	}

	private static String solution(String s) {
		String answer = "";
		String word[] = {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
		
		for(int i = 0; i < s.length() ;  ) {
			if(s.charAt(i)-'0' >= 0 && s.charAt(i)-'0' <=9) {
				answer += s.charAt(i);
				i++;
			}else {
				for(int j = 0 ; j <word.length; j++) {
					if(s.startsWith(word[j],i)) { // i���ͺ��� ex) 1Two3���� i���ĺ��� �������� �ִ���
						i += word[j].length();
						answer += j;
						break;
					}
					// 1Two3
				}
			}
		}
		
		
		
		return answer;
		
	}
}
