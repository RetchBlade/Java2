package MainHeros;

import Fiend.Fiend;

public abstract class Hero{

    protected int health;
    protected String name;

    public Hero(String name, int health){
        this.name = name;
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public String getName() {
        return name;
    }

    public void setHealth(int health) {
        if(health < 0)
        {
            this.health = 0;
            return;
        }
        this.health = health;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void attack(Fiend f);
}