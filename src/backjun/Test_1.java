package backjun;

import java.util.*;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;

public class Test_1 {
	public static void main(String[] args) {
		
		
		HashMap<String,Integer> hash = new HashMap<>();
		String arr[] = {"a","b","a","a","c"};
		for(int i =0;i<arr.length; i++) {
			if(hash.containsKey(arr[i])) { 
				int cnt = hash.get(arr[i]);
				hash.put(arr[i], cnt+1);
			}else { // ó�� ���� : ���� ���� ������
				hash.put(arr[i], 1);
			}
		}
		System.out.println(hash);
		System.out.println("============");
		Iterator<Entry<String, Integer>> it = hash.entrySet().iterator(); // *entrySet():set(hash�� <k,v>)
		while(it.hasNext()) {
			Entry<String, Integer> entry = it.next(); //���� ����
			System.out.println(entry.getKey() + " : "+entry.getValue());
		}
		
	}
}
