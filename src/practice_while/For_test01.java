package practice_while;

public class For_test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("안녕하세요!!");
//		System.out.println("안녕하세요!!");
//		System.out.println("안녕하세요!!");
//		System.out.println("안녕하세요!!");
//		System.out.println("===========================");
		
		for(int i=0; i<5; i++) { // for(초기화식; 조건식; 증감식)
//			System.out.println("안녕하세요!!");
//			System.out.println("i값 : " + i);
		}
		
		//1부터 100사이의 짝수만 출력하시오
		for (int i=2; i<=100; i=i+2) {
//			System.out.println(i);
		}
		
		//1~100사이의 홀수만 출력하시오
		for (int i=1; i<=100; i=i+2) {
//			System.out.println(i);
		}
		
		int total = 0;
		int kor = 95;
		int eng = 80;
		int math = 70;
//		total = kor + eng + math;
		total = total + kor; // total=95
		total = total + eng; // total=175
		total = total + math; // total=245 누적식.
		
		//1~100까지의 모든 수의 합을 구하시오
		int sum = 0;
		
		for (int i=1; i<=100; i++) { // i가 100이 될 때까지 sum에서 i를 더하는 원리. 그러니까 최초에는 1 + 2, 2번째에는 3 + 3, 3번째에는 6 + 4, 마지막에는 4950 + 100
			sum = sum + i; // 외우는 것이 좋다.
//			System.out.println(sum); 최종 값은 변함이 없으나, 중간에 무슨 값이 나왔는지도 알기 위해서는 출력이 필요한 위치
		}
//		System.out.println(sum);
		
		//1~100사이의 짝수만 출력하시오.
		for(int i=1; 1<=100; i++) {
			if(i % 2 == 0) { // 1회전 해서 2로 나머지연산자% 하면 1이 나온다. 2회전 해서 2로 나머지연산자% 하면 0. 그럴땐 i의 당시 상태를 출력
//				System.out.println(i);
			}
		}
		
		//1~100사이의 홀수만 출력하시오.
	}

}
