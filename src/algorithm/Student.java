package algorithm;

public class Student {
	
	private String name; // �л� �̸�
	private String no; // �й�
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}
	// ����
	public Student(String i, String no) {
		super();
		this.name = i;
		this.no = no;
	}
	
	
	
	
}
