package Strings;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSet1 {
	public static void main(String[] args) {
		
		Set<String> hashSet = new HashSet<String>();
		Set<String> treeSet = new TreeSet<String>();
		Set<String> linkedHashSet = new LinkedHashSet<String>();
		
		System.out.println("hashSet : �ߺ�x , ���� x -> �⺻���� set ���� ����");
		hashSet.add("a");
		hashSet.add("b");
		hashSet.add("c");
		
		System.out.println(hashSet);
		Iterator<String> iter = hashSet.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		System.out.println("treeSet :  ���� Ʈ�� Ž���� --> �������� �ڵ�����");
		treeSet.add("abccc");
		treeSet.add("ab");
		treeSet.add("ac");
		treeSet.add("ad");
		System.out.println(treeSet);
		Iterator<String> iterator = treeSet.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
				
		linkedHashSet.add("w");
		linkedHashSet.add("a");
		linkedHashSet.add("c");
		linkedHashSet.add("b");
		linkedHashSet.add("b");
		
		System.out.println("linkedHashSet �Է¼������ ����" );
		Iterator<String> it = linkedHashSet.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
				

			
//		System.out.println();
//
//		// set���� ���� ��ü ���� �Ұ�
//		linkedHashSet.add("a");
//		linkedHashSet.add("a");
//		linkedHashSet.add("c");
//		linkedHashSet.add("b");
//				
//		Iterator<String> linkedIter = linkedHashSet.iterator();
//				
//		while(linkedIter.hasNext()) {
//			System.out.println(linkedIter.next());
//		}
	}

}
