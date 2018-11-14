package game1;

public abstract class Character {
	WeaponBehavior weapon;
	
	public void setWeapon(WeaponBehavior w){
		this.weapon = w;
	}
	
	public void performUseWeapon() {
		weapon.useWeapon();
	}
	
	public void fight() {
		
	}
}
