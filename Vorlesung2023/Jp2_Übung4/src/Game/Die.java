package Game;

import java.util.Random;

public class Die {
    protected int sides;

    public Die(int sides) {
        this.sides = sides;
    }

    public int throwDie()
    {
        Random r = new Random();
        return r.nextInt(sides)+1;
    }
}
