package SetGet;

public class School {

	public static void main(String[] args) {
		Student stu = new Student();
		
		stu.setName("aban Smith");
		stu.setId(2018358224);
		stu.setAge(85);
		stu.showInfo();
		
//		stu.name ="개똥이";   멤버필드가  private 선언되어 있기 때문 
		
	}

}
