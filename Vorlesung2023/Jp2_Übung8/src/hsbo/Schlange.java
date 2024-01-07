package hsbo;


public class Schlange {

	private Knoten schwanz = null;
	private Knoten kopf = null;
	
	public void enqueue(Object object) { 				// F�gt ein neues Objekt am Schwanz der Schlange an
		
		if (kopf!=null)
			schwanz.setNext(schwanz = new Knoten(object, null));
		else
			schwanz = kopf = new Knoten(object, null);
	}
	
	public Object element() { 							// Gibt das Objekt vom Kopf der Schlange zur�ck
		
		if(!empty())
			return kopf.getObject();
		else
			return null;
	}
	
	public boolean empty() { 							// Pr�ft, ob die Schlange leer ist
		return kopf == null;
	}
	
	public void dequeue() { 							// Entfernt das Objekt vom Kopf der Schlange
		
		if(!empty())
			kopf = kopf.getNext();
	}
}
