package Monster;

import java.lang.*;
import java.util.*;
import java.io.*;


public class Chapter5_5i {
	public static final Scanner scanner = new Scanner(System.in);

	public static long getMaximumSquareArea(int n, Point2D[] points) {
		long answer = 0;

		TreeSet<Point2D> Tset = new TreeSet<>();
		//��� �� ����
		for(Point2D p : points) {
			Tset.add(p);
		}
		// Ž��
		for(Point2D p1 : points) {
			for(Point2D p2 : points) {
				long area = p1.getSquaredDistanceTo(p2); // ������ ������ ������ ���̸� ����
				
				if(area < answer) {
					continue; //������ ���̰� �۴ٸ� ��ŵ
				}
				
				// x��ǥ ����
				int dx = p1.x - p2.x;
				
				// y��ǥ ����
				int dy = p1.y - p2.y;
				
				// ���ο� p3,p4 ã��
				// ���� ������ ����ȴ�.  => <a,b> �����̸� <b,-a> || <-b,a>
				Point2D p3 = new Point2D(p1.x-dy, p1.y + dx);
				Point2D p4 = new Point2D(p2.x-dy, p2.y + dx);
				
				// �׸��� Tset�ȿ� p3,p4���� ��¥ �ִٸ� �ִ� ������ �����Ѵ�.
				if(Tset.contains(p3) && Tset.contains(p4)) {
				 answer = Math.max(answer, area);
				}
				
			}
		}
		


		return answer;
	}

	public static void testCase(int caseIndex) {
		int n = scanner.nextInt();

		Point2D[] points = new Point2D[n];

		for (int i = 0; i < n; i += 1) {
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			points[i] = new Point2D(i, x, y);
		}

		long answer = getMaximumSquareArea(n, points);

		System.out.printf("%.2f\n", (double) answer);
	}

	public static void main(String[] args) throws Exception {
		int caseSize = scanner.nextInt();

		for (int caseIndex = 1; caseIndex <= caseSize; caseIndex += 1) {
			testCase(caseIndex);
		}
	}

}

class Point2D implements Comparable<Point2D> {
	// treeSet ���� => ������ �ִ�=> bstƮ��������� �����Ǿ��ִ� O(lg N)
	public int x;
	public int y;
	public int index;
	
	Point2D(int index, int x, int y){
		this.index = index;
		this.x = x;
		this.y = y;
		
	}
	// ���� ���ϴ� �Լ�
	public long getSquaredDistanceTo(Point2D target) {
		long dx = Math.abs(this.x - target.x);
		long dy = Math.abs(this.y - target.y);
		return dx * dx + dy * dy;
	}
	public double getDistanceTo(Point2D target) {
		// �� ��ǥ���� �Ǽ� �Ÿ��� ���
		long sqd = this.getSquaredDistanceTo(target);
		return Math.sqrt(sqd);
	}
	
	
	public Point2D(int x, int y) {
		this.x = x;
		this.y = y;
		
	}

	@Override
	public int compareTo(Point2D o) {
		if(this.x == o.x) {
			return this.y - o.y;
		}
		return this.x - o.x;
	}
}