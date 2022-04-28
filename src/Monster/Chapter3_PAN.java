package Monster;

import java.io.*;
import java.lang.*;
import java.util.*;


public class Chapter3_PAN {
	public static final Scanner scanner = new Scanner(System.in);

	public static int getUniqueRangeNumber(int[] birthDate, int n, int k)
	{
		int answer = 0;
		// �ؿ��� ������ Ŭ������ �����´�(= ���̺�)
		FrequencyTable ft = new FrequencyTable();
		// ft ���̺��� �ʵ�
		// uniqueElements ��
		// �󵵼� �迭
		
		// �����̵� ������ �ʱ�ȭ �ʿ� 
		for(int i = 0; i < k; i++) {
			//�Է� ���� ���� ������ ����
			ft.addBirthDate(birthDate[i]); // ������ �Է¹޾� �󵵼� �迭�� ����
		}
		// [1,1,1,1,1] ���� �� k == 5�̸� ��� ������ ���Ұ� �ȴ�.
		if(ft.uniqueElements == k) {
			answer +=1;
		}
		//�����̵� ������ 
		for(int i = 1; i+k-1 <n; i++) {
			ft.removeBirthDate(birthDate[i-1]); // ���� �� ����
			ft.addBirthDate(birthDate[i+k-1]); // ������ �� �߰�
			// addBirthDate, addBirthDate�� uniqueElements�� �󵵼� �迭�� �������ִ� �������� �ִ�.(�ؿ��� ����)
			if(ft.uniqueElements == k) {
				answer +=1;
			}
		}
		

		return answer;
	}

	public static void main(String[] args) throws Exception {
		int n = scanner.nextInt();
		int k = scanner.nextInt();
		int[] birthDate = new int[n];
		for(int i = 0 ; i < n ; i ++)
		{
			birthDate[i] = scanner.nextInt();
		}

		int answer = getUniqueRangeNumber(birthDate, n, k);

		System.out.println(answer);
	}

}
// ������ �����̵� ��� := 
// ���ʰ��� ���� ������ ���� �߰��Ͽ� k �迭�� ���Ҹ� Ȯ���Ѵ�.
// k������ �ߺ����� ���ٴ� ���� ������ �� == �󵵼��� 1�̴ٶ�� ���̴�.
// �׷��� �����̵� ���������� ���������
// ���ʰ��� ���� ������ ���� �־������� ������ �� �����Ѵ�.

// �ߺ� �������� �󵵼��� ������ �� �� �ִ�.(�󵵼��� 1�̶�� ���� ������ �� := �ߺ����� ���� ���� �ǹ��Ѵ�.)

class FrequencyTable // ���� Ŭ������ ����� ���� �Ѵ�.
{
	
	public static final int MAX_SIZE = 1000000; // �迭�� �ִ� ũ��

	int uniqueElements; //���� �ߺ��� �������� �ʴ� unique�� ������ ��
	int[] frequency;    //frequency[b] := ������ b�� ������ ��

	FrequencyTable(){
		this.uniqueElements = 0;
		this.frequency = new int[MAX_SIZE];
	}

	/**
	 * ���ο� ������ ����ϰ� �󵵼��� �����Ѵ�.
	 * @param birthDate
	 */
	
	void addBirthDate(int birthDate) // ������ �߰��Ȱ�� := ������ ���� ���� ��� , �ż��� ���� = ������ ���� ���Ű� �󵵼� �迭
	{
	  // uniqueElements ������ �󵵼� �迭�� ���������� �����Ѵ�.
      // uniqueElements
		int cnt = frequency[birthDate]; // �߰��� ������ �󵵼��� Ȯ���Ѵ�.
		if(cnt == 0) { // ������ 0�̾��� ������ �߰� �Ǿ� 1�̵Ǹ� ������ ���� �ȴ�.
			this.uniqueElements += 1; // this. := class FrequencyTable�� ������ ���� ����
		}else if(cnt == 1) { //������ 1�̾��� ������ �߰��Ǿ� 2�� �Ǿ� ������ ���� �ƴϰ� �ȴ�.
			this.uniqueElements -=1;
		}
		
	
		
	  // �󵵼� �迭
		// �ش� ������ ������ �󵵼� ����
		this.frequency[birthDate]++;// this. := class FrequencyTable�� �󵵼� �迭�� ��Ÿ��
		
		
		
		
	}

	/**
	 * ������ ������ �����ϰ� �󵵼��� �����Ѵ�.
	 * @param birthDate
	 */
	// ���� ���� ���� ���
	void removeBirthDate(int birthDate) // �޼����� ��� := �󵵼� ���Ű� ������ ���� ����
	{
		// uniqueElements�� �󵵼� �迭�� ���������� �����Ѵ�.
		// uniqueElements
		int cnt = frequency[birthDate]; // ���� �����Ǵ� ������ �󵵼� üũ
		if(cnt == 2) { //������ 2���� ���� �����Ǿ� 1�̵Ǹ� ������ ���� �ȴ�.
			this.uniqueElements +=1;
			
		}else if(cnt == 1) { // ������ ������ ���� ���µ� ���ϸ� �����ϰ� �Ǿ� ������ ���� �ƴϰ� �ȴ�.
			this.uniqueElements -=1;
		}
		
		
		// �󵵼� �迭
		this.frequency[birthDate]--;
		
		
	}

}
