package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class st1 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		LinkedList<Integer> q = new LinkedList<>();
		for(int i =0; i <n; i++) {
			int v = Integer.parseInt(br.readLine()) ;
			if(v == 0) {
				q.pop();
//				break;
			}else {
				q.push(v);
//				break; ���⿡ break�� ������ ������ ������ for���� �ٷ� ����
			}
		}
		int sum = 0;
		while(!q.isEmpty()) {
			sum += q.poll();
		}
		System.out.println(sum);
	}
}
