package StrategyPattern;

public class Aobj {
	
	Ainterface aniterface;  //필요기능 >  Ainterface 추가 
	
	public Aobj(){
		aniterface = new AinterfaceImpl();
	}
	
	public void funcAA(){
	//privat void funcAA(){   private 접근불가  --> public 변경	
		
// Delegate 
		aniterface.funcA();
		aniterface.funcA();
//		System.out.println("AAA");
//		System.out.println("AAA");
// ~ 기능이 필요합니다. 개발해 주세요. 
	}
}
