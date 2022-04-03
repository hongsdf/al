package algorithm;

import java.util.*;

// �ٽɰ���
/* 2D : List<Map<String,Integer>> list_map */
// 1D : Map<String,Integer> ���� ����
// for(){ list_map.add() <-- Map�� �־���Ѵ�
// for(){ list_map.add(new HashMap<String,Integer>())

/*map.entryȰ����*/
// list_map.get(row).get(sb.toString()) : sb == "AB"��� ("AB":1) ���� ����
// list_map.get(row) �� List�� ��
               // .get(sb.toString()) �� list��ȿ��� map��� �����Ǿ��ִ� ==> �� map�� �� sb(Ű ��)
// Ȯ�� �ݺ���
	// list_map.get(row).entrySet() : list�� ���� ���ҵ��� entry�� ���´�
	// for( Map.Entry<String,Integer> entry :list_map.get(row).entrySet() )


// �� �ڸ��� �����Ұ��ΰ� ? �ƴѰ�?
//	ABCD�� ������ �� �ڸ��� A�� ����üũ-> B����üũ-> C ����üũ-> D���� üũ( 2^n) 16����
//	�����Ѵٰ� �ؼ� pos�� �̵����� �ʴ� ���� �ƴϴ�
//	*����Լ�
//	combine(c,pos+1,sb.append(c[pos]))  pos+1 ��ġ�̵� �� ���� ��ġ �߰� (������)

public class Menu_Kakao__Map_recurive_2 {
	public static void main(String[] args) {
		Solution3 m = new Solution3();
		
		String[] orders = {"ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"};
		int[] course = {2,3,4};
		String[] ans = m.solution(orders,course);
		for(String a :ans) System.out.print(a+" ");
	}
}
class Solution3 {
	
	List<Map<String,Integer>> list_map = new ArrayList<Map<String,Integer>>();
	int[] MaxCnt = new int[11];
	
	/* 
	 * course : ���� �ñ��� Ƚ��
	 */
	
	
    public String[] solution(String[] orders, int[] course) {
        // 2d ���� : "ABCGF" -> 1,2,3,4 ���� �Ҽ� �ְ�
    			 //  "AC" -> 1,2,3,4 ���� ����
    	         // "CDE"  -> 1,2,3,4 ���� ����
//    	["ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"]
//    	[2,3,4]
//    	["AC", "ACDE", "BCFG", "CDE"]
        
    	
    	for(int i=0;i<11; i++) {
    		list_map.add(new HashMap<String,Integer>());
    	}
    	
    	
    	
        
        // �������� ����
        for(String order:orders) {
        	char c[] = order.toCharArray();
        	Arrays.sort(c);
        	// order �ϳ� ���캸�� *StringBuilder()�� ���� �˾ƺ��� == String
        	comb(c,0,new StringBuilder());
        }
    	List<String> list = new ArrayList<>();
        for(int cours :course) {
        	for(Map.Entry<String,Integer> entry : list_map.get(cours).entrySet() ){
        		if(entry.getValue() >= 2 && entry.getValue() == MaxCnt[cours]) {
        			list.add(entry.getKey());
        		}
        	}
        }
        Collections.sort(list);
        
        String[] answer = new String[list.size()];
        for(int i =0; i<list.size(); i++) {
        	answer[i] = list.get(i);
   
        }
        return answer;
    }

	private void comb(char[] c, int pos, StringBuilder sb) {
		// ��� ������ ����
		if(pos >= c.length) { // �ش� "ABCD"�� �� ���Ǳ�
			int size = sb.length(); // �� �������� ����
			if(size >= 2) { // 2�̻��̸� 
				int cnt = list_map.get(size).getOrDefault(sb.toString(),0) + 1;
				list_map.get(size).put(sb.toString(), cnt);
				MaxCnt[size] = Math.max(MaxCnt[size], cnt);
			}
			return;
		}
		
		
		// pos+1 �������� �̵� ��Ű��, �ϴ� ������ �����ǰ��� ���Խ�Ų��
		comb(c,pos+1,sb.append(c[pos])); // �ؼ� :  c�迭���� ABC-> B���� ���Խ�Ų�ٸ� -> A( c[pos] )+B = AB
		// �ʱ�ȭ ���־���� (����) AB�� �̹� ��� �����Ƿ�
		sb.setLength(sb.length()-1); //AB -> A��  �迭���Ҹ� �ڸ��� => ���� ���
		// �ϴ� �������� �̵��ϰ� ���� ��Ű�� �ʴ´�
		comb(c,pos+1,sb); // ���� ��Ű�� �ʴ� ���
		
	}
}