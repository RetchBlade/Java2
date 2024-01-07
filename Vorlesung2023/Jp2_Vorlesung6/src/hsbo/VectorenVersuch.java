package hsbo;

import java.util.Vector;

public class VectorenVersuch {
	public static void main(String[] args) {
		// Vektore mit der Kapazität von 20, wenn es voll wird soll es immer um 10 erweitert werden
		//Vector<Integer> v = new Vector<Integer>(20,10);
		
		
		
		// Vekor erstellung
		Vector<Integer> v = new Vector<Integer>();
		
		// Hinzufuegen von Werten in den Vektore, wird immer an ende des vektors hinzugefuegt
		v.add(1);
		v.add(Integer.parseInt("11"));
		
		// Fuegt die 22 an indexstelle 1 alo als zweites ein
		v.add(1, 22);
		
		// Ausgabe eines ganzen Vektors zusätzlich die funktionen um was zu bekommen
		System.out.println(v + "\nSize: " + v.size() + "\nCapacity: " + v.capacity()+ "\n");
		
		// Entfernt an index ein also das zweite wert im vektor
		v.remove(1);
		
		// Passt die Zahl im gewaehlten index um
		v.set(0, 200);
		
		//mit get() bekommt man den Wert des ausgewählten index zurück
		System.out.println("Get: " + v.get(0) +"\n");
		
		// Schleifen durchlauf des Vektors
		int i = 0;
		for(Integer e : v) {
			System.out.print("In verktore steht im index "+ i + " steht: " +e+"\n");
			i += 1;
		}
		
		
		
		// Noch ein Beispiel vorher remove man die liste, wegen dem Beispiel darueber
		v.remove(0);
		v.remove(0);
		
		// Test ob vektor leer ist und seinen default wert hat
		System.out.println("Kapazität sollte 10 sein: "+v.capacity() +" Size muss gleich 0 sein: " + v.size() +"\n");
		
		// Das Beispiel erklaert, dass wenn die Kapazität voll wird, um 10 automatisch erweitert wird.
		for (int j = 0; j < 20; j++) {
			v.add(42 + j);
			System.out.println("i=" + j + " Capacity: " + v.capacity());
			}
	}
}
