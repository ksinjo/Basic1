package StrategyPattern;


public interface WeaponBehavior {
	public void attack();
}

class AxeBehavior implements WeaponBehavior {
	@Override
	public void attack() {
		System.out.println("도기질");
	}
}

class SwordBehavior implements WeaponBehavior {
	@Override
	public void attack() {
		System.out.println("검질");
	}
}

class KnifeBehavior implements WeaponBehavior {
	@Override
	public void attack() {
		System.out.println("칼질");
	}
}

class BowAndArrowBehavior implements WeaponBehavior {
	@Override
	public void attack() {
		System.out.println("화살 발사!");
	}
}
