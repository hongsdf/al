package GraPhrithm;
import java.util.*;


public class Programmers_level3 {
	
	
	public static void main(String[] args) {
		Solution3_1_3 m = new Solution3_1_3();
		String[] words = {"hot", "dot", "dog", "lot", "log", "cog" }; 
		m.solution("hit", "cog", words);
	}
}
class Solution3_1_3 {
	int answer = 51; // �������� words�� ���̴� 50����� �Ѵ�. 50���� ��� ���� ��ȯ�Ҽ� �ִٰ� �ϸ� �ʱⰪ ����
	boolean visit[];
    public int solution(String begin, String target, String[] words) {
    	// ��Ʈ��ŷ�� �������? ��� ��츦 Ž���� �����ϴ� (�� ��ġ�� �ڷ� ��ȯ�ϸ� ���� ���� ������ ����)
//    	 => O O O O
//	      	=> O O O X
//	    		  => O O X O
//	    		  => O O X X
//	    		  		 	=> O X O O
//	    		  		 	=> O X O X
//	    		  		 	=> O X X O
//	    		  		 	=> O X X X
//	    		  		 	
//    							=> X O O O
//    							=> X O O X
//    							=> X O X O
//    							=> X X O O 
//    							=> X X O X
//    							=> X X X O
//    							=> X X X X
    	// hit -> hot -> dot -> dog -> cog
//    	              -> lot -> log -> cog
    	
    	// hit -> hot    -> dot  		-> dog
    	// 							 			->	cog
    	//                    		    -> log 
    	//                                    
    	//                           			-> cog
    	//                 	dog
    	//               	cog
    	//                 :    
    	
    	//     -> dot
   	    //     -> dog
    	//     -> cog
    	//         :
    	visit = new boolean[words.length]; // �� ���ڸ� ������ ���� üũ
    	backTrake(begin,target,words,0);
    	
    	
    	return answer == 51? 51:answer ;
    }
    // ���������� ����Ǵ� ��Ʈ��ŷ���
	private void backTrake(String begin, String target, String[] words, int cnt) {
		if(begin.equals(target)) {
			answer = Math.min(answer, cnt);
			return;
		}
		
		// ������ �ִ�(�ֳĸ� dog,log,dot.. ��� ���� �����ϴ����� ���� answer�� �޶����Ƿ�)
	    // �����̹Ƿ� ������ġ���� ���� 
		for(int i = 0; i < words.length; i++) {
			if(!visit[i] && check(begin,words[i])) { // (������ġ, �񱳴��) : (check ) ��ĭ ���̳��ٰ� �ϸ�
				visit[i] = true;
				// ������ġ�� ����ȴ� *�̰��� �ٽ�
				backTrake(words[i],target,words,cnt+1);
				visit[i] = false;
			}
		}
		
		
	}

	private boolean check(String key, String begin) {
		int cnt = key.length();
		for(int i = 0; i <key.length(); i++) {
			if(key.charAt(i) == begin.charAt(i)) {
				cnt--;
			}
		}
		
		return cnt == 1? true:false ;
		
	}
}