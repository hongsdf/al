package algorithm;

public class No5 {
// ��ҹ��� �����ϱ�
	/*�ٽ� ����
	 * ���̺귯���� �ٸ� ��ƫ�� ������� �ʰ� java������ �ƽ�Ű �ڵ带 Ȱ���Ͽ� �����ؾ� �Ѵ�.
	 * 
	 * */
	public static void main(String[] args) {
		String A = "helloWORLD"; // ��밪 HELLOworld;
// 		�ƽ�Ű �ڵ带 ���
		char b[]; // char[]�� (���ڿ�--> ����) �ϰ� �Ǹ� �� ���ڸ� ���� �Ҽ��ְ� �ȴ�.
		b = A.toCharArray(); // toCharArray : charArray�� ����
		
		// ���ڿ��� �� ���ڷ� �����Ͽ� ��ȸ
		for(int i = 0; i < b.length ; i++) {
			// �ҹ��� --> �빮��
			if(b[i] >= 'a' && b[i] <= 'z') {
				b[i] = (char) (b[i] + 'A' - 'a'); // 'A' - 'a' :�ƽ�Ű �ڵ�� ������ ���̴� 30
			}
			// �빮�� �ҹ���
			else if(b[i] >= 'A' && b[i] <= 'Z') {
				b[i] = (char) (b[i]- ('A'-'a'));
			}
		}
		System.out.println(b);
	}
}
