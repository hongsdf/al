package backjun;

public class Back15596 {
//	Java: long sum(int[] a); (Ŭ���� �̸�: Test)
//	a: ���� ���ؾ� �ϴ� ���� n���� ����Ǿ� �ִ� �迭 (0 �� a[i] �� 1,000,000, 1 �� n �� 3,000,000)
//	���ϰ�: a�� ���ԵǾ� �ִ� ���� n���� ��
	static int a[] = new int[1000];
	
	
	static long Test(int[] a) {
		 
		long tot = 0;
		for(int i = 0; i< a.length; i++) {
			tot += a[i];
		} 
		 return tot;
		
	}
	public static void main(String[] args) {
		int b[] = new int[5];
		b[0] = 1;
		b[1] = 2;
		b[2] = 3;
		b[3] = 4;
		b[4] = 5;
		long ans = 0;
		ans = Test(b);
		System.out.println(ans);
		
	}
	
}
