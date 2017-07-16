package Class;

public class MemberDemo {

	static int aa ; //스태틱 변수
	String str = "개빡침";  // 인스턴스 변수 
	
	//생성자 
	
	public MemberDemo(){
	System.out.println("constructor");
	}
	public static void yy(){
		System.out.println("클래스 메소드");
	}
	public void xx(){
		System.out.println("인스턴스 메소드1");
		
	}
	public void zz(String ar){
		System.out.println("매개변수가 있는 메소드:"+str);
	}
	
	public static void main(String[]args){
		//생성자를 호출하자, 이 의미는 객체를 생성한다는 의미가 된다.
	
		MemberDemo md = new MemberDemo();
		md.xx();
		yy();
		md.zz("개미침");
	}
	}
	

