package Interface;

// 인터페이스  메서드 구현체 없다. 

interface inte1{
	abstract public void aa();
}

interface inte2{
	void bb();
}

// implements를 통해  구체화 시킨다. 

public class Myclass implements inte1{
	public void aa(){}
	public void bb(){}	
	

}
