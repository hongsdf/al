package algorithm;

import java.util.*;

public class Menu_Kakao__Map_recurive_ {
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<>();
		map.put("ȫ�浿1", 1);
		map.put("ȫ�浿2", 2);
		map.put("ȫ�浿3", 3);
		// default ����
		map.getOrDefault("ȫ�浿1", 4);
		
		System.out.println(map.get("ȫ�浿1"));
		
		
		// entry Ȱ�� ��
		for( Map.Entry<String,Integer> entry  : map.entrySet()) {
			if( entry.getValue() >= 2) {
				System.out.println(entry.getKey() );
			}
		}
		
	}
}
