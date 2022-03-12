package Sort;

public class Comparable_2 {
	public static void main(String[] args) {
		
	
	Student s1 = new Student(20, "abcd");
	Student s2 = new Student(30, "ab");
	
	int ans = s1.compareTo(s2);
	
	System.out.println(ans);
	
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

class Student implements Comparable<Student> {
	// �ʿ��� �ڷ��
	int age; // ����
	String name; // �̸�
	
	Student(int age,String name) {
		this.age = age;
		this.name = name;

	
}

	@Override
	public int compareTo(Student o) {
		if(this.age > o.age) {
			return 1;
		}
		else if(this.age == o.age) {
			return 0;
		}
		else return -1;
	}
	
} 