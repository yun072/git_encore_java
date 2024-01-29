import com.encore.car.Car ;

public class CarMain {
	public static void main(String[] args) {
		//Car car = new Car() ; //car에 대한 인스턴스 생성, 엔진에 대한 인스턴스 생성 총 두개의 인스턴스 생성
		Car car = new Car("가솔린") ; //엔진의 타입은 가솔린입니다라고 호출
		//car 객체 생성 후 인스턴스 소유의 메서드 호출
		car.engineInfo() ;
	}

}
