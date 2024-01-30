package com.encore.operator;

import java.util.Scanner;

public class OperatorDemo {
	 
	public  OperatorDemo() { //기본생성자 생성
	}
	
	//example01 반환값 x , 매개변수 x
    public void example01() {
    	
    	System.out.println(">>>> 산술연산") ;
	    int x =100, y = 100, result = 0 ; //지역변수(메서드 안에 선언되었기 때문)-선언과 동시에 초기화 해줘야함
	    //System.out.println("+" + x + y); //+100100이 출력//연산자 우선순위 발생 
	    System.out.println("+" + (x + y));
	    System.out.println("-" + (x - y));
	    System.out.println("*" + (x * y));
	    System.out.println("/" + (x / y));
	    System.out.println("%" + (x % y));
    }
  
   // public void example02() { //메서드 리턴타입없고 매개변수없음
    public String example02(String color01, String color02) { //리턴타입가지고 있는 메서드는 문장이 끝나기전에 리턴타입 필요(return null)
	  System.out.println(">>>> 연결연산") ;
	  return "신호등의 색깔은 " + color01 + "과" + color02 + "입니다." ; //+의 연결연산 사용
	
    }
    public void example03() { 
    	 System.out.println(">>>> 논리연산") ;
    	 boolean isFlag = false ;
    	 System.out.println("논리 부정, " + !isFlag) ;
    	 
    	// scanner로부터 입력받은 숫자가 짝수인지 아닌지 판단해보고 싶다면?
    	
 		Scanner scan = new Scanner(System.in) ;
 		System.out.println("숫자를 입력하시오: ") ;
 		int number = scan.nextInt();
 		System.out.println("Result >>>> 짝수 " + (number%2 == 0)) ;
 		System.out.println("Result >>>> 홀수 " + (number%2 != 0)) ;
 		
 	   //  scanner로부터 입력받은 숫자가 3의 배수인지 아닌지 판단해보고 싶다면?
 		
 
 		System.out.println("Result >>>> 3의 배수 " + (number%3 == 0)) ;
 		
 		//  scanner로부터 입력받은 숫자가 양수인지 아닌지 판단해보고 싶다면?
 		
 		System.out.println("Result >>>> 양수 " + (number > 0)) ;}
   
    public void example04() { 
    	System.out.println(">>>> 증감연산") ;
    	int age = 50 ;
    	System.out.println("현재 나이는 = " + age) ;
    	++age ; //전위연산//age = age + 1 이후 print
    	System.out.println("현재 나이는 = " + age) ;
    	age++; //후위연산 //프린트 이후 age = age + 1
    	System.out.println("현재 나이는 = " + age) ;
    
    	System.out.println();
    	int number = 20 ;
    	//int result = number++ * 3 ; //60
    	int result = ++number * 3;//63
    	System.out.println("Result >>>>" + result) ;
    	
    	
 		
    }
    public void example05() {
    	System.out.println(">>>> 일반논리연산") ;
    	/*
    	 *  &(이면서, 이고) , |(이거나), (&& , ||) -short shortcut
    	 */
    	Scanner scan = new Scanner(System.in) ;
    	System.out.println("숫자를 입력하시오: ") ;
    	int number = scan.nextInt();
    	
    	//Scanner 부터 입력받은 숫자가 1~100사이값인지 판단하고 싶다면?
    	System.out.println("1~100 " + (number >=1 && number<= 100 ) ) ; 
    }
    
    public void example06() {
    	System.out.println(">>>> 일반논리연산") ;
    
    	Scanner scan = new Scanner(System.in) ;
    	System.out.println("문자를 입력하시오: ") ;
    	char str = scan.next().charAt(0); //nextline은 공백 포함 문자열 next는 공백이 없는 문자열 입력받을 때 사용 //문자열 중 첫번쨰 문자 하나만 리턴
    	
    	//Scanner 부터 문자 하나를 입력 받아 A~Z 대문자인지 판단하고 싶다면? 
    	//콘솔로 부터 문자 하나 입력받을 것 (무조건 영문)
    	System.out.println("input char , " + (str) ) ;
    	System.out.println("A~Z " + (str >= 'A' && str <= 'Z' ) ) ; //문자열이 아닌 문자는 비교 가능_내부적으로 숫자로 바꾸어서 비교
    }
    public void example07() {
    	System.out.println(">>>> 삼항연산") ;
    	//(조건식) ? 참일 경우 : 거짓일 경우
    	//(조건식) ? 참일 경우 : (조건식)? 참일 경우 :거짓일 경우
    	Scanner scan = new Scanner(System.in) ;
 		System.out.println("숫자를 입력하시오: ") ;
 		int number = scan.nextInt();
 		
 		//Scanner 부터 입력받은 숫자가 양수인지 음수인지 아니면 0인지를 판단하고 싶다면?
 		String result = (number > 0) ? "양수" : (number == 0) ? "0" : "음수" ;
 		System.out.println("Result>>>> " + (result)) ;
    	
    }
    
    
}
