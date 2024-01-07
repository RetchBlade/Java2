package Jp2;

public class Main {

	public static void main(String[] args){
		// TODO Auto-generated method stub
			Hero heros[] = new Hero[2];
			heros[0] = new Hero("Duha",100);
			heros[1] = new Hero("Peter",150);
			Arena arena = new Arena(heros);
			
			for(int i = 0; i < heros.length; i++){
		        	System.out.println(arena.getHeros()[i].getName()+": "+arena.getHeros()[i].getHealth());
		}
	}
}
