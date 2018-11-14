package game1;

public class GameStart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Character character1 = new Queen();
		character1.performUseWeapon();
		character1.fight();
		
		Character character2 = new King();
		character2.performUseWeapon();
		character2.fight();
		
		Character character3 = new Troll();
		character3.performUseWeapon();
		character3.fight();
		
		Character character4 = new Knight();
		character4.performUseWeapon();
		character4.fight();
	}

}
