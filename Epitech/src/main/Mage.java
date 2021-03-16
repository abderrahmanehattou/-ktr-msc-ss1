package main;

public class Mage extends Character implements Movable {
	
    public Mage(String name) {
        super(name, "Mage");
        life = 70;
        strength = 3;
        agility = 10;
        wit = 10;

        System.out.println("[" + name + "] : May the gods be with me.");
    }

    // other method
    public void attack(String weapon) {

        if (weapon == "magic" || weapon == "wand") {
            System.out.println("[" + name + "] : Rrrrrrrrr ....");
            System.out.println("[" + name + "] : Feel the power of my " + weapon + " !");
        }
    }

	@Override
	public void MoveRight() {
		System.out.println("[" + name + "] : moves right furtively");
	}

	@Override
	public void MoveLeft() {
		System.out.println("[" + name + "] : moves left furtively");
	}

	@Override
	public void MoveForward() {
		System.out.println("[" + name + "] : moves forward furtively");
	}

	@Override
	public void MoveBack() {
		System.out.println("[" + name + "] : moves back furtively");
	}

	
    
    
    

}
