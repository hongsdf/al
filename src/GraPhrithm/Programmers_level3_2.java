package GraPhrithm;

import java.util.*;


public class Programmers_level3_2 {
	public static void main(String[] args) {
		Solution3_3_2 m = new Solution3_3_2();
		String[][] tickets = {{"ICN", "SFO"}, {"ICN", "ATL"}, {"SFO", "ATL"}, {"ATL", "ICN"}, {"ATL","SFO"}};
		m.solution(tickets);
	}
}

class Solution3_3_2 {
	boolean visitied[];
	String[] answer = {};
    public String[] solution(String[][] tickets) {
      
        Arrays.sort(tickets,new Comparator<String[]>() {

			@Override
			public int compare(String[] o1, String[] o2) {
				if(o1[0].equals(o2[0])) {
					return o1[1].compareTo(o2[1]) ;
				}
				return o1[0].compareTo(o2[0]);
				
			}

			
        	
        });
        
        // ������ ã��
//        int idx = 0;
        List<String> list = new ArrayList<>();
        visitied = new boolean[tickets.length];
        list.add("ICN"); // �ְ� ���� �������� ICN �����̹Ƿ�
        backTrake("ICN",list,tickets,0); // ��������, �������, Ƽ��, cnt(Ƽ�� ���� == tickets.len)
        
        
        return answer;
    }

	private void backTrake(String start, List<String> list, String[][] tickets, int cnt) {
		if(answer.length > 0) return; // answer�� �̹� �ϼ��Ǹ� ��Ʈ��ŷ�� ���Ƶ� ����� ���� ���� �ʴ´�.
		
		if(cnt == tickets.length) { // Ƽ���� ����ϸ� �׶� answer�� ��� listũ�� ��ŭ
			answer = new String[list.size()];
			for(int i = 0; i <list.size(); i++) {
				answer[i] = list.get(i);
			}
			
			return; // ������ �ٽ� ���ư�
		}
		
		
		
		
		for(int i = 0; i <tickets.length; i++) {
			// ó�� �������� ���� ���� ã�´� && �湮���� ���� Ƽ��
			if(tickets[i][0].equals(start) && !visitied[i]) {
				visitied[i] = true; // Ƽ�� ���
				list.add(tickets[i][1]); // ������ �����ϰ�
				backTrake(tickets[i][1],list,tickets,cnt+1); // �������� �������� �ȴ�. cnt++
				visitied[i] = false; // Ƽ�� ��� ����
				list.remove(list.size() -1); // ������� -1
				
				
			}
			
		}
	}
}   