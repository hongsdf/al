package Strings;

class Main{
	public String[] word = {"zero","one","two","three","four","five","six","seven","eight","nine"};
	
	public int solution(String s) {
		int res = 0;
		String sa  = "";
		// ���� �����̳�
		for(int i =0; i<s.length(); ) {
			if(s.charAt(i) >= '0' && s.charAt(i) <= '9') {
				sa += s.charAt(i);
				i++;
			}else {
				// 10���� �ݺ��Ѵ� 
				for(int j =0; j<10; j++ ){
					if(s.startsWith(word[j], i)) {
						// ���ǹ��� ã���� ���� ���� 
						sa += j;
						i += word[j].length();
						System.out.println(j+":Ȯ��");
						// �˸��� j�� ã���� 
						break;
					}
					// �ٽ� j�� 0 ���� �ȴ� => �� ���� �����
					System.out.println(j + " �ݺ��� ����?");
					 
				}
					
				// break; // : ���⼭ �극��ũ�� �޸� else ������ �� ���ڸ� ã�� �� 
			}
			// break; : ���⼭ �극��ũ�� �޸� for(int i =0; i<s.length;) ���� �ϳ� ã���� ����
			
		}
		
		
		res = Integer.parseInt(sa);
		// ���� �����̳�
		
		return res;
		
	}
	
	
}





public class String_m1_startWith {
	public static void main(String[] args) {
		Main m = new Main();
		String s = "3zeroonenine98six"; //1019986
//		String s1 = "12034";
//		System.out.println("Ȯ��");
//		int res1 = m.solution(s1);
		System.out.println(m.solution(s));
		
		
	}
	

}
