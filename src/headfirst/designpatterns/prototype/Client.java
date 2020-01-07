package headfirst.designpatterns.prototype;

public class Client {
	public static void main(String[] args) {
		Monster dragon = new Dragon("Dragon", false); // prototype for all Dragons
		Monster drakon = new Drakon("Drakon", 2, true); // prototype for all Drakons
		
		Monster laconian = makeMonster(drakon, "Laconian");
		Monster ladon = makeMonster(dragon, "Ladon");
		
		System.out.println(ladon);
		ladon.spitPoison();
		
		System.out.println(laconian);
		laconian.spitPoison();
	}
	
	public static Monster makeMonster(Monster monsterToCopy, String name) {
		Monster newMonster = null;
		try {
			newMonster = monsterToCopy.copy();
			newMonster.setName(name);
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return newMonster;
	}
}