package datastructure;

import java.util.LinkedList;
import java.util.Queue;

class aq{
	int Front;
	int rear;
	int capacity;
	int[] temp;
	
	aq(int capacity){
		this.Front = -1;
		this.rear  = -1;
		this.capacity = capacity;
		temp = new int[capacity];
	}
	
	boolean full() {
		// ���� �ִ� ��
		return rear == capacity -1; // true :������ ����, false :�������� ����
	}
	boolean emptyis() {
		if(rear == Front) {
			Front = -1;
			rear  = -1;
			
		}
		return this.rear == this.Front;
	}
	//ť�� �����͸� ����ִ� �Լ�
	public void enqueue(int element) {
		if(full()) { // ������ ä��� ����
			System.out.println("Queue is Full!");
			return; // �ٷ� ����
		}
		// ���� ������ �ִٸ�
		rear = (rear+1) % this.capacity; // (rear + 1)  % ���뷮 => 0�� ���� 9���� ä��� 
//		+1�� �ϴ� ���� �ε����� 0������ �����ؼ�
		temp[rear] = element;
	}
	// ť���� �����͸� ���� �۾�
	public Object dequeue() {
		if(emptyis()) {
			System.out.println("Queue is empty");
			return null;
		}
		// ù���� ������ ����
		Front = (Front+1) % this.capacity;
		return temp[Front];
	}
	// ť�� peek()
	public Object peek() {
		if(emptyis()) {
			System.out.println("Queue is empty");
			return null;
		}
		
		return temp[Front+1];
	}
	// ������ ������ ���2
	public Object Remove() {
		if(emptyis()) {
			System.out.println("Queue is empty");
			return null;
		}
		Front = Front+1 % capacity;
		return temp[Front];
	}
	public int size() {
		
		return Math.abs((rear+1) - (Front+1 ) ); // �����͸� ���� ���� rear�� �� ũ�� �ȴ�
	}
	public void clear() {
		if(emptyis()) {
			System.out.println("�̹� ����� �ִ�");
		}else {
			Front = -1; // ������� �ʱ�ȭ
			rear  = -1; // ���� �ʱ�ȭ
			temp = new int[capacity]; //����ũ��� ���� �ӽù迭 �ʱ�ȭ
			System.out.println("clear");
		}
	}
    
}


public class Queue2 {
	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
		
	}
}
