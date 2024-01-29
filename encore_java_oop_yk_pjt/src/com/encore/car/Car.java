package com.encore.car; 

//엔진을 가져오고 싶음
import com.encore.car.engine.Engine ;

public class Car {
	//전역(멤버)변수 스코프는 클래스전역에서 사용가능한 변수 
	
	private Engine engine ;
	
	//기본 생성자 정의 해보자
	//생성자는 like a method로 반환타입이 정의되지 않고 메서드의 이름은 클래스의 이름과 동일 ,객체 생성시 호출
	
	//생성자 따라서 엔진은 카가 생성될떄 만들어지는게 맞음
	public Car()  { 
		engine = new Engine() ; //참조 타입의 변수가 생성 
		
	}
	public car(String type) {
		engine = new Engine(type) ;
		
	}
	public void engineInfo() {
		String info = engine.showInfo() ; //문자열 리턴
		System.out.println(">>>엔진정보<<<") ;
		System.out.println(info)  ;
		
	}

	
}
