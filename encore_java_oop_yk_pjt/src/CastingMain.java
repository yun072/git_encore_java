
public class CastingMain {

	public static void main(String[] args) {
		//자바의 캐스팅 연산자 : (타입) 변수명 ;
		
		byte x ,y , sum ; //선언
		
		x = 10 ;
		y = 10 ;
		sum = x + y ; //왜 에러? int값을 sum에 넣으려고 하ㄴ면 sum은1이트 크기에 4바이트 크기를 넣어주느 것이기 떄문에 안됨 
		//int를 byte로 줄일것임
		//묵시적인건 캐스팅쓸 필요 없지만 명시적 즉 큰 타입을 작은 타입으로 바꿀 떄는 캐스팅 필요
		
		sum = (byte)(x+y) ;
		
		
		System.out.println ("sum = " +sum ) ;
		System.out.println ();
		System.out.println ();
		
		char charValue = 'A' ;
		char charValue02 ='B' ;
		System.out.println ("char Value = " +charValue ) ; //Char Value =A
		System.out.println (charValue +charValue02); //131=유니코드 값 즉 아스키 코드 --문자와 문자는 더할 수 없으므로 내부적으로 프로모션 돌려서 65+66해서 반환함
		//위의 결과를 char로 바꾸고 싶어! =casting
		System.out.println ((char)(charValue +charValue02)) ;//실행 안됨 
		System.out.println ((char)(97) ) ; // a
		

	}

}
