package SetGet;

public class Student {
	private String name;
	private int id;
	private int age;
	
	// private 선언하면 지역변수가 되기 때문에 
	// set & Get 메서드를 통해  셋팅 및 가져오는 기능을 하는 메세드 추가 필요. 
	
	public void setName(String name){
		this.name = name;  // name 변수가 동일하기 때문에 this 선언 
	}
	
	public void setId(int id){
		this.id = id; 
	}
	
	public void setAge(int age){
		this.age = age;
	}
	
	public String getName(){
		return name;
	}
	
	public int getId(){
		return id;
	}
	
	public int getAge(){
		return age;
	}
	
	public void showInfo(){
		System.out.println("---------학생정보 입니다.----------");

		System.out.println("이름:"+ getName());
		System.out.println("ID:"+ getId());
		System.out.println("age:"+ getAge());
	}
	
	
	public static void main(String args[]){
		Student stu1 = new Student();
		stu1.name = "명길동";  
		System.out.println(stu1.name);
		
	}
}
