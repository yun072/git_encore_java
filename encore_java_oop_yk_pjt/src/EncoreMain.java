
public class EncoreMain {
	//byte -> short->int-> long -> float-> double (묵시적 형변환)
	//        char -> //char는 int로 자동 형변환이 되어서 사칙연산 됨 
	//byte <- short<-int<- long <- float<- double (명시적 형변환)
	//명시적 형변환(캐스팅)

	public static void main(String[] args) { //[]는 배열
		// TODO Auto-generated method stub
		System.out.println("섭섭님과 함꼐하는 즐거운 JAVA") ;
		
		//지역변수는 메서드 내에 선언하는 변수 
		int intValue = 10 ; //프로그램에서 equal은 할당 연산
		char charvalue = 'm'; //''는 자 하나 ""는 문자 여러개
		
		float doublevalue = 3.14F ; //플롯형의 자바 변수 
		
		//INT보다 더 큰 값을 담고 싶다
		//long intValue = 10 ;
		
		String stringValue = "섭섭님" ; //string은 첫번쨰 레터가 대문자로 시작해야 함//문자열이기 때문에 ""사용 //
		boolean booleanValue = false ;
		
		System.out.println("정수값 : "+intValue) ;
		System.out.println("정수값 : "+charvalue) ; 
		System.out.println("정수값 : "+doublevalue) ;
		System.out.println("정수값 : "+stringValue) ;
		System.out.println("정수값 : "+booleanValue) ;
		
		
	}

}
