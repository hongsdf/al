package algorithm;

public class No7 {
// �Ҽ��Ǻ�
	/* 
	 * �ٽ� ���� ����
	 * boolean flag �� ����ϴ� ���� : Ȯ�� ���θ� �Ǵ��ϱ� ���� ����
	 * for() ���ȿ� if ���� ��ġ�� ����̹Ƿ� (�Ҽ� x) flag  => false�� ��
	 * �Ҽ� o �̸� if���� ��ġ�� ���� ��� flag�� true;
	 */
	public static void main(String[] args) {
		int in = 3;
		boolean flag = true;
		
//		2 /1  =2 ..0
//		2 /2 = 1 ...0
		
//	    8 / 2 == 4 ...0
//		8 / 8 == 1 ...0
//		8 / 4 == 2 ...0 
		
//		�Ҽ��� �Ǻ��� 2���� �ڱ� �ڽ�-1���� �˻� 
		for(int i =2; i <= in-1 ; i++) {
			// �ݺ��� ���߿� �ѹ��̶� ���������� �Ҽ��� �ƴϴ�
			if(in % i == 0) {
				flag = false;
				
			}
			
		}
//		�Ҽ���� if���� �ѹ��� ��ġ�� �����Ƿ� flag�� ���� ���� true�� �״��
		if(flag) {
			System.out.println(in+" �Ҽ� �Դϴ�");
		}
		else {
			System.out.println("�Ҽ� x");
		}
		
	}
}
