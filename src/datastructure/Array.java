package datastructure;

import java.util.*;

public class Array { // 2D �۾� : String,Integer,boolean, monkey,food.. �ٸ� ��üŸ�� �� �����Ϸ��� Object
	public static void main(String[] args) {
		ArrayList<ArrayList<Object>> list = new ArrayList<ArrayList<Object>>();
		// �и��۾� �� ��
		ArrayList<Object> data1 = new ArrayList<>();
		data1.add(1);
		data1.add(2);
		data1.add(3);
		
		ArrayList<Object> data2 = new ArrayList<>();
		data2.add("abc");
		data2.add("efg");
		data2.add("hij");
		
		ArrayList<Object> data3 = new ArrayList<>();
		data3.add(111);
		data3.add(222);
		data3.add(333);
		
		// 1���� data1,data2,data3�� �� �پ� ���� 2D
		list.add(data1);
		list.add(data2);
		list.add(data3);
		
		for(ArrayList<Object> a:list) { // �� �྿ ã��
			System.out.println(a);
		}
		
		// �ٸ� ��� ���
		for(int i =0; i <list.size(); i++) {
			for(int j =0; j<list.get(i).size(); j++) {
				System.out.print(list.get(i).get(j) +" ");
			}
			System.out.println();
		}
	}
}
