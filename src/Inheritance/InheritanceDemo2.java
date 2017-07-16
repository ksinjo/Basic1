package Inheritance;

class Electronics {
	
	private String producer;
	private String name;
	private int codeNum;
	
	protected Electronics(String pr,String ne,int codeNum){
		producer = pr;
		name= ne;
		this.codeNum = codeNum;
	}
	
	public String getProducer() {
		return producer;
	}
	public void setProducer(String producer) {
		this.producer = producer;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCodeNum() {
		return codeNum;
	}
	public void setCodeNum(int codeNum) {
		this.codeNum = codeNum;
	}
	
	public void Show(){
		System.out.println("해당 제품의 정보는 아래와 같습니다.\n제조사:"+getProducer()+" " +"제품이름: "+getName()+"제조사코드: "+getCodeNum()+" 입니다.");
	}
	
}



class Tablet extends Electronics{
	
	private String wifi;

	
	public Tablet(String pr, String ne, int codeNum,String wifi) {
		super(pr, ne, codeNum);
		this.wifi = wifi;
	

	}
	public String getWifi() {
		return wifi;
	}
	public void setWifi(String wifi) {
		this.wifi = wifi;
	}
	public void Show(){
	System.out.println("해당 제품의 정보는 아래와 같습니다.\n제조사: "+getProducer()+"제품이름: "+getName()+"제조사코드: "+getCodeNum()+" 입니다.");
	
	}
}

class Ipad extends Tablet{

	public Ipad(String pr, String ne, int codeNum, String wifi) {
		super(pr, ne, codeNum, wifi);
	
	}
	
}



public class InheritanceDemo2 {

	public static void main(String[] args) {
		Electronics ele1 = new Electronics("삼손","개탁기",12);
		ele1.Show();
		if (ele1.getProducer() == "삼성")
			ele1.Show();
		else
		System.out.println("제조사 이름이 잘못되어 수정합니다.");
		ele1.setProducer("삼성");
		ele1.Show();
		
		Tablet Tablet1 = new Tablet("LG","Tablet",13,"wify Type");
		Tablet1.Show();
	}

}
