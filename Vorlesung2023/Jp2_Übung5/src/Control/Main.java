package Control;
import Fiend.*;
import Game.Arena;
import Game.Game;
import Game.HeroCreator;
import Game.SpawnEngine;
import MainHeros.*;

public class Main{

    public static void main(String[] args){
        SpawnEngine spawnEngine = new SpawnEngine();
        Hero[] heros = HeroCreator.createHeros();
        Fiend[] enemies = new Fiend[3];
        enemies[0] = spawnEngine.spawn();
        enemies[1] = spawnEngine.spawn();
        enemies[2] = spawnEngine.spawn();
        Arena arena = new Arena(heros,enemies);
        Game game = new Game(arena);
        game.iterate();		//Runde 1
        //game.iterate();	//Runde 2
        
        for(Hero e : arena.getHeros())
        {
            System.out.println(e.getName()+": "+e.getHealth()+ " " + e.getClass());
        }

        for(Fiend f : arena.getFiends())
        {
            System.out.println(""+f.getHealth()+ " " + f.getClass());
        }
    }

}