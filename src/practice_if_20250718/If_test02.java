package practice_if_20250718;

public class If_test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 주사위를 굴려서 만약에 3이 나오면 한글로 "삼이 나왔습니다."로 출력하는 프로그램
		// System.out.println((int) (Math.random() * 6) + 1); // Math.random = 0 ~ 1 사이의 수 중에서 소수점 16자리까지 랜덤으로 추출해주는 라이브러리
		int dice = ((int) (Math.random() * 6)) + 1; // 1,2,3,4,5,6 중에 랜덤으로 하나를 저장
		
		if (dice == 1) {
			System.out.println("일이 나왔습니다");
		}
		else if (dice == 2) {
			System.out.println("이가 나왔습니다");
		}
		else if (dice == 3) {
			System.out.println("삼이 나왔습니다");
		}
		else if (dice == 4) {
			System.out.println("사가 나왔습니다");
		}
		else if (dice == 5) {
			System.out.println("오가 나왔습니다");
		}
		else {
			System.out.println("육이 나왔습니다");
		}
	}

}
