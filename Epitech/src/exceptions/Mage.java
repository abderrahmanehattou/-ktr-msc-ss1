package exceptions;

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
    public void attack(String weapon) throws WeaponException {
    	
    	if (weapon == "") {
    		throw new WeaponException("[" + name + "] : I refuse to fight with my bare hands.");	
    	}
	    
    	
    	else {
    		// no exception
    		if (weapon == "magic" || weapon == "wand") {
                System.out.println("[" + name + "] : Rrrrrrrrr ....");
                System.out.println("[" + name + "] : Feel the power of my [" + weapon + "]!");
            }
    		else
    			throw new WeaponException("[" + name + "] : I don ' t need this stupid " + weapon + " ! Don't misjudge my powers !");	
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
