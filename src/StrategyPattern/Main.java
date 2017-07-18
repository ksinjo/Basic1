package StrategyPattern;

public class Main { 
	public static void main(String[] args) { 
		//칼 휘두르는 캐릭터 생성! 
		Character character1 = new Character(new KnifeBehavior()); 
		character1.fight(); 
		//도끼를 휘두르는 캐릭터 생성 
		Character character2 = new Character(new AxeBehavior()); 
		character2.fight(); 
		//도끼에서 활로 무기 변경 
		character2.setWeapon(new BowAndArrowBehavior()); 
		character2.fight(); 
			}
		}
	



