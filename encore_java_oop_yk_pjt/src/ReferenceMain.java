import com.encore.test.StudentVO ;
public class ReferenceMain {
	
		
		/*
		 *기본타입과 참조 타입 차이점
		 *기본타입은 선언과 동시에 값을 할당 할 수 잇다. 
		 *기본타입은 값을 담는 변수
		 *
		 *그러나 
		 *참조타입은 선언과 동시에 값을 할당할 수 없다.
		 *참조타입은 값을 담는 변수가 아니라 주소값을 담는 변수이다.(인스턴스 생성이 전제) 
		 *주소값을 담기 위해서는 객체생성이 선행되어야한다. 클래스 생성목적-인스턴스 생성-메모리 어딘가에 주소번지를 담는 객체가 만들어짐
		 *객체 생성시 사용하는 연산자는 new 
		 *new 뒤에는 생성자(Constructor) 호출
		 *StudentVO stuObj = 10 ; //정수 리터럴이라 안됨 따라서 변수 타입이 char여야한다. --참조 타입은 선언과 동시에 값을 담을 수없다.따라서 참조타입은 객체 생성을 먼저 해야한다.
		//반환타입 자체의 선언이 없고 클래스와 이름이 같음=생성자
		 * 	//MAIN에서 STUDENT 가져다 쓰고 싶음 //패키지 임포트(import com.encore.test.StudentVO ;) ->인스턴스 생성(NEW 생성자 호출)로->메모리상 주소번지 가짐-> 
			System.out.println(new StudentVO() ) ; //실행하면 주소값 나옴 ~6f2b958e 등 
			
			
		
		 * 참조 타입 : 클래스, 배열, 자료구조, enum etc ......
		 */
		public static void main (String[] args) {
			
			StudentVO stuObj = new StudentVO() ; //위에 출력된 주소값이 STUOBJ에 할당, 인스턴스 생성, ckawh 인스턴스 소유의 메서드 접근이 가능-> 참조 타입은 객체 생성이 전제

//			studentVO의 전역변수 접근제어자가 public 일 떄 가능한 코드
//	        System.out.println("인스턴스 소유의 변수 호출 : " +stuObj.name) ; //인스턴스 소유의 변수 호출 : null이라고 뜸
//			stuObj.name = "포케" ;
//			System.out.println("인스턴스 소유의 변수 호출 : " +stuObj.name) ; //인스턴스 소유의 변수 호출 : 포케			
//	
			System.out.println("인스턴스 소유의 메서드 호출 : ") ;
			stuObj.setName(10) ; //메서드는 문자열을 받겠다고 했기 떄문에 int값은 오류나는 것  
			stuObj.setName("섭섭해") ; //리턴 값 void
			String returnValue = stuObj.getName();
			System.out.println(returnValue) ;
			System.out.println(stuObj.getName()) ;
			
	} 

}
