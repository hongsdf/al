package Strings;

import java.util.Arrays;

public class Substring3 {
	public static void main(String[] args) {
			String str = "abc";
			String res = str.substring(1); // 1�� �ε������� ���δ�
			String res1 = str.substring(0, 1); // 0�� ���� 1������
			
			System.out.println(res);
			System.out.println(res1);
			
			char ara[] = str.toCharArray();
			System.out.println(ara);
			char res2[] = Arrays.copyOfRange(ara, 0, 2);
			for(int i =0; i<res2.length; i++) {
				System.out.println(res2[i]);
			}
			
	}
	
}
