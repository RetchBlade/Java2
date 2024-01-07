package MainHeros;

import Fiend.Fiend;

public class Knight extends Hero {
    protected static final int DAMAGE = 10;
    public Knight(String name, int health) {
        super(name, health);
    }

    public void attack(Fiend f){
    	f.setHealth(f.getHealth()-DAMAGE);}
}
