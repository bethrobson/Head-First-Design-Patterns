package game1;

public class King extends Character {
	public King() {
		weapon = new SwordBehavior();
	}
	
	public void fight() {
		System.out.println("King is fighting");
	}
}
