package BackBasic;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

// stack �޼��带 �����ϴ� ����� ���� �ۼ��� ����
/*	push X: ���� X�� ���ÿ� �ִ� �����̴�.
	pop: ���ÿ��� ���� ���� �ִ� ������ ����, �� ���� ����Ѵ�. ���� ���ÿ� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
	size: ���ÿ� ����ִ� ������ ������ ����Ѵ�.
	empty: ������ ��������� 1, �ƴϸ� 0�� ����Ѵ�.
	top:������ ���� ���� �ִ� ������ ����Ѵ�. ���� ���ÿ� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
 * */
public class Stack3 {
	static int[] stack = new int[1001]; // N�� 1000�̶��
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		// ��� BufferedWriter()
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = sc.nextInt();
		stack = new int[T];
		int size = 0;
		
		while(T --> 0) {
			String command = sc.next(); // push(1) x(2) ��� ������ �����Ͽ� 2�� ���� �Է� ==> push + num ���ٿ� 2�� �ܾ� �Է°���
			if(command.equals("push")) {
				int num = Integer.parseInt(sc.next());
				// push x �̷��� �̾ ���´� sc.next()�� �̿��� ���� ���ڸ� �޴´�.
				stack[size++] = num;
			}else if(command.equals("pop")) {
				if(size == 0) { // size�� 0�̾ƴ϶�� ���� ������� ����
//					System.out.println(-1);
					bw.write("-1\n");
				}else { // ���� �������� ���� ���� ã��
//					System.out.println(stack[size-1]);
					bw.write(stack[size-1]+"\n");
					size--; // size�� ���δٴ� ���� ����
				}
			}else if(command.equals("size")) {
//				System.out.println(size);
				bw.write(size+"\n");
			}else if(command.equals("empty")) {
				if(size == 0) { // ���̰� 0�̶�� ���� ��� �մ�.
//					System.out.println(1);
					bw.write("1\n");
				}else {
//					System.out.println(0);
					bw.write("0\n");
				}
			}else if(command.equals("top")) {
				if(size == 0) {
//					System.out.println(-1);
					bw.write("-1\n");
				}
				
				else {
//					System.out.println(stack[size-1]);
					bw.write(stack[size-1]+"\n");
				}
			}
			
		}
		bw.flush(); // �Է� ���� ��ũ
	}

}