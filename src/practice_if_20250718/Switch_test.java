package practice_if_20250718;

public class Switch_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dice = ((int) (Math.random() * 6)) + 1; // 1,2,3,4,5,6 중에 랜덤으로 하나를 저장
		
		String ch="kor";
		
		switch(ch) {
			case "kor":
		}
		
		switch(dice) {
			case 1:
				System.out.println("1이 나왔습니다");
				System.out.println("11111111111");
				break; // 용도에 따라 넣음
			case 2:
				System.out.println("2가 나왔습니다");
				System.out.println("22222222222");
				break;
			case 3:
				System.out.println("3이 나왔습니다");
				System.out.println("33333333333");
				break;
			case 4:
				System.out.println("4가 나왔습니다");
				System.out.println("44444444444");
				break;
			case 5:
				System.out.println("5가 나왔습니다");
				System.out.println("55555555555");
				break;
			case 6:
				System.out.println("6이 나왔습니다");
				System.out.println("66666666666");
				break;
			default :
				System.out.println("주사위에서 나올 수 없는 숫자가 입력 되었습니다.");
		}
	}

}
