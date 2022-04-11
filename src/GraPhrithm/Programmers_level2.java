package GraPhrithm;

import java.util.*;

public class Programmers_level2 {
	public static void main(String[] args) {
		Solution2_3 m = new Solution2_3();
		int [] progresses = { 95, 90, 99, 99, 80, 99} ;
		int [] speeds = {1, 1, 1, 1, 1, 1};
		m.solution(progresses, speeds);
	}
}

class Solution2_3 {
    int d[];
    Queue<Integer> q = new LinkedList<>();
    List<Integer> list;
    public int[] solution(int[] progresses, int[] speeds) {
       
        d = new int[progresses.length];
        list = new ArrayList<>();
        for(int i = 0; i <progresses.length; i++) {
            d[i] = (100 - progresses[i]) / speeds[i];
            if((d[i] % speeds[i]) != 0){
                d[i]++;
            }
        }
        // ������ ū �۾��Ⱓ���� 
        for(int period :d){
            q.add(period);
        }
        
        int standard = q.poll(); // ó�� ����
        
        int cnt = 1;
        while(!q.isEmpty()){
            if(standard >= q.peek()){
                cnt++;
                q.poll();
                
            }else{
                list.add(cnt);
                cnt = 1;
                standard = q.poll(); // �ڽź��� ū ������ ���� ����
            }
        }
         int[] answer = new int[list.size()];
        for(int i = 0; i <list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}