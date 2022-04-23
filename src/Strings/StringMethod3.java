package Strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

/* ���̻� �迭 ���
 * baekjoon�� ���̻�� baekjoon, aekjoon, ekjoon, kjoon, joon, oon, on, n ���� �� 8������ �ְ�, �̸� ���������� �����ϸ�,
 *  aekjoon, baekjoon, ekjoon, joon, kjoon, n, on, oon�� �ȴ�.
 * */
public class StringMethod3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();

		String[] ans = new String[s.length()];
		/* ���̻� ����� ��� �߿� substring�� Ȱ�� */
		for(int i = 0; i <s.length(); i++) {
//			ans[i] = s.substring(i,s.length());
			ans[i] = s.substring(i); // i���� ������ ���� ���� ǥ��
		}
		Arrays.sort(ans, new Comparator<String>() {

			
			public int compare(String o1, String o2) {
				
				return o1.length() - o2.length();
			}
			
			
		});
		for(int i = 0; i <ans.length; i++) {
			System.out.println(ans[i]);
		}
	}
}
