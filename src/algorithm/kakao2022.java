package algorithm;

import java.util.*;

class Kakao1 {
    public int[] solution(String[] id_list, String[] report, int k) {  
        // �Ű��� ��� �������� ���� ����� ���Ϸ� �߼��մϴ�.
        // �Ű��� ��� := report
        
        // �Ű� ���� ��ϻ��� := a <- b,c ������ b,c���� ������ ����.
        
        // �ߺ��� �Ű����� ����
        
        // �ѻ���� ��������� �Ű� �Ҽ� ������, ������ ����� 1�� ���
        // HashSet<String>() := ������ ����� �Ű� �Ҽ� ����
        HashMap<String,HashSet<String>> reportMap = new HashMap<>();
        
        // �Ű� ���� ���
        HashMap<String,HashSet<String>> ret = new HashMap<>() ;
        
        // �Ű� ��� (report) �ޱ�
        for(String s : report){
           String[] str  = s.split(" ");
            if(!reportMap.containsKey(str[0])){
                reportMap.put(str[0],new HashSet<>());
            }
            reportMap.get(str[0]).add(str[1]);
            
            //�Ű� ���� ��� �� ���� ǥ��
            
            if(!ret.containsKey(str[1])){
                ret.put(str[1],new HashSet<>());
            }
            ret.get(str[1]).add(str[0]);
        }
        
        int answer[] = new int[id_list.length];
        
        for(int i = 0; i <id_list.length; i+=1){
            String user = id_list[i];
            if(!reportMap.containsKey(user)) continue; // �Ű��� ������ ���ٸ�
            
            for(String p1 : reportMap.get(user)){
                if(ret.get(p1).size() >= k){
                    answer[i]+=1;
                }
            }
        }
        
        
        
        return answer;
    }
}