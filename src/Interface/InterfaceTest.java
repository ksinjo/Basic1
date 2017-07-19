package Interface;

class ItemCategory {

}

/*  
 *  !인터페이스 테스트!   
 *  아이템 탭 분류를 보여주는 것은 인터페이스로 만드는 것은 비효율.. 
 * 	캐릭터 로딩 시 GetInventory 정보를 담는 곳에서  한꺼번에 분류..     	              
 * 
 * catergory 

iteminfo -->  item  type =1  무기 / type2 = 방어구 / type3 = 악세사리 type4 = 퀘스트 아이템 Type5 = etc   
@ SelectSort 기능구현 :  
  
  1) ItemInfo 정보를 참조한다.
  2) itemType 1차 분류 후 리스트 정보를 보여준다. 
  3) 인벤토리 보여주는 우선순위 : itemGrade > itemValue > itemName > CrateitemNum  
    2-1. itemType   
    		       	
    		       	
*/

// 인벤토리 내에서  타입별 리스트를 선택했을 때 동작할 메서드 다중상속 

interface SelectWeapontype { 
	abstract void weapontypeSort();   			// 무기
}

interface SelectAmortype { 						// 방어구
	abstract void AmortypeSort();

}

interface SelectAccesarytype { 					//  악세서리 
	abstract void accesarytypeSort();

}
interface SelectQuestType{ 						// 퀘스트  
	abstract void questtypeSort();

}

interface SelectEtctype { 					// ETC 잡템 
	abstract void etctypeSort();

}


class SortitemType implements SelectWeapontype, SelectAmortype,SelectAccesarytype,SelectQuestType,SelectEtctype {
	// public int itemtypeSort(int itemId){
	public void weapontypeSort() {
		
		System.out.println("----무기탭의 정보를 출력합니다-----.");
	}

	public void AmortypeSort() {
		System.out.println("-----방어구탭의 정보를 출력합니다.----");
	}

	public void accesarytypeSort() {
		System.out.println("----악세사리탭의 정보를 출력합니다.----");
	}
	public void questtypeSort() {
		System.out.println("----퀘스트탭의 정보를 출력합니다.----");
	}
	public void etctypeSort() {
		System.out.println("----방어구 아이템 아이디로 정렬했습니다.----");
	}
	
	
}

class InterfaceTest {
	public static void main(String[] args) {
		SortitemType sortitype = new SortitemType();
		sortitype.weapontypeSort();
		sortitype.AmortypeSort();
		sortitype.accesarytypeSort();
		sortitype.questtypeSort();
		sortitype.etctypeSort();
	}
}