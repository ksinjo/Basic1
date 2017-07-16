package Class;

public class MemberDemo1 {
	/*  클래스 구성요소 :  속성(필드) + 메서드 (생성자) 
	*/

public MemberDemo1(){} // JVM자동으로 디폴트 생성자 생성. 
	
	static int aa;
	String str;
	// 생성자는 Static이 없다. 
//	public MemberDemo1(){
//		System.out.println("Construct");}
	
	public static String yyy(){
		System.out.println("반환값이 있는 클래스 메서드");
		return "반환값";
	}
	public void xx(){
		System.out.println("인스턴스 메서드1");
	}
	public int xxx(int aa1){
		int fv = aa1 + 1000;
		System.out.println("반환값이 있는 메서드"+fv);

		return fv;
		
	}
	
	
	public void zz(String str1){
		System.out.println("매개변수가 있는 메서드"+str1);
	}
	public static void main(String []args){
	//생성자를 호출하자. 이 의미는 객체를 생성한다는 의미가 된다. 
	MemberDemo1 md = new MemberDemo1();
	md.yyy();
	md.xx();
	md.zz("파라미터1개 스트링 타입 출력");
	String str2 = yyy();
	System.out.println(str2);
	md.xxx(100);
	
	}
}
