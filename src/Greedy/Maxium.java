package Greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Maxium {
	public static void main(String[] args) {
		Result m = new Result();
		List<Integer> list = new ArrayList<Integer>(Arrays.asList());
		List<Integer> ans = m.maximumPerimeterTriangle(list);
		System.out.println(ans.get(0) == -1? -1:ans);
			
	}
} 

class Result {

	// ���� ��
	public static List<Integer> maximumPerimeterTriangle1(List<Integer> sticks) {
		// 1 2 3,4,6,7
		for(int i =0; i<sticks.size()-3; i++) {
			List<Integer> arr = sticks.subList(i, i+3); // �̰� �ȵȴ� 
			// ����?
			// ���ĵǾ��ٰ� �ش� 1,2,3 ������θ� ���Ǵ� ���� �ƴ�
			// 1,2,4 ��� �Ѿ� Ȯ�� ���� => 1,2,6...
			/// �׷��� �ٸ��� ��������
			for(int j = 0; j<arr.size(); j++) {
				
			}
		}
		
		
		return sticks;
	}
	
	// ���� �� 
	public static List<Integer> maximumPerimeterTriangle(List<Integer> sticks) {
		// 1 2 3,4,6,7
		// 3�� for�� ����
		// for(1��) : �迭����
		// for(2��) : (j)�ϳ��� ������
		// for(3��) : j�� �����ϴ� �۾�
		
		int max = 0;
		List<Integer> temp = new ArrayList<>();
		for(int i = 0; i<=sticks.size() -3 ; i++) {
			for(int j = i+1; j<=sticks.size()-2; j++) {
				for(int k = j+1; k <= sticks.size()-1; k++) {
					if(sticks.get(i) <= sticks.get(j) + sticks.get(k)) {
						int result = sticks.get(i) + sticks.get(j) + sticks.get(k) ;
						if(max < result) {
							max = result;
							if(temp.isEmpty()) {
								temp.add(sticks.get(i));
								temp.add(sticks.get(j));
								temp.add(sticks.get(k));
							}else {
								temp.clear();
								temp.add(sticks.get(i));
								temp.add(sticks.get(j));
								temp.add(sticks.get(k));
							}
								
						}
					}
				}
			}
		}
		if(max == 0) return Arrays.asList(-1);
		else return temp;
	}
	
	

}