package Jp2;

public class Hero {
	
	protected int health;
	protected String name;
	
	public Hero(String name, int health) {
		this.health = health;
		this.name = name;
	}

	public int getHealth() {
		return health;
	}
	
	
	public String getName() {
		return name;
	}
}


