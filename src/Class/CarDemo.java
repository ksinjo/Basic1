package Class;


/*
// 
	변수 (varialbe)
	 1) 클래스 변수 : staic 붙은 변수 , 공유 변수라고 한다. 
	 2) 인스턴스 변수  (instance vari)
	 
	  클래스변수와 인스턴스 변수를 멤버변수라고 한다. 
	  즉, 클래스 영역에 선언된 변수 === 멤버 변수 
	 3) 지역변수 (local vari) : 메서드 블락안에 선언된 변수 및  private 선언된 변수 
	
//   멤버변수를 초기화하지 않을 경우 default 값이 들어간다. 



*/

class CarDemo {
	// 멤버변수 초기화지 않을 경우 default 값이 설정. 
	// 지역변수는 꼭 초기화 해야한다. 그렇지 않으면 NUll 
	static String kind  ;   // 클래스의 
	int number;
	int speed;
	String color;
	
	public CarDemo(String a1){
		a1 = "준준형";
		kind = a1; 
	}
 
	public static void kind(){
	 
		System.out.println("중형차");
	}
	
	public void speedUp(){
		speed += 10;
	}
	
	public void speedDown(){
		speed-=5;
	}
}


class Cartest {
	public static void main(String []args){
//		CarDemo myCar = new CarDemo();
//		CarDemo yourCar = new CarDemo();
		System.out.print(CarDemo.kind);
		CarDemo.kind();
	
	}
}