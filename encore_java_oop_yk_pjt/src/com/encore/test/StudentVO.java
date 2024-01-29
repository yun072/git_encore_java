package com.encore.test;
/*
    comment 
    XXXXXXVO.java , XXXXDTO.java, XXXXEntity.java
    --업무 로직이 없고 데이터만 관리하는 클래스로 변수 및  Setter, Getter로 이루어짐//데이터를 담고 반환하는 역할만 함
    --이 클래스 내의 접근재어자는 private을 씀 --은닉화를 적용시켜서 직접적인 접근을 막아버림 (외부의 접근, 내부에서는 얼마든지 접근 가능)
    --private String  name ; //클래스에 변수 하나 정의함
	--private int     age  ; 
	--private double  height ;
	--private boolean isMarriage ;



*/
public class StudentVO { //value object의 약자 //데이터를 담고 반환하는 역할만 함
	/*
	   변수(Variable)
	   구문형식 -> 접근 지정자 변수타입 변수명 ;
	   -- 접근지정자(public, private)
	   -- 변수타입(기본타입, 참조타입)
	   -- 변수명(소문자로 시작해야한다)
	   변수란 선언 위치가 있는데 (위치에 따라 전역(시도의원), 지역(국회의원)으로 나눌 수 있음)
	   지역변수가 되면 메서드에 있는 스콥 따르는 것 따라서 접근 지정자가 빠짐
	   변수에 is 붙어있으면 논리형?
	   
	 */
	//전역 변수(클래스 내에서 접근 가능한 범위를 갖는 것)
	private String  name ; //클래스에 변수 하나 정의함-- 인스턴스통해서 접근 가능 //참조 타입=>쓸려면 객체 생성해야 함 참조타입이면서 기본 타입처럼 쓸 수있는게 string 타입
	private int     age  ; //인스턴스통해서 접근 불가
	private double  height ;
	private boolean isMarriage ; // 변수에 is 붙어있으면 논리형?
	
	public StudentVO () { //기본생성자-클래스이름과 완벽하게 일치해야함
		
	}
	
	
	/*
	 * 클래스에 들어가는 구성요소 = 변수 생성자 메서드 
	 * 클래스안에 이너클래스도 들어갈 수 있음 
	  
	  생성자(Constructor)
	  매개변수가 없는 생성자는 기본 생성자
	  매개변수가 있는 생성자는 스페셩 생성자
	  명시적으로 생성자가 정의되어지지 않으면 컴파일 시점에 기본생성자를 넣어서 컴파일을 진행
	  구문형식 )
	  접근지정자 클래스이름 ([매개변수]) {
	 }
	  메서드(함수)
	  구문형식)
	  만약 반환타입이 void가 아니라면 문장이 끝나기 전에 (반환타입에 명세된 타입 반환) return 키워드를 이용해서 값을 반환
	  접근지정자 반환타입(기본타입, 참조타입 지정-int double char boolean 리턴값이 없다면 void) 메서드이름([매개변수]) {
	  문장 ;
	  return (기본값 | 참조값 )
	  
	  }
	  
	 */
	
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() { //반환만 진행 
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public boolean isMarriage() {
		return isMarriage;
	}
	public void setMarriage(boolean isMarriage) {
		this.isMarriage = isMarriage;
	}
	
	
	

}
