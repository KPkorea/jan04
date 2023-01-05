package what;
//혹시 이거 될까요?
//인스턴스를 하나만 만들기 가능?
//ctrl + shift + L : 이클립스 전체 단축키
public class What {
	public static void main(String[] args) {
//		static 안 붙은 메소드는 객체 생성 후에 실행해야 합니다.
//		static 붙은 메소드는 객체 없이 클래스명.메소드명으로  실행
//		Human h1 = Human.getInsetance();
//		Human h2 = Human.getInsetance();
//		System.out.println(h1 == h2);
//		
		for (int i = 'A'; i < 'D'; i++) {
			//여기서 숫자를 쓰지 않고 반복문 돌리기 가능?
			System.out.println(i);
		}
		
//심심하면 풀어주세요
//1~9까지 모두 더하는 프로그램 만들기
		int result = 0;
		for (int i = 1; i < 10; i++) {
//			System.out.println(i);
			result += i;
		}
		System.out.println(result);
		
//1~9까지 짝수만 더하기 가능?
		result = 0;
		for (int i = 1; i < 9; i++) {
			if(i%2 == 0) {
				result += i;
			}
		}
		System.out.println(result);
		
	}
}
//데이터 베이스 연결(p243)
//class Human {
//	private static Human human = new Human();//변수
//	
//	private Human() {}//생성자
//	
//	public static Human getInsetance() {//함수
//		return human;
//	}
//}


/* 
 * 여러분들이 좋아하시는 LOL의 영웅을
 * 클래스로 만들고자 합니다.
 * 
 * 상속기능을 넣어주시고, 
 * 인터페이스도 넣어주세요.
 * 
 * 교통수단
 * 
 * 포켓몬스터
 * 
 * 시크릿 쥬쥬
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */