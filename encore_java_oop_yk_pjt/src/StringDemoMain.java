
public class StringDemoMain {

	public static void main(String[] args) {       //static이 메모리 영역에 인스턴스 생성보다 먼저 올라가도록 만듬//매개변수로 배열이 지정될수도 있음
		//자바에서 유일하게 참조 타입이지만 기본타입처럼 사용가능한 변수의 타입은 String
		//String은 인스턴스 생성 없이 사용가능하지만 객체로 취급 된다.
		//String str01 ="임섭순" ; //기본데이터 타입이 아니라 바로 값을 할당할 수 없지만 string은 유일하게 가능
		//String str02 ="임섭순" ; //참조 타입이 아닌 기본 타입
		String str01 =new String("임섭순") ; //
		String str02 =new String("임섭순") ; // 주소값은 다른데 값은 동일하다
		
		
		
		if (str01 == str02) { // ==는 동등비교연산자 
			System.out.println("주소값이 동일합니다.");
		} else {
			System.out.println("주소값이 동일하지 않습니다.") ; //주소값이 동일합니다. 
		}
		if(str01.equals(str02)) { //문자열의 값을 비교
			System.out.println("값이 동일합니다.");
		} else {
			System.out.println("값이 동일하지 않습니다.") ; //값이 동일합니다
		}
		
		
		//**참조 타입이지만 기본타입으로 쓰일 수 있는 것 String 타입
		//**문자열 값을 비교할 때는 equals라는 메서드를 쓰자
		//new연산자는 객체 생성하는 거라는 느낌 갖기
		//클래스는 변수 메서드 생성자가 구성요소로 정의=> 변수와 메서드만을 소유
		
		

	}

}
