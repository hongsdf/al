package backjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


class ComparatorStringlength implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		// ���ڿ� ���̰� ���� ���
		if(o1.length() == o2.length()) { 
			// compareTo : ���ڿ��� �⺻������ ���� �Ǿ����� o1.compareTo(o2) �ϰ� �Ǹ� ���������� ������ ��
			// o1 > o2 : ���� ����
			// o2> o1 : ���� ����
			return o1.compareTo(o2);
		// ���ڿ� ���̰� �ٸ�
		}else {
			// �׷��� ���̷� �����϶�
			return o1.length() - o2.length();
		}
		
	}
	
}


public class Back1181 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
//		String str[] = new String[n];
		// �ߺ� ������ ���ֱ� ���� set ���
		Set<String> set = new HashSet<>();
		for(int i =0; i<n; i++) {
			String s = br.readLine();
			if(!set.contains(s)) {
				set.add(s);
			}
		}
		
//		Iterator<String> iter = set.iterator();
//		while(iter.hasNext()) {
//			System.out.println(iter.next());
//		}
		
	
//		for(int i =0; i <n; i++) {
//			str[i] = br.readLine();
//		}
		// ���ο� ���� ���� ����
//		Arrays.sort(str,new ComparatorStringlength() {
//		
//		
//		});
		// set�� �����ϱ� ���ؼ� list�� �����ؾ��Ѵ�
		List<String> list = new ArrayList<String>(set);
		// �׷��� list ����
		Collections.sort(list, new ComparatorStringlength());
		
//		for(int i =0; i <n; i++) {
//		
//			System.out.println(str[i]);
//		}
		for(String s: list) {
			System.out.println(s);
		}
	}
}
