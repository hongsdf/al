package GraPhrithm;

import java.util.*;

public class programers_2_3 {
	public static void main(String[] args) {
		Solution3 m = new Solution3();
		m.solution("017");
		m.solution1(017);
	}
	
	
}
class Solution3{
	
	int answer;
	// ��Ʈ��ŷ �߿���
	boolean visit[] = new boolean[10]; // 1. �������� �ʿ��� boolean ũ��(0 ~ 9)
	List<Integer> list = new ArrayList<>();
	
	
	
	public int solution(String numbers) {
		int answer = 0;
		String tmp = "";
		for(int size = 0; size<numbers.length(); size++) {
			dfs(numbers,tmp,size+1);
		}
		for(int j = 0; j < list.size(); j++) {
			check(list.get(j));
		}
		
		
		return answer;
	}

	///////////////////

 //  String��������ȯ�ϰ� ���� int �� ������ �� �����Ƿ� string���� �ϱ�
	public void solution1(int num) {
		String temp ="";
		String s = String.valueOf(num);
		for(int i = 0; i <s.length(); i++) {
			
		}
		
		
		
	}

/////////////////////////

	private void check(Integer num) {
		if(num == 0 || num == 1) return;
		for (int i =2 ; i<num; i++ ) {
			if(num%i == 0) return;
		}
		answer++;
		
	}



	// (ã�� ���� ���ڿ�, ���� ����, ���� ũ�� )
	private void dfs(String numbers, String temp, int size) { 
	if(temp.length()== size) { // �ּ��� �ѱ���
		int n = Integer.parseInt(temp);
		if(!list.contains(n)) { // �ߺ��� �����ϱ� ���� ���
			list.add(n);
		}
		return;
	}else {
		for(int i = 0; i <numbers.length(); i++) {
			if(!visit[i]) { // �ش���� �� ĭ üũ
				visit[i] = true; // �� ���� 
				temp += numbers.charAt(i); // �ش���ڸ� ����
				// ���� ���� �� ��ġ����
				dfs(numbers,temp, size);
				
				visit[i] = false; //  �ٽ� ����
				temp = temp.substring(0,temp.length()-1); // ���ڼ� (����) 
			}
		}
	}
	
	
		
	}
}