package algorithm;

public class No34 {

	static int size = 5;
	
	static int house[] = new int [5]; // ������� ����ϴ� �迭 { * , * ,* 
	
	
	static int arr[][] = {{ 1, 0, 0, 1, 1 },
						  { 0, 0, 0, 0, 1 },
						  { 1, 0, 1, 0, 0 },
						  { 1, 1, 0, 0, 1 },
						  { 1, 1, 0, 0, 1 }};

	// ����� 3��
	// 3, 5, 2

	static void apartment(int x, int y, int apartnum ) { // apartnum : ���� ��ȣ
			arr[x][y] = 0; // * 1�� 0���� ������ �ߺ��� ���� �Ѵ�
			house[apartnum]++; // house[] : ��ȣ�� �´� ����� ����
		
			if(x+1 < size && arr[x+1][y] == 1 ) {
				apartment(x+1, y, apartnum);
			}
			if(x-1 >= 0 && arr[x-1][y] == 1) {
				apartment(x-1,y,apartnum);
			}
			if(y-1 >= 0 && arr[x][y-1] == 1) {
				apartment(x,y-1,apartnum);
			}
			if(y+1 <size && arr[x][y+1] == 1) {
				apartment(x,y+1,apartnum);
			}
			
			
			
		
		
		
		
			
	
	}

	public static void main(String[] args) {
		int apartnum = 0;
		for(int i = 0; i <size; i++) {
			for(int j=0; j<size; j++) {
				if(arr[i][j] == 1 ) { // 2���迭�� ��ȸ�ϴ� 1�� �߰��ϸ� �޼���(x,y,������) ����
					apartment(i,j,apartnum); //apartnum : ���� ��ȣ
					apartnum++;
					
				}
			}
			
		}
		System.out.println(apartnum);
	
		for(int i : house) {
			System.out.print(i + " ");
		}
		
		
	}
}
