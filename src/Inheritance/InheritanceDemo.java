package Inheritance;


class Human{
	String name = "너임마";
	int age = 55;
	
	public Human(){
		this("기본생성자",01);
	}
	
	public Human(String name,int age){
		this.name = name;
		this.age = age;
		
	}
	
	public void getInfo(){
		System.out.println("이름:"+name+"나이:"+age);  // 
	}
}
// super: 부모클래스의 객체 의미  --> 부모클래싀 변수를 접근 
// this : 자신의 객체   		  --> 자신 클래스의 변수를 접근
// Super() 메서드 : 부모 클래스의 생성자 호출 메서드 
// this() 메서드 :  자신의 생성자 호출하기 위한 메서드 


// 자식 클래스     extends   부모 
class Employee extends Human{
	
	int salary;
//	public Employee(){
//		super();
	

	
	public Employee(String name,int age,int salray){
		super(name, age);
		this.salary = salray;  // this 사용은 인스턴스 변수 사용이므로 선언. 하지만 메서드에 해당 클래스 디스 생략하고 있음. 
	}						  // 인스턴스 변수 파란색, 파라미터 변수 갈색 .  써도 되고 안써도 되지만 쓰자. 	
	
	
	public void getInfo(){
		System.out.println("이름:"+name+"나이:"+age+"월급:" +salary);  // 
	}

	
}	
	
	
//	public Employee(){
//		super();
//	}

// 메서드 오버라이딩(Overriding):재정의 	
	
// 호출하고자 하는 메서드는 부모클래스의 존재	
// 메서드명은 동일해야 한다. 시그니처 동일 (매개변수와 반환타입도 같아야 한다)
// 접근제어자는 부모 클래스보다 넓거나 같아야 한다.
// 수행할 명령은 달라야 한다. 	
	
//	public void getInfo(String name,int age,int salary){
//	System.out.println("오버라이딩1 "+ "이름: "+name+"나이: "+age+"월급: "+Salary);
//	}
//}
//// subClass  





public class InheritanceDemo {

	public static void main(String[] args) {
		Employee em = new Employee("psy",40,500);
		em.getInfo();
	
		
	}
}
