package algorithm;

import java.util.ArrayList;
import java.util.Scanner;

public class No1_StudentInfo {
	public static void main(String args[]) {
		Student stu1 = new Student("ȫ�浿","001");
		Student stu2 = new Student("��浿","002");
		Student stu3 = new Student("�ձ浿","003");
		
		ArrayList<Student> list = new ArrayList<>(); // �л�Ŭ������ arrylist�� list�� ����
		
		list.add(stu1);
		list.add(stu2);
		list.add(stu3);
//		System.out.println(list.add(stu2));
		
		
//		
//		for(Student st : list) {
//			System.out.println(st.getName()); // �л� �̸� ��������
//			System.out.println(st.getNo()); // �й� ��������
//		}
//		
//		 'y' or 'n' ���
		Scanner sc = new Scanner(System.in);
		
		
		
			
		while(true) {
			System.out.println("�˻��Ͻ÷��� y �ƴϸ� n�� �Է��ϼ���");
			String in = sc.next();
			
			if(in.equals("y")) {
				System.out.println("�˻��� �����մϴ�");
				System.out.println("�л��̸��� �˻��Ͻÿ�");
				boolean flag = false;
				String name = sc.next();
					for(Student st : list) {
						if(st.getName().equals(name)) {
							System.out.println(name + "�� �й��� : "+ st.getNo() + "�Դϴ�");
							flag = true; // flag�� true�� �ƴϸ� �������� �˻� x
						}
						
						
					}
				if(!flag) { // flag : Ȯ�ο��� => !flag : false
					System.out.println("�ش� �л�����"); break;
				}
			}
			else if(in.equals("n")) {
				break;
			}
			
		}
		System.out.println("����");
	}
}
