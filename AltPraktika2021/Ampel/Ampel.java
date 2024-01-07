package Versuch04;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Ampel extends Application {
	// Spielt keine Rolle ob private oder net, ich wollte nur cool sein
	// einen Arrax von drei lichtern, hätte man auch ander lösen können
	// in dem man 3 Objekte mit anderem namen nimmt
	private Circle[] lights = new Circle[
	                                     3];
	// Phasencounter mit dem wert 0 setzen, die dann in der Methode spaeter benutzt wird
	private int phaseCounter = 0;
	// Zwei Buttons, weil es verlangt wird
	private Button btnExit, btnSwitch;
	
		public static void main(String[] args) {
			// JavaFx sagt launch für führe das programm aus
			// Denke ich mal zumindest
			launch();
		}
		
		@Override
		public void start(Stage mainStage) throws Exception {
			// durch jeden durchlauf ein neues Objekt erzeugen, unten ist ein Beispiel
			for (int i = 0; i < lights.length; i++) {
				lights[i] = new Circle(20, Color.LIGHTGRAY);
			}
			/**
			 * Geht auch so, zum verstaendniss
			lights[0] =  new Circle(20, Color.LIGHTGRAY);
        	lights[1] =  new Circle(20, Color.LIGHTGRAY);
        	lights[2] =  new Circle(20, Color.LIGHTGRAY);
			 */
			
			//Button Geschichte
				// BtnSwitch fuer die Phasen aenderung
			btnSwitch = new Button("Switch");
				// Beim druecken soll das event die geschriebene Methode switchLights() nutzen
			btnSwitch.setOnAction(ae -> switchLights());
				// btnExit um die Anwendung zu beenden
	        btnExit = new Button("Exit");
	        	// Beim druecken soll das event die Close Methode der Klasse Stage zugreifen und benutzen
	        btnExit.setOnAction(ae -> mainStage.close());
	        	// in der btnBox werden die Buttons als Elemente Horzizonatal hinzugefuegt
	        HBox btnBox = new HBox(btnSwitch,btnExit);
	        	// Die ABstaende der Elemente also Buttons um 5 setzen
	        btnBox.setSpacing(5);
	        	// Posiotionierung der Elemente in die Mitte
	        btnBox.setAlignment(Pos.CENTER);
	        
	        // Lichter Geschichte
	        	// Keine Ahnung wie man es in Pane macht, deswegen die VBox
	        	// Sorgt dafuer, dass die Elemente untereinander also Vertikal eingefügt werden
	        	// Dadurch das es lights ein Array mit 3 Elemente beinhaltet fügt es alle Elemente hinzu
	        VBox circleBox = new VBox(lights);
	        	// Posiotionierung der Elemente in die Mitte
	        circleBox.setAlignment(Pos.CENTER);
	       
	        // BorderPane Geschichte
	        	//BorderPane bp erstellen
	        BorderPane bp = new BorderPane();
	        	// die Bocen circleBox und btnBox hinzufügen und direkt da legen, wo man Sie will
	        bp.setCenter(circleBox);
	        bp.setBottom(btnBox);
	        
	        // Stage Geschichte
	        	// DIe Stage also Mainstage die deklariert wird einen Title geben (Wird in der Anwendungleiste dann angeziegt)
			mainStage.setTitle("AmpelAnwendung");
				// Scene erstellen also ein Fenster mit groesse und unserem bp wo alles drinne ist
			Scene scene = new Scene(bp, 200, 200);
				// die erstellte scene quasi auf unsere mainStage legen
			mainStage.setScene(scene);
				// Zeig mir das ergebniss an
			mainStage.show();
		}
		
		// Methode fuer die Licht Phasen
		public void switchLights() {
			/** 
			 * Schöner, aber keine Ahnung, ob ich das im Praktikum schaffe
			 * switch (phaseCounter) {
            case 0:
            	lights[0].setFill(Color.RED);
            	lights[1].setFill(Color.LIGHTGRAY);
            	lights[2].setFill(Color.LIGHTGRAY);
            	phaseCounter++;
                break;
            case 1:
            	lights[0].setFill(Color.RED);
            	lights[1].setFill(Color.YELLOW);
            	lights[2].setFill(Color.LIGHTGRAY);
                phaseCounter++;
                break;
            case 2:
            	lights[0].setFill(Color.LIGHTGRAY);
            	lights[1].setFill(Color.LIGHTGRAY);
            	lights[2].setFill(Color.GREEN);
                phaseCounter++;
                break;
            case 3:
            	lights[0].setFill(Color.LIGHTGRAY);
            	lights[1].setFill(Color.YELLOW);
                lights[2].setFill(Color.LIGHTGRAY);
                phaseCounter = 0;
                break;
			}
			 */
			
			// If else for the win, da kann man es nie falsch machen hahah
				// Je nach Phasencounter sollen die Lights also die kreise sich immer aendern
				// wenn die Methode benutzt wird.
			if(phaseCounter == 0){
				lights[0].setFill(Color.RED);
            	lights[1].setFill(Color.LIGHTGRAY);
            	lights[2].setFill(Color.LIGHTGRAY);
            	phaseCounter++;
			}else if(phaseCounter == 1){
				lights[0].setFill(Color.RED);
            	lights[1].setFill(Color.YELLOW);
            	lights[2].setFill(Color.LIGHTGRAY);
                phaseCounter++;
			}else if(phaseCounter == 2){
				lights[0].setFill(Color.LIGHTGRAY);
            	lights[1].setFill(Color.LIGHTGRAY);
            	lights[2].setFill(Color.GREEN);
                phaseCounter++;
			}else if(phaseCounter == 3){
				// Wenn die letzte Phase Erreicht wird soll nur Gelb angezeigt werden
				// Wenn man logisch nach denkt, sieht man das die erste Phase zurueck auf Rot geht, also
				// muss man den phaseCounter einfach auf null setzen, dann faengt es von neu an.
				lights[0].setFill(Color.LIGHTGRAY);
            	lights[1].setFill(Color.YELLOW);
                lights[2].setFill(Color.LIGHTGRAY);
                phaseCounter = 0;
			}
		}
}

