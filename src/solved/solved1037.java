package solved;

import java.io.BufferedReader;
import java.util.*;

//4
//14 26456 2 28 13228 3307 7 23149 8 6614 46298 56 4 92596
// 185192
public class solved1037 {
	public static void main(String[] args) {
		// ����� �ݵ�� ¦�� �̷��.
		// 1��N�� ������ ����� ���� ���Ѵ�.
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		for(int i = 0; i <N; i++) {
			list.add(sc.nextInt());
		}
		Collections.sort(list);// n log n
		System.out.println(list.get(0) * list.get(list.size()-1));
	}
}
