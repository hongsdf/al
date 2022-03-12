package backjun;


import java.util.Scanner;

public class Back2247 {
	static char[][] arr; // �ʿ��� ����
	static void star(int x,int y,int n,boolean flag) {
		if(flag) {
			for(int i=x;i<x+n; i++) {
				for(int j=y; j<y+n; j++) {
					arr[x][y] = ' ';
				}
			}
			return;
		}
		
		
		
		if(n==1) {
			arr[x][y] = '*';
			return;
		}
		
		
		// �ᱹ �� 1x1����� ã�������� ����Լ��� ȣ���ؾ��Ѵ�.
		// (0,0) (0,3) (0,6) --> (0,0) --> (0,0) (0,1) (0,2)
		// (3,0) (3,3) (3,6)               (1,0) (1,1) (1,2)
		// (6,0) (6,3) (6,6)               (2,0) (2,1) (2,2) ....
		
		int size = n/3; //�� ������ ������ ũ�� size (3x3) -> (1x1) ���� ��� �İ� ���
		int AreaCount = 0;
		for(int i =x; i <x+n; i+=size) {
			for(int j=y; j<y+n; j+=size) {
				AreaCount++;
				if(AreaCount == 5) {
					star(i,j,size,true);
				}else {
					star(i,j,size,false);
				}
			}
		}
	}
	
	
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	
	
	 arr = new char[n][n]; // ���
	 star(0,0,n,false);
	 
	 StringBuilder ssb = new StringBuilder(); // StringBuilder�� ���ڿ� ��ü�� �������ִ� ����
	 for(int i=0; i<n; i++) {
		 for(int j=0; j<n; j++) {
			 ssb.append(arr[i][j]);
		 }
		 ssb.append('\n');
	 }
	 System.out.println(ssb);
	 sc.close();
	 
	 
		
	}

}