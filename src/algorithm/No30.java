package algorithm;

public class No30 {
	/*���� �߿�*/
	// �ֿ� ���� :
	//  ���� ����� ���ǹ�
	
	
	// 2������ �׸���
	static final int COlOR =2 ; // ���
	static int size = 5; // map size
	
	static void color(int x, int y) {
		// �������� 1�� �ƴҰ�� ��ĥ
		if(map[x][y] != 1) {
			map[x][y] = COlOR;
		}
		// ����
		if(x-1 >= 0 && map[x-1][y] != 1 && map[x-1][y] != COlOR) {
			color(x-1,y);
		}// ������
		if(x+1 <size && map[x+1][y] !=1 && map[x+1][y] != COlOR) {
			color(x+1,y);
		}// ����
		if(y-1 >= 0 && map[x][y-1] != 1 && map[x][y-1] != COlOR) {
			color(x,y-1);
		}// �Ʒ���
		if(y+1 < size && map[x][y+1] !=1 && map[x][y+1] != COlOR) {
			color(x,y+1);
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		for(int i=0; i < size; i++) {
			for(int j =0; j <size; j++) {
				System.out.print(map[i][j]);
			}
			System.out.println();
		}
		
		color(0,0); // (0,0)������ġ ��ȯ

		System.out.println("==================");
		
		for(int i=0; i < size; i++) {
			for(int j =0; j <size; j++) {
				System.out.print(map[i][j]);
			}
			System.out.println();
		}
/*����: 
22222
22112
22221
22222
22122*/
	}
	static int [][]map= {{0,0,0,0,0},
			{0,0,1,1,0},
			{0,1,0,0,1},
			{0,0,0,0,0},
			{0,0,0,0,0}};
	
	
	
}
