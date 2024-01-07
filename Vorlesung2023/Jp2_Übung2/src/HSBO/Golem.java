package HSBO;

public class Golem extends Fiend {
	public Golem(int health) {
		super(health);
	}

	public void attack(Hero h) {
		h.setHealth(h.getHealth() - 15);
	}
}
