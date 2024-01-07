package Fiend;

import MainHeros.Hero;

public class Golem extends Fiend {
    protected static final int DAMAGE = 5;

    public Golem(int health) {
        super(health);
    }

    public void attack(Hero h){h.setHealth(h.getHealth()-DAMAGE);}
}
