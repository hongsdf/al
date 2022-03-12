package Strings;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;
import java.util.TreeMap;

public class Map1 {
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<>();
		Map<String,Integer> hashTable = new Hashtable<>();
//		Map<String,Integer> Properties = new Properties<String,Integer>();
		Map<String,Integer> TreeMap = new TreeMap<>();
		Map<String,Integer> LinkedHashMap = new LinkedHashMap<>();
		
		map.put("A", 90);
		map.put("B", 80);
		map.put("C", 79);
		
		boolean res1 = map.containsKey("A");
		boolean res2 = map.containsValue(90);
		
		map.get("B");
		map.get("D");
		
		if(map.isEmpty()) {
			System.out.println(" ��� ����");
		}
		
	
		Set<String> key = map.keySet();
		for(String k: key) {
			System.out.println(k);
		}
		System.out.println();
		Set<String> set = map.keySet();
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		Set<Entry<String, Integer>> entry = map.entrySet();
		for(Entry<String, Integer> e : entry) {
			System.out.println(e.getKey() + " : " + e.getValue());
		}
		// collections.value() :  ��� ������ ���
		System.out.println(map.values());
		// ��� entry(key, value) ����
//		map.clear();
		// getOrDefault(key,value) : �ش� key ���� ������ �״�� ��� ������ value�� ��ȯ �� map�� ��������� �ʴ´�.

		System.out.println();
		Integer flag = map.getOrDefault("D", 1);
		
		System.out.println(flag);
		System.out.println( map);
		
		System.out.println("putIfAbsent : key���� �ִ� ���� get , key�� ������ value�� ��ȯ�ϰ� ������ key��value�� map�� �߰�");
			map.putIfAbsent("G", 2);
		System.out.println(map);
//		Object getOrDefault(Object key, Object defaultValue)
	}
	
}
