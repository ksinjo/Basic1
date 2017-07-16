package OverloadTest;

import java.awt.peer.SystemTrayPeer;

/* Method Overloading 
 
  1. {하나의 클래스}  = 동일 메서드 이름.... 다수 존재 
    1-1.  메서드의 파라미터 수나 타입에 따라 조건에 맞는 처리한다. 
    1-2. 오버로딩의 성립조건 (매개변수 개수, 데이터 타입,순서가 달라야 한다.)
   
   단. 메서드의 오버로딩의 리턴타입이 다른 경우 조건성립되지 않음. 

*/
public class MethodOverLoadingDemo {
	
	public void getAdd(){
		System.out.println("매개변수 없는 메서드");
	}
	
	public int getAdd(int i,int j){
		return i+j;
	}
	
	public int getAdd(int i,int j,int k){
		return i+j+k;
	}

	public int getAdd(float i,int j,int k){
		return (int)i+j+k;
	}

	public int getAdd(int i,float j,int k){
		return (int)(i+j+k);
	}
	public double getAdd(double i,int j,int k){
		 return (double) (i+j+k);
	}
	
//  파라미터의 수가 같다. 성립불가. 	
//	public int getAdd(int ii,int jj,int kk){
//		return i+j+k;
//	}
	
	
// 
//	public double getAdd(int i,int j,int k){
//		return(double) i+j+k;
//	}

	
//@ 파리미터의 수가 같은 타입이며, 수가 동일하기에  에러 발생	
//	public double getAdd(int i,int j,int k){
//		return i+j+k;
//	}



	public static void main(String[] args) {
		MethodOverLoadingDemo over1= new MethodOverLoadingDemo();
		
		over1.getAdd();
		int a = over1.getAdd(1, 2);
		System.out.println(a);
		int b = over1.getAdd(10, 20, 100);
		System.out.println(b);
		int c = over1.getAdd(1.2f, 2, 4);
		System.out.println(c);
		int d = over1.getAdd(100, 200, 300);
		System.out.println(d);
		int e = over1.getAdd(20212, 200, 300);
		System.out.println(e);

	}

}
