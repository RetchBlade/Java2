package Game;

import MainHeros.*;

public class HeroCreator {
    public static Hero[] createHeros()
    {
    	Hero[] heros = new Hero[3];
        
	    heros[0]=new Knight("Knight", 20);
	    heros[1]=new Paladin("Paladin", 21);
	    heros[2]=new Mage("Mage", 23);
	    
        return heros;
    }
}
