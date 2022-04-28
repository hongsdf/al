package algorithm;

import java.io.*;
import java.lang.*;
import java.util.*;

// -10,000 ~ 10,000
public class t1 {
	public static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args)
	{
		int n = scanner.nextInt();
		Point2D[] points = new Point2D[n];

		for(int i = 0 ; i < n ; i++)
		{
			int x=  scanner.nextInt();
			int y=  scanner.nextInt();
			points[i] = new Point2D(x, y);
		}
		
		
		// �ΰ��ǽֵ��� �ּҰŸ�����
		int answer = Integer.MAX_VALUE;
		int cnt = 0; //�ּҰŸ��� ���� �ֵ� ����
		for(int i = 0; i<n; i++){ // 0 ~ n-1
			// �ΰ��� ���� Ž���Ҷ� ��� ���� �ݺ���
			for(int j = 0; j<i; j++){
				//< i ,j >���� i := 0~n-1 , j := j< i
				int dist = points[i].getSquaredDistanceTo(points[j]); // �ν��� �Ÿ��� �����ϴ� �޼������
				if(dist < answer){
					answer = dist; //�ּ� �Ÿ� ����
					cnt = 1; // ó�� �ּҰŸ��� �߰ߵǸ� 1�� -> ���� �ּҰŸ��� ������ cnt�� �ʱ�ȭ 1��
				}else if(dist == answer){
					cnt+=1; //�ּ� �Ÿ��� ���� ���� �� ���� �Ұ��
				}
			}
			
		}
		System.out.printf("%.1f\n",Math.sqrt(answer));
		System.out.printf("%d",cnt);

		
	}
}

class Point2D{
	int x;
	int y;
	public Point2D(int x, int y)
	{
		this.x = x;
		this.y = y;
	}

	/**
	 * 2���� ��� �󿡼� �� this���� �� target���� �Ÿ��� ������ ����ϴ� �Լ�
	 * @param target
	 * @return
	 */
	public int getSquaredDistanceTo(Point2D target)
	{
		// this�� ��� ����� ������ �񱳸� �ϴ°�
		// ���� vs ���ο��
		
		// this���� target�� x ��ǥ ���̱���
		int deltax = this.x-target.x;
		// this���� target�� y ��ǥ ���̱���
		int deltay = this.y-target.y;
		return (deltax*deltax) +(deltay * deltay);
		

	}

	public double getDistanceTo(Point2D target)
	{
		return Math.sqrt(this.getSquaredDistanceTo(target));
	}

}

