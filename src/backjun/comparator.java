package backjun;

import java.util.Comparator;

public class comparator {
	public static void main(String[] args) {
		Student2 st1 = new Student2(20, 1, "ȫ�浿");
		Student2 st2 = new Student2(21, 2, "�浿");
		Student2 st3 = new Student2(23, 3, "�ʱ浿");
		
		// st2,st3�� ���Ѵ�  �̶� st1�� �ǹ� ����
		int ans = st1.compare(st2, st3);
		// st1�� ���ϰ� �ʹٸ�
//		int ans = st1.compare(st1, st3);
		
		if(ans > 0) {
			System.out.println("st2�� �� ũ��");
		}else if(ans < 0) {
			System.out.println("st3�� �� ũ��");
		}
		else {
			System.out.println("����");
		}
	

	
	}
	 
}
class Student2 implements Comparator<Student2>{
	// �ʿ��� ���
	int age; // ����
	int grade; // �г�
	String name; // �̸�
	
	Student2(int age,int grade, String name){
		this.age = age;
		this.grade = grade;
		this.name = name; 
	}
	
	
	@Override
	public int compare(Student2 o1, Student2 o2) { // comparable()�� �ٸ��� �ΰ�ü�� ���ϴ°� 
		if(o1.age > o2.age) {
			return 1;
		}
		else if(o1.age == o2.age) {
			return 0;
			
		}else return -1; 
		
		
	
	}
}
	
	
	

	

