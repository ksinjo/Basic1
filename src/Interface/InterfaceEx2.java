package Interface;

interface inter1{
	void aa();
}

interface inter2{
	void bb();
}

interface inter3 extends inter1,inter2{
	void cc();
}

class Super{
	public void ss(){
		System.out.println("하이");
	}
}

class B extends Super implements inter3  {
	public void bb(){}    //  B -> inter2 -> inter1  
	public void aa(){}	  // 2개의 메서드 다  구현이 필요. 
	public void cc(){}
}


class InterfaceEx2 {

public static void main(String []args){
	
}
	
}
