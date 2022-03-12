package djk;
// ���ͽ�Ʈ�� ����
// 1. �� ������ ��� �������� �ִ� �Ÿ�����
// 2. ��� ������ �ٸ� ��� �������� �ִܰŸ�����

// ���� ���
// 1 2���� �迭
// 2 �켱����ť�� ����

public class djk4 {
	public static int arr[][];
	public static int INF;
	public static int num;
	public static int d[];
	public static boolean visited[];
	
	public static void main(String[] args) {
		INF = 987654321;
		num = 6;
		d = new int[num];
		visited = new boolean[num];
		
		arr = new int[][] { 
				{ 0, 2, 5, 1, INF, INF }, // 1(��) ��忡 ���� �ٸ� ������ ����ũ�⸦ ǥ�� �Ѱ�
				{ 2, 0, 3, 2, INF, INF },
				{ 5, 3, 0, 3, 1, 5 },
				{ 1, 2, 3, 0, 1, INF },
				{ INF, INF, 1, 1, 0, 2 },
				{ INF, INF, 5, INF, 2, 0 },

		};
		
		djiktra(0);
		
		for(int i = 0 ; i < num; i++) {
			System.out.print(d[i]+ " ");
		}
		
	}
	private static void djiktra(int start) {
		for(int i = 0; i <num; i++) {
			d[i] = arr[start][i];
		// d[0] = arr[0][0]
		// d[1] = arr[0][1]
		// d[2] = arr[0][2]
			
		}
		visited[start] = true;
		for(int i =0; i < num-1; i++) {
			int curr = getsmall();
			visited[curr] = true;
			for(int j = 0; j <num; j++) {
				// i->curr + curr->j < i->j 
				// (�������-> �߰����� + �߰����� -> ��������) < (������� -> ��������)
				if(!visited[j]) {
					if(d[curr]+ arr[curr][j] < d[j] ) {
						
						d[j] = d[curr] + arr[curr][j] ;
					}
				}
			}
		}
	}
	
	
	private static int getsmall() {
		int min = INF;
		int idx = 0;
		for(int i =0 ; i <num; i++) {
			if(d[i] < min && !visited[i]) {
				min = d[i];
				idx = i;
			}
		}
		return idx;
	}
}