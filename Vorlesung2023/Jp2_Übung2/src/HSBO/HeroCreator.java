package HSBO;
public class HeroCreator {
	
    public static Hero[] createHeros(){
    	
    	Hero[] heros = new Hero[3];
        
	    heros[0]=new Knight("Knight", generateHealth());
	    heros[1]=new Paladin("Paladin", 21);
	    heros[2]=new Mage("Mage", 23);
	    
        return heros;
    }
   
   // Für gute Programmierer
   public static int generateHealth() {
	   //Implementierung Zufallszahl 3-25 
	   return (int) (Math.random()*7+19);
   }
}
