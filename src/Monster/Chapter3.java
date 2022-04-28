package Monster;

import java.io.*;
import java.lang.*;
import java.util.*;


public class Chapter3 {
	public static final Scanner scanner = new Scanner(System.in);

	public static final int MAX_SERIAL_NUMBER = 100000;


	/**
	 * data[0] ~ data[n-1]���� �ߺ��� �������� �ʴ� ���ҵ��� ��ȯ�Ѵ�.
	 * ��, �� ���ҵ��� ������������ ���ĵǾ� �־�� �Ѵ�.
	 * @param data  data[0] ~ data[n-1]���� 10�� ������ �ڿ�����.
	 * @param n
	 * @return
	 */
	public static ArrayList<Integer> getUniqueElements(int[] data, int n)
	{
		ArrayList<Integer> ret = new ArrayList<>();
		// �ߺ��� ���� := �󵵼� 1
		int temp[] = new int[100001];
		for(int i = 0; i<n; i++){
			temp[data[i]]++;
		}
		
		for(int i = 0; i<temp.length; i++){
			if(temp[i] == 1) {
				// �󵵼� 1�� ����
				ret.add(i);
				
			}
		}

    //�������� ������ �߰��߱� ������ ret�� ���� ������ ���ʿ��ϴ�.
		return ret;
	}


	public static void main(String[] args) throws Exception {
		//�� ������ ����� �����Ͱ� ���⶧���� BufferedWriter�� ����Ͽ� ����ؾ� �Ѵ�.
		BufferedWriter writer = new BufferedWriter(new 		OutputStreamWriter(System.out));

		//N���� �ø��� ��ȣ�� ���ʷ� �Է� �޴´�
		int n = scanner.nextInt();
		int[] data = new int[n];
		for(int i = 0 ; i < n ; i ++)
		{
			data[i] = scanner.nextInt();
		}

		//�ߺ����� ���ҵ��� ����Ѵ�.
		ArrayList<Integer> answers = getUniqueElements(data, n);

		//�� ���ҵ��� ����Ѵ�.
		for(int i = 0 ; i < answers.size() ; i++)
		{
			int element = answers.get(i);
			if( i > 0 )
			{ //ù ��° ���Ұ� �ƴ϶�� �տ� ������ �ϳ� �߰��Ѵ�.
				writer.write(" ");
			}
			writer.write(String.valueOf(element));
		}

		//BufferedWriter�� ���� �����Ѵ�.
		writer.flush();
		writer.close();
	}

}
