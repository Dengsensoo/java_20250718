package practice_if_20250718;

public class if_else_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 점수가 90점 이상이면 수, 80점 이상이면 우, 점수가 70점 이상이면 미,
		// 70점 미만이면 양, 60점 미만이면 가를 출력하는 프로그램
		
		int score = 55;
		
		if(score >= 90) {
			System.out.println("수");
		} else if(score >= 80) {
			System.out.println("우");
		} else if(score >= 70) {
			System.out.println("미");
		} else if(score >= 60) {
			System.out.println("양");
		} else {
			System.out.println("가");
		}
		
		System.out.println("축하합니다!");
		
		// Value 값이 10 이상 20 미만이면 통과를 출력하시오.
		
		int value = 5;
		
		if(10 <= value && 20 > value ) { // 2개를 동시에 비교하는 문법이 안됨.
			System.out.println("통과");
		}
	}

}

// 문법을 잘하는 사람을 뽑는 시대는 지나감
// 알고리즘을 잘 짜는 사람을 뽑는 것이 블라인드 테스트