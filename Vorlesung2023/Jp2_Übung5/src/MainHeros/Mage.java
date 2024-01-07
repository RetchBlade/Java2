package MainHeros;

import Fiend.Fiend;

public class Mage extends Hero {
    protected static final int DAMAGE = 2;
    public Mage(String name, int health) {
        super(name, health);
    }

    public void attack(Fiend f){f.setHealth(f.getHealth()-DAMAGE);}
}
