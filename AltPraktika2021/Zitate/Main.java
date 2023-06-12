package Versuch7;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Random;

public class Main {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		LinkedList<Zitat> list = new LinkedList<>();
		String 	name = "Sara";
		String	beschreibung = null;
		String	zitat = null;
		
		
			BufferedReader b;
			try {
				b = new BufferedReader(new FileReader("zitate.xml"));
				String  s = null;
				while ((s = b.readLine()) != null) {
					if(s.contains("<name>")){
					      name = xmlInhalt(s,"name");
					} 
					else if(s.contains("<beschreibung>")){
						beschreibung = xmlInhalt(s,"beschreibung");
					} 
					else if(s.contains("<zitat>")){
						zitat = xmlInhalt(s,"zitat");
					}  
					// name != null && beschreibung !=null && zitat != null 
					if(s.contains("</zitat>")){
						Zitat neuesZitat = new Zitat(name, beschreibung, zitat);
	                    list.add(neuesZitat);
	                    //zitat = null;
					}
				}
				b.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.err.print("Fehler: "+e.getMessage());
			}

		
		
		Random rand = new Random();
		System.out.println(list.size());
        int index = rand.nextInt(list.size());
        Zitat ausgewaehltesZitat = list.get(index);

        System.out.println('"'+ ausgewaehltesZitat.getZitat() + '"');
        System.out.println(ausgewaehltesZitat.getName() + ", " + ausgewaehltesZitat.getBeschreibung());
	}
	static String xmlInhalt(String zeile, String tagName){
		int a=zeile.indexOf("<"+tagName+">")+tagName.length()+2;
		int o=zeile.indexOf("</"+tagName+">");
		return zeile.substring(a,o);
	}
}



