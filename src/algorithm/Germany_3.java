package algorithm;

import java.io.*;


public class Germany_3 {
	public static void main(String[] args) throws Exception {
		// ABCDE ���� 2���� ���� ���
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		char c[] = s.toCharArray();
		combine(c,0,new StringBuilder());
	
	}

	private static void combine(char[] c, int pos,StringBuilder sb) {
		if(pos >= c.length) { // ��� ���ڸ� �� Ȯ���Ѵ�
			if(sb.length() == 2) System.out.println(sb);
			return;
		}
		// ���� ������ �� ���Խ��ѳ��� ���ƿ��� ��� ABCDE --> ABCD --> ABCE -->...... 
		combine(c,pos+1,sb.append(c[pos])); // return �Ǹ� pos = 4�� ���ƿ´�, pos �� // sb���� ���� (������)
		sb.setLength(sb.length()-1);
		combine(c,pos+1,sb);
		
	}
}
