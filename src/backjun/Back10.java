package backjun;

public class Back10 {
	    public static void main(String[] args) {
//	        for(int i=1; i<=7; i++){ // 1 2 6 -> 3 4 5 7
//	
//	           if(i == 1 || i == 2 || i == 6) {
//	        	   continue;
//	           }
//	           System.out.println(i);
//	           
//	           
//	        }
//	 
//	        System.out.println("�ݺ��� ��!");
//	    
	    	// Ŀ�Ǹ� � ����ִ��� ����
//	    	int money = 3000;
//	    	int coffee = 200;
//	    	int cnt = 0;
//	    	
//	    	while(money >= coffee) {
//	    		System.out.println("Ŀ�Ǹ� �ֹ��մϴ�");
//	    		cnt++;
//	    		System.out.println("��"+cnt+"���� �����ߴ�");
//	    		money -= coffee;
//	    		if(cnt == 6) {
//	    			System.out.println("�ʹ� ���� �Ծ���"); break;
//	    		}
//	    	}
//	    	
	    	// 10������ Ȧ�� ���
	    	int a = 0;
	    	while(a < 10) {
	    		a++;
	    		if(a > 1 ) {
	    			System.out.println(a);
	    		}
//	    		if(a == 3) System.out.println(0);
//	    		else if(a == 5) System.out.println("aba"); 
	    		if(a >3) System.out.println("if"+a);
	    		
	    		else {
	    			System.out.println("else"+a);
	    		}
	    	}
	    	
	}

}
