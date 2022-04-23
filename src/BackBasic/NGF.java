package BackBasic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

/* ũ�Ⱑ N�� ���� A = A1, A2, ..., AN�� �ִ�. ������ �� ���� Ai�� ���ؼ� ����ū�� NGF(i)�� ���Ϸ��� �Ѵ�.
	Ai�� ���� A���� ������ Ƚ���� F(Ai)��� ���� ��, Ai�� ����ū���� �����ʿ� �����鼭 ���� A���� ������ Ƚ���� F(Ai)���� ū �� �߿��� ���� ���ʿ� �ִ� ���� �ǹ��Ѵ�.
 	�׷��� ���� ���� ��쿡 ����ū���� -1�̴�.
 *  1 1 2 3 4 2 1 -> -1 -1 1 2 2 1 -1
 *  
 *  n = 100000�̹Ƿ� O(n^2)�̻� �ȵ�
 *  
 * */
public class NGF {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()) ;
		int arr[] = new int[N];
		int ans[] = new int[N];
		int result[] = new int[100001] ;
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		for(int i = 0; i <N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			result[arr[i]]++;
		}
		Stack<Integer> stack = new Stack<>();
		stack.push(0);
		for(int i = 1; i <N; i++) {
			/* �ش� Ƚ�������Ѵ� ������  result[arr[]] < result[[[]]] : �Ǿ� �־ �ᱹ result�� ���ϴ� ���� ���� �ϰ� �������� */
			// result[arr[stack.peek()]] < result[arr[i]] ����Ƚ���� ���Ͽ� ����Ƚ������ ũ�� ������ �������ִ� ����
			while(!stack.isEmpty() && result[arr[stack.peek()]] < result[arr[i]] ) {
				ans[stack.pop()] = arr[i]; // ������ �Ǹ� �ش� idx�� ���Ұ��� �����Ѵ�.
			}
			stack.push(i); // 
		}
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		for(int i = 0; i <ans.length; i++) {
			if(ans[i] == 0) ans[i] = -1;
			bw.write(ans[i]+" ");
		}
		
		bw.flush();
	}
}
