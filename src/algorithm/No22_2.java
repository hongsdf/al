package algorithm;

public class No22_2 {
	public static void main(String args[]) {
		String n = "1135311";
		boolean flag = true;
		int len = n.length();
		for(int i = 0; i < len/2 ; i++) {
			if(n.charAt(i) != n.charAt(len-i-1)) {//charAt(index) :  ���ڿ��� �ε������� �и��ϴ� �޼��� ��ȯ String
				flag = false;
				// charŸ�� : �� ���������� �ƽ�Ű�ڵ�� �ޱ� ������ �������̴�
				// [0]   [4]
			}
		}
		System.out.println(flag);
	}
}
