package practice_while;

public class For_test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=5; i>=0; i--) {
			System.out.println(i);
		}
		
		for(int i=5; i<=10; i--) {
			if(i == -1) {
				break; // for, while 등 반복문 종료
			}
			System.out.println(i);
		}
	}

}
