package djk;
// ��� �������� �ٸ� ��� �������� �ִܰŸ�����
// 2���� �迭 ���
// 3�� for���� ��� : �߰�����, �������, ��������
// Ư¡ : arr[1][2] != arr[2][1] �Ÿ��� ���� �ʾƵ� ����� �����ϴ� ��) ���� �Ÿ��� ���� �Ÿ��� �ٸ� ���� ��밡�� 
 
public class Floyd {
	public static int arr[][]; // ���� 2�����迭
	public static int num;
	public static int INF;
	public static int board[][];
	public static void main(String[] args) {
		num = 4;
		INF = 1000000000;
		board = new int[][] {
			{0,5,INF,8},
			{7,0,9,INF},
			{2,INF,0,4},
			{INF,INF,3,0}	
		};
		floyd();
		
		
	}

	private static void floyd() {
		arr = new int[num][num];
		for(int i = 0 ; i <num; i++) {
			for(int j = 0; j <num; j++) {
				arr[i][j] = board[i][j];
			}
		}
		
		// k : �߰���带 ���İ��� ���
		for(int k = 0; k <num; k++) {
			// i : ��� ����
			for(int i =0; i <num; i++) {
				// j : ���� ����
				for(int j =0; j <num; j++) {
					// arr[i][j] : i(�������) -> j(��������) >  i(�������) -> k(�߰�����) + k(�߰�����) -> j(��������)
					if(arr[i][j] > arr[i][k] + arr[k][j]) {
						
						arr[i][j] = arr[i][k] + arr[k][j];
						
					}
				}
			}
		}
		
		for(int i =0; i <num; i++) {
			for(int j =0; j<num; j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
	}
}
