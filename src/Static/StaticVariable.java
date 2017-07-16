package Static;

/*
 	Static 변수에 접근하는 방법 
   	인스턴스나 클래스 이름으로 접근 가능하다.  
 	
 	스태틱으로 선언된 변수는 객체생성과 상관없이 
 	스태틱 공간에 값을 공유하여 계속 증가하게 된다. 
 	
 */

class AccessWay{
	static int num=0;
	static private int num2;
	public int getnum2; 

	AccessWay(){ increaseCnt();} 
	
	public void increaseCnt () {
		num++;
	}
	
	public void incre_Cnt(int numberVAl){
		num+= numberVAl;
	}
	public int SetNum2(int argu1){
	num+=argu1+num;
	return getnum2;
	}
	
	public void getnum2(){
	int getnum2;	
	
	}
}
class StaticVariable {	
	public static void main(String []args){
		AccessWay way1 = new AccessWay();
		System.out.println("1번 객체 생성  "+AccessWay.num);
		way1.num++;   // 스태틱 num 변수에  직접 접근한다.
		System.out.println("1번 객체 스태틱 변수 증가"+AccessWay.num);

		System.out.println("1번 객체 스태틱변수에 결과전"+AccessWay.num);
		AccessWay way2 = new AccessWay();
		
		System.out.println("2번째 생성 스태틱변수에 결과값"+AccessWay.num);
		AccessWay.num++; // 클래스 이름으로도 접근가능핟.  
		System.out.println("1번째 스태틱변수에 결과값"+AccessWay.num);
		way1.incre_Cnt(2);
		System.out.println("1번째 스태틱변수에 결과값"+AccessWay.num);

		way2.SetNum2(2);
		System.out.println("2번째스태틱변수에 결과값"+AccessWay.num);
	}
}
	

