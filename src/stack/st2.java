package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class st2 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		while(n -->0) {
			LinkedList<Character> q = new LinkedList<>();
			char ch[] = br.readLine().toCharArray();
			for(int i =0; i<ch.length; i++) {
//				System.out.print(ch[i]+" ");
				if(q.isEmpty()) {
					
					q.push(ch[i]);
				}else {
					if(ch[i] != q.peek() && ch[i] == ')') { // ch[i] == '(' �� �ɼ�����.
						// �ϴ� ó�� ���� ) �� ������ �ٷ� ����
						// �׷��� ó�� ���Ҵ� ( ���;��Ѵ�.
						// ���� ���ҷ� ( �� �ݴ���   ) ������pop() : �ȿ� ���� ���� �ȵǸ� no
						q.pop();
					}else {
						q.push(ch[i]);
					}
				}
			}
			if(!q.isEmpty()) {
				System.out.println("NO");
			}else {
//				if(ch[0] == ')') System.out.println("NO");
				System.out.println("yes");
			}
		}
	}
}
