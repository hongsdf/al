package algorithm;

public class No32 {
	/*return�� void �Լ�����  ����ϴ� ���(���ǹ�) Ż���Ѵ�,*/
	static void num(int x) {
		if(x/10 == 0) {
			System.out.println(x);
			return; // * Ż���Ѵٴ� �ǹ� 
		}
		// ����Լ��� Ż�������� �Ǳ� ���� stack ���� �Լ��� ���̰� �ȴ�
		// stack �̶� ���Լ���
		// num(2) ���� Ż�������� Ǯ���� �ȴ� => �׷��� ������ num(23) -> num(231)�� �ö󰡸� ����ϰԵȴ�.
		num(x/10); // num(231) - num(23) - num(2)
		// num(2) ���ķ� �Լ� Ǯ��
		System.out.println(x%10); // �Լ��� Ǯ���� �����̵ȴ�.
		
		//2
		//3
		//1
		//2
		
	}
	
	
	public static void main(String[] args) {
		/*�Էµ� ���� ���� �ڸ��� ���� ����Ͻÿ�
		2312

		����:
		2
		3
		1
		2
		*/
		
		int n = 2012;
		
		
		num(n);
	}
}
