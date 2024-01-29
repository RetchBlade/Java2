import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Anwendung extends Application {
	// Global Variablen 
	VBox vbox = new VBox();
	Button btnButton;
	
	// Automatische implementierung von Aplication
	
	@Override
	public void start(Stage stage) throws Exception {
		// Secene ist wichtig fuer den Fenster.
		Scene scene = new Scene(vbox,1000,500);
		// Position setzen
		vbox.setAlignment(Pos.CENTER);
		// Aufruf unsere Methode 
		addButton(10);
		stage.setTitle("Uebung");
		// Scene setzen
		stage.setScene(scene);
		// anzeigen lassen
		stage.show();
	}
	
	// eingabe parameter n
	void addButton(int n) {
		// lauft nach n
		for(int i = 1; i < n+1; i++){
			// Button iterativ erzugen, in den Klammern steht nur der inhalt des buttons
			btnButton = new Button("Button " +i);
			// vbox will seine kinder haben, aber man muss die mit add hinzufuegen
			vbox.getChildren().add(btnButton);
			// Eventhandler mit Lambda
			btnButton.setOnAction(ae -> System.out.println("Hi"));
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// standard launch
		launch();
	}
}
