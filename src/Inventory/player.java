package Inventory;

import java.util.Map;

public class Player {

    public Inventory inventory = new Inventory();

    public Player(){

    }

    public Player(Inventory inventory){
        this.inventory = inventory;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public void displayInventory(){
        inventory.displayInventory();
    }


    //TODO: Add function addItem to Inventory Class to use LootBox as argument
    public void addLootBox(LootBox lootBox){
        this.inventory.addItem(lootBox);
    }

    public void addInventory(Container container){
        for(Map.Entry<String, Item> entry : container.contents.entrySet()){
            inventory.addItem(entry.getKey());
        }
    }



}