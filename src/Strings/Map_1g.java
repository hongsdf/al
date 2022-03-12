package Strings;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Map_1g {
	public static void main(String[] args) {
		HashMap<String,Integer> hashmap = new HashMap<>();
		hashmap.put("aB", 32);
		hashmap.put("A", 0);
		hashmap.put("Z", 01);
		hashmap.put("C", 032);
		hashmap.put("VN", 011);
		
		System.out.println(hashmap);
		
		TreeMap<String,Integer> treemap = new TreeMap<>();
		treemap.put("a", 1);
		treemap.put("va", 3);
		treemap.put("b", 90);
		treemap.put("aa", 0);
		treemap.put("n", 1000);
		
		System.out.println(treemap);
		
		System.out.println("entry Ȱ�� <- entrySet()");
		Set<Entry<String,Integer>> entry = hashmap.entrySet();
		for(Entry<String,Integer> e : entry) {
			System.out.println("key :"+e.getKey());
			System.out.println("value :"+e.getValue());
			
		}
		System.out.println("iterator ��� <-keySet() ");
		Iterator<String> iter = treemap.keySet().iterator();
		while(iter.hasNext()) {
			String s = iter.next();
			System.out.println("key:"+s+"value:"+treemap.get(s));
		}
		System.out.println("hashmap.values ���");
		System.out.println(hashmap.values());
		System.out.println(treemap.values());
		
		int flag = hashmap.getOrDefault("aB", 123);
		hashmap.put("bbb",flag);
//		System.out.println(flag);
		
		System.out.println(hashmap);
		
		// putIfAbsent :key�� ���� ������ value�� ��ȯ , ������ key�� value�� ����
		hashmap.putIfAbsent("C", 1000);
		System.out.println(hashmap);
	}
	
	

}
