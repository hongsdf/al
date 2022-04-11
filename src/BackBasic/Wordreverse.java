package BackBasic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

// �ܾ� ������ 
// baekjoon online judge -> noojkeab enilno egduj
// <open>tag<close> - > <open>gat<close>
// ���� <>�� �ڸ���


public class Wordreverse {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// <>�ȿ� �ִ� �迭�� ������ �޾Ƽ� < �����ϸ� �ѱ��
		// <>�������� ������ ������
		
		String s = br.readLine();
		Stack<Character> st = new Stack<>();
		StringBuilder sb = new StringBuilder();
		boolean flag = false; //�±װ� ���۵Ǹ� true
		for(char c : s.toCharArray()) {
			if(c == '<') { // '<'�϶� st�� ������ �۾��� �Ѵ�
				print(sb,st);
				flag = true; //�±� ������ �˸���.
				sb.append(c);
				
				// �������
				// if�������� �����̿��� ������ ������ ���� ��µ�����
				// else if�������� ���� esle if���� ������ *�ؿ� else if���� ���ǿ� �´��� skip*
				
				
			/* else if�� ������ �߿��ϴ� (���� 1�� ���� 2�� ��ġ�� �ٸ��� ��ġ�ϸ� �ȵȴ�.) */
				// ���� 1
			}else if(c == '>') { //  �±� ���۰� �±� ����κ��� ������ ��ġ
				flag = false; // �±� ����
				sb.append(c);
				// ���� 2
			}else if(flag) {
				sb.append(c); // flag�� false�� �ɶ�����
				
			/*else if�� ������ �߿��ϴ� */
			}else {
				if(c == ' ') { // ������ ������ ���ڿ��� �����´�.
					print(sb,st); // ������ �̿��Ͽ� ������
					sb.append(c); // ������ ����(' ')�� �Է¹ޱ�
				}else {
					st.push(c); //st�� Ǫ��
				}
				
			}
		
		
		}
		print(sb,st); // ������ �±׾ȿ� �ִ� �͵��� ������ ��������
		System.out.println(sb.toString());
	}

	private static void print(StringBuilder sb, Stack<Character> st) {
		while(!st.isEmpty()) {
			char c = st.pop();
			sb.append(c);
		}
		
	}
}
