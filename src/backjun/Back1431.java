package backjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
// ���� �ʿ� ����(�ؿ�)
class compareObject implements Comparator<String>{
	int sum = 0;
	int sum2 = 0;
	@Override
	public int compare(String o1, String o2) {
		// �ٸ� ���
		if(o1.length() != o2.length()) {
			return o1.length() - o2.length();
			
	    // ���ڿ����̰� �������(���ڿ��ȿ��� ���ڸ� �̾� ���ϱ�)
		}else if(o1.length() == o2.length()) {
			int o1sum = getSum(o1);
			int o2sum = getSum(o2);
			// getSum �Լ��� �����Ͽ� ��
			// ���� ��� ����
			if(o1sum != o2sum) {
				return o1sum - o2sum;
			}
			// �� ����� ���� ��� ���ڿ� ��
			else {
				return o1.compareTo(o2);
			}
			

		} //�׿�
		else {
			return o1.compareTo(o2);
		}
	}
	// ���ڿ����� ���ڸ� �̾Ƴ���
	public int getSum(String o1) {
		int length = o1.length();
		sum = 0;
		for(int i =0; i <length; i++) {
			// ���ڿ����� ���ڸ� ��������
			// �̰��� �´� ǥ��(*���� �ʿ�)
			if((o1.charAt(i) -'0') <= 9 && (o1.charAt(i) -'0') >= 0) {
				sum += o1.charAt(i) - '0';
			}
			
			
//			if(o1.charAt(i) <= '9' && o1.charAt(i)  >= '0') {
//				sum += o1.charAt(i);
//			}
		}
		
		return sum;
	}
	
}



public class Back1431 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] str = new String[n];
		for(int i =0; i<n; i++) {
			str[i] = br.readLine();
		}
//		for(int i =0; i<n; i++) {
//			System.out.println(str[i]);
//		}
		
		List<String> list = new ArrayList<String>(Arrays.asList(str));
//		for(int i =0; i<list.size(); i++) {
//			System.out.println(list.get(i));
//		}
		Collections.sort(list,new compareObject());
		
		for(int i =0; i<list.size() ; i++) {
			System.out.println(list.get(i));
		}
	}
}
