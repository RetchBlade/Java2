package hsbo;

/**
 * 
 * @author kingd
 * Aufgabe 1a:
	2
	Programmieren Sie eine Klasse Knoten. In den Instanzen dieser Klasse soll neben dem
	zur Verkettung erforderlichen Zeiger auf Knoten jeweils die Knotendaten (Object!)
	gespeichert werden.
 */
public class Knoten {

	private Object object; 						// Das zu verwaltende Objekt
	private Knoten next; 						// Referenz auf den n�chsten Knoten
	
	public Knoten(Object object, Knoten next) {
		this.object = object;
		this.next = next;
	}
	
	public void setNext(Knoten next){			// Methode zum setzen der Referenz auf das 
		this.next=next;							// n�chste Objekt der Liste
	}
	
	public Object getObject() { 				// Gibt das gespeicherte Objekt aus
		return object;
	}
	
	public Knoten getNext() { 					// Gibt den n�chsten Knoten aus
		return next;
	}	
}
