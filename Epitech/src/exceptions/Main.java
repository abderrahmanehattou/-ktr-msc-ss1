package exceptions;

public class Main {

	public static void main(String[] args) {
		Warrior warrior = new Warrior("Jean-Luc");
		Mage mage = new Mage("Robert");
		
		warrior.MoveRight();
		warrior.MoveLeft();
		warrior.MoveForward();
		warrior.MoveBack();
		
		mage.MoveRight();
		mage.MoveLeft();
		mage.MoveBack();
		mage.MoveForward();
		
	}

}
