package backjun;

import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;

public class Test_2 {

	public static void main(String[] args) {
		// Map ����
		Map<Integer, String> testMap = new HashMap<Integer, String>();
 
		// Map�� ������ �߰�
		testMap.put( 1, "apple");
		testMap.put( 4, "pineapple");
		testMap.put( 2, "orange");
		testMap.put( 5, "strawberry");
		testMap.put( 3, "melon");

		// Ű�� ����
		Object[] mapkey = testMap.keySet().toArray();
		Arrays.sort(mapkey);

		// ��� ���
		for (Integer nKey : testMap.keySet())
		{
			System.out.println(testMap.get(nKey));
		}
	}

}