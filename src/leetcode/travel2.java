package leetcode;

public class travel2 {
	public static void main(String[] args) {
		Sol2 m = new Sol2();
		int[][] key = new int[][] { { 0, 0, 0 }, { 1, 0, 0 }, { 0, 1, 1 } };
		int[][] lock = new int[][] { { 1, 1, 1 }, { 1, 1, 0 }, { 1, 0, 1 } };
		boolean flag  = m.solution(key, lock);
		System.out.println(flag);

	}
}
class Sol2 {
	public boolean solution(int key[][], int lock[][]) {
		// ���踦 �ڹ���� ��ġ��Ű��
		
		
		
		int offset = key.length -1 ; // ������ġ
		for(int i =0; i <offset +lock.length ; i++) {
			for(int j =0; j <offset + lock.length ; j++ ) {
				
				// ȸ���ֱ�
				for(int spin = 0; spin < 4; spin ++) {
				
					// ū������ ����
					// key �ִ���� 20 + lock �ִ� ���� 20 + key �ִ� ���� 20
					int arr[][] = new int[60][60];
					
					// ȸ���Ҷ����� arr���� �׶����� ���� Ȯ��
					// arr����� : lock�� �ø��� �Ŵϱ�
					for(int r = 0; r < lock.length; r++) {
						for(int c = 0; c<lock.length; c++) {
							arr[offset + r][offset + c] = lock[r][c]; 
						}  
					}
					// arr�� key�� ���Ұ��̱� ������
					// spin �� ��ġ���� 4���� ����
					// key�� ��ġ�� i,j
					correct(arr,key,spin,i,j);
					if(sol(arr,offset,lock.length)) {
						return true;
					}
				}

			}
		}
		return false;
	}
	// arr�� �������� Ȯ���ϴ� �ż���
	private boolean sol(int[][] arr, int offset, int len) {
		// len : lock.length
		for(int i = 0; i <len; i++) {
			for(int j = 0; j <len; j++) {
				// �ڹ��� ��ġ�� offset + 
				if(arr[offset+i][offset+j] != 1) return false;
			}
		}
		return true;
	}

	private void correct(int[][] arr, int[][] key, int spin, int i, int j) {
		// arr�� �����ϴ� �ż���
		int n = key.length;
		for(int r = 0; r < n; r++) {
			for(int c = 0; c < n; c++) {
				if(spin == 0) {
//					Ű ������ġ���� ����
					arr[i+r][j+c] += key[r][c]; 
				}else if(spin == 1) {
					// r : 2, c : 0 -> 0 ,0
					// r : 1, c: 0 -> 0, 1
					//
					arr[i+r][j+c] += key[c][n-1-r];
				}else if(spin == 2) {
					// r: 2 ,2 -> 0,0 
					// r : 2, c : 1 -> 0, 1 
					arr[i+r][j+c] += key[n-1-r][n-1-c ];
				}else if(spin == 3) {
					// r:2,2 -> 0,2
					// r :2, c :1 -> 1,2
					// r: 2,0 -> 2,2
					arr[i+r][j+c] += key[n-1-c][r];
				}
			}
		}
		
		
		
		
		
		
		
	}
}