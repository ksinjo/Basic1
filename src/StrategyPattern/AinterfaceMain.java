package StrategyPattern;

public class AinterfaceMain {

	public static void main(String[] args) {
//		AinterfaceImpl ainterface = new AinterfaceImpl();
//		ainterface.funA();
		
		Ainterface ainter1 = new AinterfaceImpl();
		ainter1.funcA();
		Aobj aobj = new Aobj();
		aobj.funcAA();
	}
}
