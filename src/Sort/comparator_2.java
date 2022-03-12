package Sort;

import java.util.Comparator;

public class comparator_2 {
	public static void main(String[] args) {
		Student3 s1 = new Student3(10, 1, "��浿");
		Student3 s2 = new Student3(20, 1, "�ʱ浿");
		Student3 s3 = new Student3(30, 2, "���浿");
		
		int ans = s3.compare(s1, s2);
		
		if(ans > 0) {
			System.out.println("s1 �� �� Ů�ϴ�");
		}
		else if(ans == 0) {
			System.out.println("���̰� ����");
		}else {
			System.out.println("s2 �� �� ũ��");
		}
		
	}
}
class Student3 implements Comparator<Student3>{
	// �ʿ��� ���
	int age; // ����
	int grade; // �г�
	String name; // �̸�
	
	Student3(int age,int grade, String name){
		this.age = age;
		this.grade = grade;
		this.name = name; 
	}

	@Override
	public int compare(Student3 s1, Student3 s2) {
		if(s1.age > s2.age) {
			return 1;
		}else if(s1.age == s2.age) {
			return 0;
		}else {
			return -1;
		}
		
	}
	
}