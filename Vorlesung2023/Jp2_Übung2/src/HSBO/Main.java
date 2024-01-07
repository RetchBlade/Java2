package HSBO;

public class Main{

    public static void main(String[] args)
    {
    	Hero[] heros = HeroCreator.createHeros();

        Arena arena = new Arena(heros);

        for(Hero e : arena.getHeros())
        {
            System.out.println(e.getName()+": "+e.getHealth()+ " " + e.getClass());
        }
    }

}