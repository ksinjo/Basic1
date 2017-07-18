package StrategyPattern;

public class Character {
	private WeaponBehavior weaponBehavior;
	
	public Character(WeaponBehavior weaponBehavior) {
		this.weaponBehavior = weaponBehavior;
	}
	
	public void fight(){
		weaponBehavior.attack();
	}
	
	public void setWeapon(WeaponBehavior weaponBehavior)
	{
		this.weaponBehavior = weaponBehavior;
	}
}


