package Static;

/*
 *  Static 변수를 사용 예제 
 *   1. 불변의 상수와 같은 PI나 중력값을 사용 시 유용하다. 
 *     
 * 
 */

class Circle{
	
	static final double PI = 3.1415;
	public double radius;
	
	public Circle(double rai){radius = rai;}
	
	public void showperimeter(){
		double perim = radius *2 * PI;
		System.out.println("원의 둘레는"+perim);
	}
	
	public void showArea(){
		double area = (radius * radius) * PI;
		System.out.println("윈의 넓이는"+area);
	}
}
	

class UseStaticVariableDemo1 {

public static void main(String[]args){
	
	 Circle cir1 = new Circle(5.721);
	 cir1.showperimeter();
	 cir1.showArea();
	}

}
