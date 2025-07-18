package practice_while;

public class For_test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 중첩 for 문
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=5; j++) {
				System.out.print("*");
			}
			System.out.println(); // println 의 속성을 이용한 줄 바꾸는 용도
		}
		
		System.out.println("==================================================================");
		
		// *
		// **
		// ***
		// ****
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("==================================================================");
		
		// ****
		// ***
		// **
		// *
		for(int i=4; i>=1; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
