package leetcode;

public class zigzag2 {
	public static void main(String[] args) {
		Sol s = new Sol();
		String str = "abcdefghijklmop";
		int numRows = 4;
		String ans = s.convert(str, numRows);
		System.out.println(ans);
	}
}
class Sol{
	public String convert(String s, int num) {
		StringBuilder[] sb = new StringBuilder[num];
		//�ʱ�ȭ �ʼ�
		for(int i =0; i <sb.length; i++) {
			sb[i] = new StringBuilder();
		}
		char c[] = s.toCharArray();
		int size = c.length; // �迭 ũ��
		int idx = 0; // �迭�� �ε���

		// while�� ������ ����4���� ���Ѱ��̴�.
		while(idx < size) { // ��� ���Ҹ� ����
			// ������ �̵� �ܰ�
			int i = 0 ;
			int j = 0 ; // nĭ ������
			
			// 1. ������ �̵� 
			while(j < num - 1 && idx < size && i < size) { 
				sb[i].append(c[idx++]);
				j++;
			}
			// 2. �Ʒ��̵�
			while(i < num-1 && idx < size && i < size) {
				sb[i++].append(c[idx++]);
			}
			// 3. ������ �̵�
			j = 0;
			while(j < num - 1 && idx < size) {
				sb[i].append(c[idx++]);
				j++;
			}
			
			// 4. �ö󰡴� �̵�
			while(i >= 1 && idx < size) {
				sb[i--].append(c[idx++]);
			}
			
		}
		for(int i = 1; i <sb.length; i++) {
			sb[0].append(sb[i]);
		}
		
		
		return new String(sb[0]);
	}
}
