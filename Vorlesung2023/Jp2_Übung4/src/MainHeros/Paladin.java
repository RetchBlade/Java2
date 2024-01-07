package MainHeros;

import Fiend.Fiend;

public class Paladin extends Hero {
    protected static final int DAMAGE = 6;
    public Paladin(String name, int health) {
        super(name, health);
    }

    public void attack(Fiend f){f.setHealth(f.getHealth()-DAMAGE);}
}
