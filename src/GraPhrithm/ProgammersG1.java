package GraPhrithm;

import java.util.*;
public class ProgammersG1 {
	public static void main(String[] args) {
		SolutionG m = new SolutionG();
		int numbers[] = {1,1,1,1,1};
		m.solution(numbers, 3);
	}
}
class SolutionG {
    int answer = 0;
    public int solution(int[] numbers, int target) { 
  
        combine(numbers,0,0,target);
        
        
        
        
        return answer;
    }
    
    void combine(int[] numbers,int pos, int num ,int target){
        // ��Ʈ��ŷ : ������ �� Ȯ���ϰ� ���ƿ´�
    	// ������ ����o,����x ==>���⼭�� +,-�� ����
    	if(pos >= numbers.length) {
    		if(num == target)  answer++;
    		return;
    	}
    	
    	
    	num += numbers[pos]; // + ���غ���
    	combine(numbers,pos+1,num,target);
    	num -= numbers[pos]; // ����

    	num += numbers[pos] * -1;
    	
//    	numbers[pos] = numbers[pos] * -1; // �ƿ� �迭��ü�� �ٲٴ� ���� �ƴ�
//    	num += numbers[pos] * -1; // - �� ���� ���� // numbers[]�迭�� �ٲ����� �ʴ´�.
    	combine(numbers,pos+1,num,target);
         
        
    }
    
}