package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Stack;


// ���� 1~n���� ���ڸ� ���� ��� �ʰ� �Է��� ����(�迭)�� stack �� ���Ͽ� ������ �ϼ��϶�
public class Linear {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		Stack<Integer> st = new Stack<Integer>();
		
		int arr[] = new int[n];
//		List<String> list = new ArrayList<String>();
		StringBuilder sb = new StringBuilder();
		int index = 0;
		for(int i =0; i <n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		// 7
		// 5
		// 3
		// :
		
		for(int i =1; i <=n; i++) {
			st.push(i);
			sb.append("+").append("\n");
			while(!st.isEmpty()) {
				if(st.peek() == arr[index]) {
					st.pop();
					sb.append('-').append("\n");
					index++; // �������� �´� �� �ʸ´��� ���� Ȯ��
					//   5  -->   o    5
					//   3  -->   x    4
					//�׷��� while ����
					
				}else { // ��ã���� while���� �� for������ ���ư���
					break;
				}
			}
		}
		if(st.isEmpty()) {
			System.out.println(sb);
		}else {
			System.out.println("no");
		}
	}
}
