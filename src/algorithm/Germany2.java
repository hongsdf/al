package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Germany2 {
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// 1 2 3 4 5 6 7 8 ���� 6�� ���� ���� ���
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> list = new ArrayList<>();
		
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0;i<N; i++) {
			list.add(Integer.parseInt(st.nextToken()));
		}
	
		combine(list,0,new StringBuilder());
		
	}

	private static void combine(List<Integer> list, int pos, StringBuilder sb) {
		if(pos >= list.size()) { // �� �ڸ����� ���� �� Ȯ�� �������� �ǹ�
			if(sb.length()== 3) System.out.println(sb);
			return;
		}
		// 1 2 3 4 5 = >2^5 == 32���� ����Ǽ�
		// o o o o o
		// x x x x x
		
		// 1 2 3�� ������ ��쿡��  1 2 3 x x : 4,5������ Ȯ���� ����
		// 3���� ���� Ȱ��(���Խ�Ű��-> ����-> ���Խ�Ű�� ���� ���)
		combine(list,pos+1,sb.append(list.get(pos))); // �� �ε����� ���Խ�Ų��
		sb.setLength(sb.length()-1); // �ٽ� ����
		combine(list,pos+1,sb); // �� �ε��� ���� x
		
	}
}
