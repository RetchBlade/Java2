package Fiend;

import MainHeros.Hero;

public abstract class Fiend {
    protected int health;

    public Fiend(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if(health < 0)
        {
            this.health = 0;
            return;
        }
        this.health = health;
    }

    public abstract void attack(Hero h);
}
