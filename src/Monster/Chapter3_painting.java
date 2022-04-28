package Monster;

import java.io.*;
import java.lang.*;
import java.util.*;


public class Chapter3_painting {
	public static final Scanner scanner = new Scanner(System.in);
	public static final int MAX_SEAT_NUMBER = 1000;
	public static final int MAX_COLOR_NUMBER = 100;

	/**
	 *
	 * @param n : �¼��� ��. �¼��� 0~(n-1)���� ��ȣ�� ������.
	 * @param m : �¼��� ĥ�� Ƚ��.
	 * @param paintings  : �¼����� ��ĥ�� �̺�Ʈ���� ����
	 */
	public static void solve(int n, int m, Painting[] paintings)
	{
		int[] seats = new int[n]; //seats[i] := i�� �¼��� ���� ����

		
//		int minIdx = 0;
//		int maxIdx = 0;
		
		for(Painting temp : paintings){
			int left = temp.left;
			int right = temp.right;
			int color = temp.color;
			for(int i = left ; i <=right; i++){
				seats[i] = color;
			}
		}
		// �¼��� ��ĥ�� �� �ϼ��Ͽ���.
		
		// ���� ���� ���� ����
		int color[] = new int[n];
//		for(int i = 0; i<n; i++) {
//			color[i] = -1;
//			
//		}
		/*�󵵼� ���������� ���� �迭�� ����� ����Ѵ�
		  ���� :  �ð����⵵�� �������� ��ü�Ͽ� ���� �� �ִ�.
		 */
		
		for(int i = 0; i<n; i++){
			color[seats[i]]++; // �������� �� ++
		}
		
		
		// ������� �� ���Ǹ� �ּҰ�, �ִ밪

		// ��ũ��
		int minColor = -1; //���� ���� ������ ����
		int maxColor = -1; //���� ���� ������ ����
		
		for(int i = 0; i<color.length; i++) {
			if(color[i] == 0) continue;
			
			if(minColor == -1 || color[i] < color[minColor]) {
				minColor = i;
			}
			
			if(maxColor == -1 || color[i] > color[maxColor]) {
				maxColor = i;
			}
		}

		
		
		
		System.out.println(maxColor);
		System.out.println(minColor);
	}

	public static void main(String[] args) throws Exception {
		int n = scanner.nextInt(); // �¼� ��
		int m = scanner.nextInt(); // ��ĥ ��

		//paintings[i] := i��°�� �Ͼ ��ĥ �̺�Ʈ�� ����
		Painting[] paintings = new Painting[m];


		for(int i = 0 ; i < m ; i ++)
		{
			//�¼��� ��ȣ�� 1������ �����ϹǷ�, 0 ~ (n-1)������ ���߱� ���Ͽ� 1�� ���ش�
			int left = scanner.nextInt()  -1;
			int right = scanner.nextInt() -1;
			int color = scanner.nextInt();
			paintings[i] = new Painting(left, right, color);
		}

		//������ ������ ���Ѵ�
		solve(n, m, paintings);
	}

}

//�¼����� �� �� ��ĥ�ϴ� �̺�Ʈ�� ���� ����
class Painting{
	public int left;
	public int right;
	public int color;
	Painting(int left, int right, int color)
	{
		this.left = left;
		this.right = right;
		this.color = color;
	}
}