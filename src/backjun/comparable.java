package backjun;
public class comparable{
	public static void main(String[] args) {
//		Student st1 = new Student(30, "ȫ�浿");
//		Student st2 = new Student(20,"����");
		
		// int�� ������ ����� ���
		int max = Integer.MAX_VALUE; //  2,147,483,647(2^31)-1
		int min = Integer.MIN_VALUE; // -2,147,483,648 ( 2^31)
		Student st1 = new Student(1, "ȫ�浿");
		Student st2 = new Student(min,"����");
		
		
		int ans = st1.compareTo(st2); // 1 - (-2,147,483,648) = ����� ����
		
		if(ans > 0) {
			System.out.println("st1 �� �� ũ��");
		}
		else if(ans ==0) {
			System.out.println("����");
		}
		else {
			System.out.println("st2�� �� ũ�� ");
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
//		if(this.age > o.age) return 1;
//		else if(this.age == o.age) return 0;
//		else return -1;
			
		return this.age-o.age;
		// ���� int �� ������ ����� ���
		
	}
}
