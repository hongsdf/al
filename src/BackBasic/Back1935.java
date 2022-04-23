package BackBasic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/*5
ABC*+DE/-
1
2
3
4
5

���� ������ �����Ѱɷδ� �̰�
123*45/ -1

(3 + 2) �� 3 - 4 �� 3 2 + 3 ��4
32+3*4-

����
-���� ǥ���(PrefixNotation)�� �����ڸ� �տ� �δ� ����̸�, ������ ǥ���(Polish
Notation) �̶�� �Ѵ�.

-���� ǥ����� �������� ǥ���(ReversePolishNotation)�̶�� ��

������ ���

1. stack�� ���� ���� �迭�� �ʿ����� ������?
2. ABC��Ī�̶� �ߺ����� Ȱ���ϱ� ���� �迭�� �ʿ��ϳ�? -- �ʿ��ϴ� ��� �Ǹ�

*/
public class Back1935 {
	public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int N = Integer.parseInt(br.readLine());
			double arr[] = new double[N];
			String str = br.readLine();
			/* ��� �迭1���� <--> �ٸ� �迭2 ��Ī ��Ű�� ���
				�迭1�� �迭2�� �ٸ���
				���� ������ �ϱ� ���ؼ� �� �����ؾ��Ѵ�
				���⼭�� arr[0] <-> arr[c-'A'] ��Ī ��Ű�� ����̴�.
				������ arr[c-'A']�̰��� ���� arr[0]�� �����غ���
				
				
				stack�� push���� arr[i]��Ҹ� �ϼ��ϴ� ���̴�
				stack.push(arr[]) ����
				stack.push()�� int ���̶� �ϸ�
				string���� Ÿ���� char Ÿ���̹Ƿ� push�Ҷ� ����
				�׸��� charŸ���ε� arr[]�� �������Ѿ��Ѵ�.
				st.push(arr[c])  ó����Ұ� arr[0]�ε����� �����Ѵ�.
				c == A��� ���� c�� 0�� �Ǵ� ����� c-'A' �� �ϸ� 0 �� ��
				st.push(arr[c - 'A']
			
			*/
			for(int i = 0 ; i <N; i++) {
				// ABC��Ī�̶� �ߺ����� Ȱ���ϱ� ���� �迭�� �ʿ��ϳ�? -- �ʿ��ϴ� ��� �Ǹ�
				arr[i] = Double.parseDouble(br.readLine()); // {2,3,4}  ��� �ϸ� A == 2
				
			}
			
			Stack<Double> st = new Stack<>();
			/* ����  arr �迭�� �մ� �� ���Ҹ� ��Ī ABCD...�� ��Ī
			 */
			for(char c : str.toCharArray() ) {
				// �ǿ����ڶ� �����ڶ� ����
				if(c >= 'A' && c <='Z') {
					st.push( arr[(int)(c -'A')] ); // A�� ���ϴ� �� 1, 	B�� 2, C�� 3..
					
				}else{
					// �����ڰ� ������ pop
					Double d1 = st.pop();
					Double d2 = st.pop();
					if(c == '+') {
						st.push(d1 + d2);
					}else if(c == '-') {
						st.push(d1 - d2);
					}else if(c == '*') {
						st.push(d1 * d2);
					}else if(c == '/') { // ����ǥ��� ������ ���� �Ųٷ� 
						st.push(d2 / d1);
					}
					
				}
			}
			System.out.printf("%.2f",st.pop()); //������ ��
					
					
					
					
					
					
					
					
					
					
					
					
					
					
	}
}
