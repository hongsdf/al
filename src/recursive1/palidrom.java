package recursive1;

public class palidrom {
	public static void main(String[] args) {
		String s = "avvaaa";
		boolean flag = pal(s);
		System.out.println(flag);
		
		
		
		
		
		
		
		
	}
	public static boolean pal(String a) {
		// base-case
		if(a.length() ==0 || a.length() ==1) {
			return true;
		}
		if(a.charAt(0) == a.charAt(a.length()-1)) {
			// ������ �糡���� ��ĭ�� �ٿ� �ٽ� recursive()
			return pal(a.substring(1,a.length()-1));
		}
	
		
		
		return false;
	}
	// ���� ����
	//    y -> true
	//   aya -> true
	//  kayak -> true
	
//	*  return  true
	
}
