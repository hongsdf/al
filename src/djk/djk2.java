package djk;

// ������ �ð����⵵ o(n^2) 
// �� ����: getSmallIndex() �Լ����� o(n)
// dijkstra() �ȿ� getSmallIndex()�� �������Խ��ѳ��� ������  o(n*n) == o(n^2)

public class djk2 {
	public static int num;
	public static int INF = 1000000000; // int ���� ��������θ� �Ͽ����� 21���������
	public static boolean[] visited;
	public static int d[];
	public static int arr[][];
	public static void main(String[] args) {
		num = 6;
		arr = new int[][] {
		// �׷��� �ؼ� ���
		// Ư�� ��(���) �� ���� ����� (����ũ��)�� ���������
		
			{0,2,5,1,INF,INF}, //  1(��) ��忡 ���� �ٸ� ������ ����ũ�⸦ ǥ�� �Ѱ�
			{2,0,3,2,INF,INF},
			{5,3,0,3,1,5},
			{1,2,3,0,1,INF},
			{INF,INF,1,1,0,2},
			{INF,INF,5,INF,2,0},
			
			
		};
		
		visited = new boolean[num]; //��� �湮���� Ȯ��
		d = new int[num]; //�ִ� �Ÿ��� �����ϱ� ���� �迭
		dijkstra(0);
		for(int i =0; i <d.length; i++) {
			System.out.print(d[i] + " ");
		}
		
	}
	private static int getSmallIndex() {
		int min = INF;
		int index = 0; // ���� ���� ���� ������ �ε����� �������� ���� ���� ����
		for(int i=0 ; i <num; i++) {
			if(d[i] < min && !visited[i]) {
				min = d[i];
				index = i;
			}
		}
		return index; // �Ÿ� �迭�� ���� ���� ������ ���� �ε����� ��ȯ
		// �� ���� �ּҰŸ��� ������ ����
		// 1��忡 ���� 4����尡 ���� ������
		// �׷��� 4�� ��� ����
	}
	public static void dijkstra(int start) {
		// d[i]�� ä������
		for(int i =0; i<num; i++) {
			d[i] = arr[start][i]; // o o o o o o
		//  d[0] = arr[0][0];
		//  d[1] = arr[0][1];
		//  d[2] = arr[0][2];
			
		// �� start = 0 �̶��
//			d[i]�� �ʱⰪ�� 0,2,5,1,INF,INF
		}
		visited[start] =true; // start �� �湮 üũ
		for(int i =0; i<num -2; i++) { // �湮üũ�� �ϰ� �Ǹ� ��ü
			int current = getSmallIndex(); // d[i]�� ���� ���� ������ ������ [�ε���] : 0,2,5, [1] ,INF,INF 
			System.out.println("�湮���"+current);
			visited[current] = true;
			// ��������� ������ ��带 ã�� 
			// ex) 4������ 1,2,3,5�� ����Ǿ� �ִ� . 
			// ������ 1������ �湮�߱⶧���� �����ϰ� 
			// ������ 2,3,5 ������带 ���� ����
			for(int j =0; j <6; j++) {
				if(!visited[j]) { // �湮���� �ʴ� ����̰�
					 
				
				// ��������� ���°ͺ��� �ٸ������� ��ó�� ���� ���� �� �۴ٸ�
				if(d[current] + arr[current][j] < d[j]  ) {
				  // j : 1(�� 2�����)
				  // �ؼ�
				  // 1 +   {1,2,3,0,1,INF} �� <  0,2,5,1,INF,INF 
				  // ó�� 4����尡 �����̵Ǿ�  	
				  // 0,(2),5,[1],INF,INF  
				  // 1 +  4�� ����� �迭�� 2����� : 2
				  // 1����忡�� 4����带 ���� 2�� ���� 1+2 : 3 ũ�� < 1������ �ٷ� 2������ ���� ũ�� : 2ũ��
				  // �� 3 < 2 (���� x)
					
				    // 2��°
					// j : 2(�� 3�����)
					// 1 +  4�� ����� �迭�� 3����� : 
					// 1����忡�� 4����带 ���� 3������ ���� 1+3 : 4 ũ�� < 1������ �ٷ� 3��������� ���� ũ�� : 5 ũ��
					// �� 4 < 5 (���� �ʿ�)
					
					// 3��°
					// j : 3(�� 4�����) �ڱ��ڽ�
					
					// 4��°
					// j : 4(�� 5�����)
					// 1�� ��忡�� 4����带 ���� 5������ ���� 1 + 1 < 1������ 5������ ���� ũ�� : INF
					// 2 < INF (���� �ʿ�)
					
					
					
				 
					d[j] = d[current] + arr[current][j];
				}
			}
		}
		
		}	
		
		
	}
}
