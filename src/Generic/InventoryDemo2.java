package Generic;

import com.param.chapter21.Item;
import com.param.chapter21.ItemInfo;
import com.param.chapter21.ItemcategoryList;

//아이템 리스트 ( 단순히 아이템을 분류하는 정보만 가짐 )  
//아이템 인포 ( 아이템 정보 ) 
//아이템 클래스에 (리스트와, 인포 파라미터를  받음) 
//아이템을 분류하고 해당 정보를 출력함 

class ItemcategoryList {
	public ItemcategoryList(int itemcategory) {
		this.itemcategory = itemcategory;
	}

	public int itemcategory; // 1: 무기 2: 방어구 3: 악세사리 4: 소모성 아이템

	public void categoryitem(int n) {
		if (itemcategory == 1) {
			System.out.println("무기류");
		} else if (itemcategory == 2) {
			System.out.println("방어구");

		} else if (itemcategory == 3) {
			System.out.println("악세사리");
		} else {
			System.out.println("소모성 아이템");
		}

	}

}

class ItemInfo {

	public String itemName;
	public String itemDesc;
	public int itemcnt;

	public ItemInfo(String itemName, String itemDesc, int itemcnt) {

		this.itemName = itemName;
		this.itemDesc = itemDesc;
		this.itemcnt = itemcnt;
	}

	public String toString() {
		System.out.println(itemName);
		System.out.println(itemDesc);
		System.out.println(itemcnt);

	}

	// public void showitem() {
	// System.out.println("아이템 이름" + itemName + "아이템 설명" + itemDesc + "보유수" +
	// itemcnt);
	// }

}

class Item<C, T> {
	public C itemcategory;
	public T itemInfo;

	public Item(C itemcategory, T itemInfo) {
		this.itemcategory = itemcategory;
		this.itemInfo = itemInfo;

	}

}

public static void main(String args[]){
	

	Item<ItemcategoryList,ItemInfo> item1 = new Item<ItemcategoryList,ItemInfo>(new ItemcategoryList(1),new ItemInfo("개뼈다귀","이아이템은 사용할 수 없습니다.",99));
	System.out.println("아이템 이름 : "+item1.itemInfo.itemName+ "아이템 설명 :" +item1.itemInfo.itemDesc +"보유수 :" +item1.itemInfo.itemcnt);
}
