package Sort;

import java.util.*;

//Write your Checker class here
class Checker implements Comparator<Player>{

	@Override
	public int compare(Player o1, Player o2) {
		int n =0;
		if(o1.score > o2.score) {
			return -1; // ��ȯ���� �����̸� �������� 
		}else if(o1.score == o2.score) { // ������ ������ ���� ���� Ȯ�� 
			return o1.name.compareTo(o2.name); // ������ ������ ����(�̸��� ���̷� �����Ѵ�) //��������
			
			
		}else {
			return 1; // ��ȯ���� ����̸� ���� ����
		}
		
		
		
		
//		if(o1.name.charAt(0) > o2.name.charAt(0)) return 1; // compare()�Լ����� ��ȯ���� ����̸� ��������
//		else if(o1.name == o2.name) return (o1.name).compareTo(o2.name);
//		else return -1; //  compare( )�Լ����� ��ȯ���� �����̸� ��������
	}

}

class Player{
	String name;
	int score;
 
 Player(String name, int score){
     this.name = name;
     this.score = score;
 	}
 
}

public class comparator{
	public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     int n = scan.nextInt();

     Player[] player = new Player[n];
     Checker checker = new Checker(); //���� ����
     
     for(int i = 0; i < n; i++){
         player[i] = new Player(scan.next(), scan.nextInt()); // ( �̸�  , ����)
     }
     scan.close();
  
     Arrays.sort(player, checker); // player �迭�� checker�������� �����Ѵ�
     for(int i = 0; i < player.length; i++){
         System.out.printf("%s %s\n", player[i].name, player[i].score);
     	
     	}
	}
}