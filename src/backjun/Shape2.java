package backjun;

public class Shape2 {
	public static void main(String[] args) {
	Rectangle2 b1 = new Rectangle2();
	
	// �͸� ��ü : Ŭ�����̸��� ���� ���� �ʰ� �ż��带 �����Ѱ� (�� �����ڴ� ������ �ȵ�) => �� ���� Ŭ�����̸鼭 �ٸ������ �߰� �ϰ� ������
	Rectangle2 b = new Rectangle2() {
		int n = 2;
		
		int size() {
			return n * width * height;
		}
	};
	int res = b1.size();
	System.out.println(res);
	
	int ans = b.size();
	System.out.println(ans);
	
	
	}
}
class Rectangle2{
	int width =30;
	int height = 100;
	
	int size() {
		return width * height;
	}
}