package Versuch8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		// LinkedList namens saraList erzeugt
		// var erkennt bei der erzeugung, dass es ein LinkedList ist.
		var saraList = new LinkedList<Title>();
		
		// Klassen bzw. Globalle Variablen ertsllen mit Werten null,0 oder ""
		int trackNrSave = 0;
		String cdNrSave = "", durance = null, interpret = "", name = "",title = "";
		
		// Try um auszuprobieren, wenn es nicht funktioniert, soll die Fehlermeldung mit catch gefangen werden
		try {
			// Die Datei mit BufferReader und FileReader auslesen, in dem man die Datei name angibt
			BufferedReader b = new BufferedReader(new FileReader("titleList.txt"));
			
			// Die gelesene Zeile in SaraLernt (kann anders heissen) speichern, davor wird sie mit dem wert null erstellt.
			String SaraLernt = null;
			while ((SaraLernt = b.readLine()) != null) {
				
				// Scanner liesst die gespeicherte Zeile durch und trennt die Informationen mit ";" 
				Scanner sc = new Scanner(SaraLernt).useDelimiter(";");
				
				// Wenn die Zeile Bravon beinhaltet, dann speicher die erste Zeile in Name
				if(SaraLernt.contains("Bravo")){
					name = SaraLernt;
				// Wenn nicht speicher die einzelnen Informationen nach Reihenfolge in die GLobalen ATtribute
				}else{
					cdNrSave = sc.next();
					trackNrSave = sc.nextInt();
					interpret = sc.next();
					title = sc.next();
					durance = sc.next();
					
					// Sobald alle Werte durch sind sollte, wenn durance einen wert hat (kein null) das Objekt erstllen
					// und im erstellten Objekt die Daten mit objectErstllen.set gespeichert werden.
					// Weil im Konstrukor nur 2 Parameter übergeben werden.
					if(durance != null){
						Title objectErstellen = new Title(cdNrSave,trackNrSave);
						objectErstellen.setName(name);
						objectErstellen.setCdNr(cdNrSave);
						objectErstellen.setTrackNr(trackNrSave);
						objectErstellen.setInterpret(interpret);
						objectErstellen.setTitle(title);
						objectErstellen.setDurance(durance);
						saraList.add(objectErstellen);
					}
				}
			}
			// Schliesst das lesen
			b.close();
		// Fehlermeldung falls was passiert (ist standard, weil man nichts zusätzlich machen muss)
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// AUfgabe will zufaellig einen Song haben, somit muessen wir einen Zufalls generator basteln.
		// in dem wir ein Object namens rand von der Klasse Random erstllen.
		Random rand = new Random();
		// wir speichern in zufall die zufalls Zahl ab, die aus der Groesse von unsere Liste ist.
		var  zufall = rand.nextInt(saraList.size());
		// zuletzt noch die was aus der Liste rausholen und in ausgewaehlterSong speichern.
		// Der Parameter ist einfach eine Zufalls Zahl
		Title ausgewaehlterSong = saraList.get(zufall);
		
		
		// Zum Schluss einfach ausgewaehlterSong die Daten raus zuholen mit ausgewaehlterSong.get
		System.out.println(ausgewaehlterSong.getName());
		System.out.println(ausgewaehlterSong.getCdNr() +" siudgs " + ausgewaehlterSong.getTrackNr());
		System.out.println(ausgewaehlterSong.getTrackNr());
		System.out.println(ausgewaehlterSong.getInterpret());
		System.out.println(ausgewaehlterSong.getTitle());
		System.out.println(ausgewaehlterSong.getDurance());
	}
}
