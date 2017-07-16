package OverloadTest;

class TextBook{
	String title;
	String author;
	int point;
	static float domesticBookReadingRate = 0.234F;  
	
// [생성자의 오버로딩에 대해 알아봄] 	
//생성자의 역할: 멤버변수를 초기화 할 때 사용한다. 
//	public TextBook(){
//	 title = "국어";
//	 author = "홍길동"; 
	
//	String title = "국어";
//	String  author = "홍길동"; 
//  생성자 또한 메서드의 일종이다.  	 
	
//	public TextBook(String title){
//		this(title); 
//	}
//  
// 생성자는 가장 먼저 와야한다. 객체를 생성하기전에 객체를 사용할 수 없기 때문이다. 	
//	
	
	
	public TextBook(String title){
		this(title,"아무개");// = title; 생성자가 
	}
	 
	
	public TextBook(String title,String author){
		this.title = title;
		this.author = author;
	}
	 
	public TextBook(String title,float grade1){
		this(title,"this생성자",10,(grade1=domesticBookReadingRate ));

	}
	
	
	public TextBook(String title,String author,int point){
		this.title = title;
		this.author = author;
		this.point = point;
	}
	
	public TextBook(String title,String author,int point,float dbrr){
		this.title = title;
		this.author = author;
		this.point = point;
		this.domesticBookReadingRate  = (float) domesticBookReadingRate;
	}
	
	
	public void gradeBook(){
		System.out.println("-----------------");
		System.out.println("과목:"+title);
		System.out.println("저자:"+author);
		System.out.println("평점:"+point);
		System.out.println("국내 독서률:"+domesticBookReadingRate +"%");
		}
// 클래스의 멤버와   메서드와 파라미터는 서로 다르다. 
// 변수이름이 같기 때문에  이런 경우에는 this 선언이 필요하다. 
// 단, 클래스 변수와 메서드의 변수 이름이 다르다면 상관없다. 
	
// this: 자기 클래스 인스턴스를 접근할 때 사용. 	
// this.인스턴스 변수  , this.인스턴스 메서드 	
// Static에서는 this를 사용할 수 없다. 
//	 
}



 class ConstractOverloadDemo {

public static void main(String []args){
	TextBook tb = new TextBook("멍멍");
	tb.gradeBook();
	TextBook tb1 = new TextBook("개과목","김명수");
	tb1.gradeBook();
	TextBook tb2 = new TextBook("고양이과목","김정은",90);
	tb2.gradeBook();
	TextBook tb4 = new TextBook("신선한 과목",0.241f);
	tb4.gradeBook();
	}
}
