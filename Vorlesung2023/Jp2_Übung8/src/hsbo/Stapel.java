package hsbo;
/**
 * @author kingd
 * Aufgabe 1b:
	Programmieren Sie eine Klasse Stapel. Diese Klasse soll zwei Methoden („push“ und
	„pop“) enthalten um Knoten zu einem Stapel zuzufügen und zu entfernen. Weiter soll
	die Klasse die Methoden „object“ enthalten, diese liefert das aktuelle Objekt des Stapels
	ohne den Knoten zu entfernen, sowie eine Hilfsmethode „empty“ welche überprüft ob
	sich noch Knoten im Stapel befinden.
 */

public class Stapel {
	
		private Knoten start = null;
		
		public void push(Object object) { 				// Speichert ein neues Objekt
			start = new Knoten(object, start);
		}
		
		public Object element() { 						// Gibt das oberste Objekt wieder
			
			if(!empty())
				return start.getObject();
			else
				return null;
		}
		
		public boolean empty() { 						// Pr�ft, ob der Stapel leer ist
			return start == null;
		}
		
		public void pop() { 							// Entfernt das oberste Objekt aus dem Stapel
			
			if(!empty())
				start = start.getNext();
		}
	}

