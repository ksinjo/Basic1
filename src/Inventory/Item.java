package Inventory;

import java.util.HashMap;
import java.util.Map;

public class Item {

	private final int inven_Size = 100;
	protected int category;
	 
	protected int itemType;
	protected String itemName;
    protected String name;
    protected String descrtion;
    protected boolean stackable;
    protected int maxStackSize = 1;
    
	
    public int getCategory() {
		return category;
	}

	public void setCategory(int category) {
		this.category = category;
	}

	public int getItemType() {
		return itemType;
	}

	public void setItemType(int itemType) {
		this.itemType = itemType;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescrtion() {
		return descrtion;
	}

	public void setDescrtion(String descrtion) {
		this.descrtion = descrtion;
	}

	public boolean isStackable() {
		return stackable;
	}

	public void setStackable(boolean stackable) {
		this.stackable = stackable;
	}

	public int getMaxStackSize() {
		return maxStackSize;
	}

	public void setMaxStackSize(int maxStackSize) {
		this.maxStackSize = maxStackSize;
	}

	public Item(String category,int itemtype)
    
    protected Map<String, Item> contents = new HashMap<>();

    pu
    
    
//    public Item(String itemName, String name, int maxStackSize) {
//        this.itemName = itemName;
//        this.name = name;
//        this.maxStackSize = maxStackSize;
//    }
//
//    public Item(String itemName, String name, boolean stackable){
//        this.itemName = itemName;
//        this.name = name;
//        this.stackable = stackable;
//    }
//
//    public Item(String itemName, String name, boolean stackable, int maxStackSize){
//        this.itemName = itemName;
//        this.name = name;
//        this.stackable = stackable;
//        this.maxStackSize = maxStackSize;
//    }
//
//    public Item(String itemName, String name, int maxStackSize, float value) {
//        this.itemName = itemName;
//        this.name = name;
//        this.maxStackSize = maxStackSize;
//        this.value = value;
//    }
//
//    public Item(String itemName, String name, boolean stackable, float value){
//        this.itemName = itemName;
//        this.name = name;
//        this.stackable = stackable;
//        this.value = value;
//    }
//
//    public Item(String itemName, String name, boolean stackable, int maxStackSize, float value){
//        this.itemName = itemName;
//        this.name = name;
//        this.stackable = stackable;
//        this.maxStackSize = maxStackSize;
//        this.value = value;
//    }
//
//    public Item(String category){
//        this.category = category;
//    }
//
//    public Item(){
//
//    }
//
//    public String getItemName() {
//        return itemName;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public boolean isStackable() {
//        return stackable;
//    }
//
//    public int getMaxStackSize() {
//        return maxStackSize;
//    }
//
//    public float getValue() {
//        return value;
//    }
//
//
//    public void setItemName(String itemName) {
//        this.itemName = itemName;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setStackable(boolean stackable) {
//        this.stackable = stackable;
//    }
//
//    public void setMaxStackSize(int maxStackSize) {
//        this.maxStackSize = maxStackSize;
//    }
//
//    public void setValue(float value) {
//        this.value = value;
//    }
//
//
//    public void printFullDetails(){
//        System.out.println("Name :: " + getName());
//        System.out.println("ItemName :: " + getItemName());
//        System.out.println("Stackable :: " + isStackable());
//        System.out.println("MaxStackSize :: " + getMaxStackSize());
//        System.out.println("Value :: " + getValue());
//        System.out.println();
//    }
//
//    public void printShortDetails(){
//        System.out.print(getItemName() + ", ");
//    }
//
//    protected void addItem(Item item){
//        this.contents.put(item.getItemName(), item);
//    }
//}
