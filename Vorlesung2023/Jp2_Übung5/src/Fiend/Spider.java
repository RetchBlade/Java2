package Fiend;

import MainHeros.Hero;

public class Spider extends Fiend {
    protected static final int DAMAGE = 2;

    public Spider(int health) {
        super(health);
    }

    public void attack(Hero h){h.setHealth(h.getHealth()-DAMAGE);}

	
}
