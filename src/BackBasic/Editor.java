package BackBasic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

// ������ ���� : Ŀ���� �������� ���ڸ� ����, ����, Ŀ�� �̵� 
// �̷��� ������ 2���� ������ �̿��Ͽ� Ǯ��
// left ����, right ����
// ����� ���� ������ ������ �������� ���� �Űܼ� �������.
// ���ڿ��� �ذ��ϸ� o(N) ���ڿ��� ���� ��ŭ
// stack  O(N)���� �ذ� ����


//�ٷ� �� ������ �����͸� �����Ϸ��� �Ѵ�.
// �� ������� ���� �ҹ��ڸ��� ����� �� �ִ� �������,
// �ִ� 600,000���� ==> �ð� ���⵵ �ִ� M(600,000)
// N�̰�, ���� �ҹ��ڷθ� �̷���� ������, ���̴� 100,000 N(100,000)
// �ð� ���⵵ O(N + M) == O(600000+100000)


public class Editor {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		Scanner sc = new Scanner(System.in);
		String s = br.readLine();
		int N = Integer.parseInt(br.readLine());
		Stack<Character> left = new Stack<>();
		Stack<Character> right = new Stack<>();
		// ���ʿ� �Ű� ���� ����
		for(char c : s.toCharArray()) {
			left.push(c);
		}
		
		
		while(N --> 0) {
			String Line[] = br.readLine().split(" ");
		
			// Line[0] = pab
			// Line[1] = x
			char command = Line[0].charAt(0); // pab --> p
			if(command == 'P') {
				char c = Line[1].charAt(0); // x
				left.push(c); // ���� �߰�
			}else if(command == 'B') {
				// (Ŀ���� ������ �� ���̸� ���õ�) : left�� ���� ������
				if(!left.isEmpty()) {
					left.pop();
				}
			}else if(command == 'L') {
				// �̵� ������ right���� pop�ؼ� left�� �߰��Ѵٰ����
				// abcd | xyz
				// abc|dxyz
				// ���ʿ��մ� ���� ���������� �̵�
				if(!left.isEmpty()) {
					char c = left.pop();
					right.push(c) ;
				}
				
			}else if(command == 'D') {
				// abcd | xyz
				// abcd|xyz
				// abcdxyz|
				// �����ʿ� �մ� ���� �������� �ѱ�� ������ ���߿� ��ĥ���̱⶧���� ������ �ջ�Ȱ��� �ƴϴ�.
				if(!right.isEmpty()) { // �����ʿ� �ѱ�� �־�� �ѱ��.( = Ŀ���� ������ �ǵ��̸� ���� x)
					char c = right.pop();
					left.push(c);
				}
			}
			
			// left --> right�� �̵�
			
		}
		StringBuilder sb = new StringBuilder();
		while(!left.isEmpty()) {
			char w = left.pop();
			right.push(w);
		}
		// right�� �ִ� ���� ���
		while(!right.isEmpty()) {
			char rightw = right.pop();
			sb.append(rightw);
		}
		System.out.println(sb.toString());
	}
}
