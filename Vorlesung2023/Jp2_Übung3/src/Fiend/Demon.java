package Fiend;

import MainHeros.Hero;

public class Demon extends Fiend {
    protected static final int DAMAGE = 10;

    public Demon(int health) {
        super(health);
    }

    public void attack(Hero h){h.setHealth(h.getHealth()-DAMAGE);}
}
