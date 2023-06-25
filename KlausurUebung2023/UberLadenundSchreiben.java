
public class UberLadenundSchreiben extends TestUebeschreiben {
	@Override
	public void schreibUeberschreiben() {
		// TODO Auto-generated method stub
		System.out.println("Test zum Überschreiben");
	}
	
	// Methode vordefnieren zum überladen
	public void schreibZumueberladen() {
		System.out.println("Test zum Überladen");
	}
	// Methode schreibZumueberladen überladen
	public void schreibZumueberladen(String test) {
		System.out.println("Test zum Überladen" + test);
	}
}

// Klasse zum vererben und übernehmen der Methoden
class TestUebeschreiben{
	public void schreibUeberschreiben() {
		// TODO Auto-generated method stub
		System.out.println("");
	}
}


