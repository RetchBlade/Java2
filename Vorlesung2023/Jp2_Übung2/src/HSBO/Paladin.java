package HSBO;

public class Paladin extends Hero {
	public Paladin(String name, int health) {
		super(name, health);
	}

	public void attack(Fiend f) {
		f.setHealth(f.getHealth() - 15);
	}
}
