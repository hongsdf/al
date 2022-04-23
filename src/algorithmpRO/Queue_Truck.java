package algorithmpRO;

import java.util.*;

public class Queue_Truck {
	public static void main(String[] args) {
		Solution m = new Solution();
		int bridge_length = 2;
		int weight = 10;
		int[] truck_weights = { 7, 4, 5, 6 };

		m.solution(bridge_length, weight, truck_weights);
	}
}

class Solution {
	public int solution(int bridge_length, int weight, int[] truck_weights) {
		int answer = 0;
		int sum = 0; // ���� ����
		Queue<Integer> q = new LinkedList<>();
		// Ʈ���� ��ȸ �Ұ�
		for (int i = 0; i < truck_weights.length; i++) {
			int num = truck_weights[i];
			while (true) { // ������� ? �ᱹ ��� Ʈ���� �Űܾ��Ѵ�. �̶� while(true) ����
				if (q.isEmpty()) { // �ٸ��� ��� �ִ� ��� �÷����Ѵ�.
					q.add(num);
					sum += num;
					answer++;
					break; // break�� �����ٴ� �� Ʈ���Ѱ��� �ذ��ߴ�. ���� �̰� �Ű��.
				} else if (q.size() == bridge_length) {// �ٸ� �ڸ��� �� ����
					sum -= q.poll(); // �̵� �� ���� �� ����
				} else { // ���� Ȯ��
					if (sum + num > weight) {
						q.add(0); // �ٽ� ������ �� 0���� �ִ´�. : �̷� �̵��������� 0�� �־� �ڸ������� ��Ų��.
						answer++;
					} else {
						q.add(num);
						sum += num;
						answer++;
						break; // break�� �����ٴ� �� Ʈ���Ѱ��� �ذ��ߴ�.
					}
				}

			}

		}

		return answer + bridge_length; // bridge_length���ϴ� ���� ? ���� �ٸ��� 5���� _ _ _ _ _ �ű������ 5�� �̵��ؾ��Ѵ�.
	}
}