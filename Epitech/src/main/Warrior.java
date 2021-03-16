package main;

public class Warrior extends Character implements Movable {
	
    public Warrior(String name) {
        super(name, "Warrior");
        life = 100;
        strength = 10;
        agility = 8;
        wit = 3;

        System.out.println("[" + name + "] : My name will go down in history !");
    }

    // other method
    public void attack(String weapon) {
        
        if (weapon == "hammer" || weapon == "sword") {
            System.out.println("[" + name + "] : Rrrrrrrrr ....");
            System.out.println("[" + name + "] : I'll crush you with my " + weapon + " !");
        }
    }

	@Override
	public void MoveRight() {
		System.out.println("[" + name + "] : moves right like a bad boy");

	}

	@Override
	public void MoveLeft() {
		System.out.println("[" + name + "] : moves left like a bad boy");

	}

	@Override
	public void MoveForward() {
		System.out.println("[" + name + "] : moves forward like a bad boy");

	}

	@Override
	public void MoveBack() {
		System.out.println("[" + name + "] : moves back like a bad boy");

	}
    
    

}
