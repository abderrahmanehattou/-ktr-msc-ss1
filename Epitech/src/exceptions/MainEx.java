package exceptions;

import exceptions.*;

public class MainEx {

	public static void main(String[] args) {
		Warrior warrior = new Warrior("Jean-Luc");
		Mage mage = new Mage("Robert");
		
		warrior.tryToAttack("screwdriver");
		mage.tryToAttack("hammer");
		warrior.tryToAttack("hammer");
		
		try {
			mage.attack("");
		} catch (WeaponException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}

}
