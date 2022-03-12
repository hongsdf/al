package Strings;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;


public class TreeMap1 {
	public static void main(String[] args) {
		// key�� value�� Ÿ�����δ� �⺻ Ÿ��(byte, short, int, float, double, boolean, char)�� ����� ������,
//		Ŭ���� �� �������̽� Ÿ��, ���ʸ��� ��� �����ϴ�.
		Map<String,Integer> TreeMap2 = new TreeMap<String,Integer>();
		TreeMap<String,Integer> TreeMap = new TreeMap<String,Integer>();
		
		Map<String,Integer> tm = new HashMap<>();
		// TreeMap�� ��� ���� ������ tm1�� ���� (<key, value Generic Ÿ���� ���� ���ƾ��Ѵ�>)
		Map<String,Integer> tm1 = new HashMap<>(TreeMap);
		TreeMap<Integer,String> tm2 = new TreeMap<Integer,String>(){{
			put(1,"a");
			put(5,"c");
			put(2,"b");
		}};
		
		System.out.println("tm2 : "+tm2);
		// TreeMap �߰�
		TreeMap.put("���",1);
		TreeMap.put("����",30);
		TreeMap.put("�������",260);
		
		System.out.println(TreeMap) ;
		
		// TreeMap ����
//		TreeMap.remove("���");
//		System.out.println(TreeMap) ;
		
		
		Integer n = TreeMap.get("���");
		System.out.println(n);
		System.out.println(TreeMap.firstEntry());
		System.out.println(TreeMap.lastKey());
		System.out.println(TreeMap.firstKey());
		
		Set<Entry<String,Integer>> set = TreeMap.entrySet() ;
		
		for(Entry<String, Integer> e:set) {
			System.out.println(e.getKey()+" : "+ e.getValue());
		}
		System.out.println();
		// Iterator �ݺ��� : entry��ü�� �ϳ��� ��������
		Iterator<Entry<String,Integer>> ent = TreeMap.entrySet().iterator();
		while(ent.hasNext()) { 
			System.out.println(ent.next());
		}
		System.out.println("ceilingEntry  :  ���޵� Ű�� ������ ���  ������-> ���޵� Ű���� ū Ű�����߿��� ���� ���� Ű�� entry��ȯ ");
		Entry<String,Integer> en = TreeMap.ceilingEntry("��");
		
			System.out.println(en);
		System.out.println("ceilingKey : ���޵� Ű������ ū Ű�鿡�� �������� Ű�� ��ȯ");
		String s = TreeMap.ceilingKey("��");
		System.out.println(s);
		
		boolean flag = TreeMap.containsKey("��");
		System.out.println(flag);
		
		
		boolean flag2 = TreeMap.containsValue(30);
		System.out.println(flag2);
		
		System.out.println("replace  : key�� ���� ��ü");
		TreeMap.replace("����", 100);
		System.out.println(TreeMap);
		
		
		
		
		// treemap �����ϱ����� ���� 
		NavigableMap<String, Integer > navi = new TreeMap<>();
		navi.put("A", 1);
		navi.put("b", 3);
		navi.put("B", 2);
		navi.put("C", 5);
		
		System.out.println(navi);
		System.out.println(navi.descendingKeySet());
		System.out.println();
		// SortedMap<K,V> : �ش� MAP���� fromKEY���� TOkey���� ��ȯ�� ��, toKEY�� ���� x
		 TreeMap<Integer, String> tm11 = new TreeMap<Integer, String>();
		 SortedMap<Integer, String> sm = new TreeMap<Integer, String>(); // �κ� map����
	      tm11.put(18, "violet");
	      tm11.put(12, "red");
	      tm11.put(14, "violet");
	      tm11.put(16, "green");
	      tm11.put(20, "blue");
	      
	      System.out.println(tm11);
	      
	      System.out.println("Gett a portion of TreeMap: ");
	      sm = tm11.subMap(12, 18); // �κ� map�� �������� ���
	      System.out.println("Sub map values are: " + sm);
		
	      System.out.println("====");
	      
	      TreeMap<Integer, String> t1 = new TreeMap<>();
	      t1.put(1, "����");
	      t1.put(3, "Ʈ���̼�");
	      t1.put(5, "����");
	      t1.put(7, "��");
	      System.out.println(t1);
	      SortedMap<Integer, String> st1 = new TreeMap<>();
	      st1 = t1.subMap(1, 5); // key�� ����
	      System.out.println(st1);
	}
	
	

}
