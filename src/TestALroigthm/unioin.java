package TestALroigthm;

// ���� ���� ��� �ִ��� Ȯ�� same
// �θ� ã�� getParent
// ���� ����̸� ���� ��尡 �θ��ؼ� ��� ���� unioin
// ��� ���� : 
//��� : ����,����,����
//���� : ��, �Ÿ� ,��
public class unioin {
	static int dist[] = new int[8];
	
	
	public static void main(String[] args) {
		for(int i =0; i <dist.length; i++) {
			dist[i] = i+1;
		}
//		for(int i =0; i <dist.length; i++) {
//			System.out.println(dist[i]);
//		}
		uni(dist,1,2);
		uni(dist,3,4);
		uni(dist,5,4);
		uni(dist,6,7);
	
		same(dist,4,2);
	}


	private static void uni(int[] dist, int i, int j) {
		// TODO Auto-generated method stub
		i = getParent(dist,i);
		j = getParent(dist,j);
		if(i < j) dist[j] = i; // dist[j] --> i
		else dist[i] = j; // dist[i] -- >j
	}


	private static int getParent(int[] dist, int i) {
		
		
		
		
		if(dist[i] == i+1) return i;
		// ó�� ����
		// 0 1 2 3 4 5 6 7
		// 1 2 3 4 5 6 7 8
		
//		���⼭ 0���� 1�� ��带 ����

		// 0 1 
		// 1 0 
		
//		�̷� ���� �ڽ� ����� ���� �θ� ��� ��ȣ�� ����Ŵ
		
		
		return dist[i] = getParent(dist, dist[i]);
		// dist[1]  = 
		
		
	}
	public static void same(int dist[], int a, int b) {
		a = getParent(dist, a);
		b = getParent(dist, b);
		if(a == b ) System.out.println("���� �θ�");
		else System.out.println("�� ���� �ٸ� �����̴�");
	}
	
}
