package exceptions;

public class Character implements Movable {
	
    // attributes must be private (encapsulation)
    protected String name;
    protected int life;
    protected int agility;
    protected int strength;
    protected int wit;

    private String RPGClass;

    // constructor
    public Character(String name, String RPPClass) {
        this.name = name;
        this.RPGClass = RPPClass;
        life = 50;
        agility = 2;
        strength = 2;
        wit = 2;
    }

    // getters and setters
    public String getName() {
        return name;
    }

    public int getLife() {
        return life;
    }

    public int getAgility() {
        return agility;
    }

    public int getStrength() {
        return strength;
    }

    public int getWit() {
        return wit;
    }
    
    // a function that cannot be inherited
    public final void unsheathe() {
    	System.out.println("[" + name + "] : unsheathes this weapon.");
    }

    // other methods
    public void attack(String arg) throws WeaponException {
        System.out.println("[" + name + "] : Rrrrrrrrr ....");
    }

	@Override
	public void MoveRight() {
		System.out.println("[" + name + "] : moves right");
		
	}

	@Override
	public void MoveLeft() {
		System.out.println("[" + name + "] : moves left");
		
	}

	@Override
	public void MoveForward() {
		System.out.println("[" + name + "] : moves forward");
		
	}

	@Override
	public void MoveBack() {
		System.out.println("[" + name + "] : moves back");
		
	}

	public void tryToAttack(String weapon) {
		try {
			attack(weapon);
		} catch (WeaponException e) {
			System.out.println(e.getMessage());
		}
	}

}
