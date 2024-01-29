
package com.encore.car.engine;

public class Engine {
	private String engineType ; //참조타입의 변수지만 기본처럼 사용가능 //멤버변수 전역 변수
	
	//생성자 또는 메서드는 매개변수의 타입과 개수를 달리해서 재 정의할 수 있다. 
	//생성자 오버로딩, 메서드 오버로딩
	//생성자의 역할? 매개변수 값을 받는 이유?클래스가 전역변수로 입력되어있는 멤머변수갓 초기화 즉 멤버 변수에 할당하는게 생성자의 역할 
	//생성자는 매개변수로 받은 값을 전역(멤버) 변수에 할당하는 역할을 한다. 
	public Engine() { //매개변수 0
	}
	public Engine(String engineType) { //매개변수 1개 
		this.engineType = engineType ; //클래스안에 같은 변수명 여러개 사용? 선언위치가 다르면 가능 //지역변수
		
	}
	public String showInfo( ) {
		return null ; //기본값들을 리턴 //엔진정보 null 나옴
	}
	public String showInfo( ) {
		return "엔진의 타입은 "+engineType+"입니다." ; 
	}
 //객체를 생성하면 인스턴스가 소유한 메서드에 접근 가능 따라서 생성자를 잘 알아야함
}