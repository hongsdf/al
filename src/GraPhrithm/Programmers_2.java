package GraPhrithm;

import java.util.*;

public class Programmers_2 {
//	static StringBuilder sb2;
	public static void main(String[] args) {
		Solution1 m = new Solution1();
		String num = "17";
		m.solution(num);
//		sb2 = new StringBuilder();
//		sb2.append("123");
//		int num1 = Integer.parseInt(sb2.toString());
//		int n = Integer.valueOf(num);
	}
}
class Solution1 {
    int answer = 0;
//    List<String> list = new ArrayList<>();
    
    public int solution(String numbers) {
        
    char [] c = numbers.toCharArray();
   
    int n = c.length;
    // ������ �ִ� ���� �ʿ��ϴ�
    boolean visit[] = new boolean[n];
//    combine2(c,visit,0,n);
    combine(c,0,new StringBuilder());
   
    
        
    return answer;
    }
    
    
    
    // ������ �ִ� ��
    private void combine2(char[] c, boolean[] visit, int pos, int n,StringBuilder sb) {
    
    	
	
}



   // ����
	public void combine(char [] c, int pos, StringBuilder sb ){
    	if(pos >= c.length){
//    		list.add(sb.toString());
            boolean flag = check(sb); // �Ҽ� �Ǻ� �޼���
            if(flag) answer++;
            return;
        }
        
    	
    		combine(c,pos+1,sb.append(c[pos])); // ���� O
    		sb.setLength(sb.length()-1); //���� �۾�
    		combine(c,pos+1,sb); // ���� x
    		
    	
    	
        
        
    }
   
    
    public boolean check(StringBuilder sb){
       if(sb.length() == 0) return false;
       int num = Integer.parseInt(sb.toString()); // stringBuilder int�����κ�ȯ
       if(num == 1 || num ==0) return false;
       for(int i=2; i<num; i++) {
    	   if(num % i == 0) return false;
       }
    	
    	
    	return true;
    }
}