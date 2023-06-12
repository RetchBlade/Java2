import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.util.Random;

public class GameOfLife extends Application {
    private static final int BREITE = 10; // Breite des Spielfelds
    private static final int HÖHE = 10; // Höhe des Spielfelds
    private static final int ZELLENGRÖßE = 40; // Größe einer Zelle in Pixeln
    private static final int ANZAHL_MARKIERUNGEN = 25; // Anzahl der Startmarkierungen
    private static final Random zufall = new Random(); // Zufallsgenerator für Startkonfiguration
    private boolean[][] spielfeld = new boolean[HÖHE][BREITE]; // Spielfeld als 2D-Array von booleans
    private Pane spielfeldPane = new Pane(); // Pane zur Darstellung des Spielfelds
    private Button startButton = new Button("Start"); // Button zum Starten des Spiels
    private Button stopButton = new Button("Stop"); // Button zum Stoppen des Spiels
    private Thread spielThread; // Thread für die Aktualisierung des Spiels

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Spiel des Lebens");

        GridPane root = new GridPane();
        root.setAlignment(Pos.CENTER);
        root.setHgap(10);

        spielfeldPane.setPrefSize(BREITE * ZELLENGRÖßE, HÖHE * ZELLENGRÖßE);

        root.add(spielfeldPane, 0, 0, 2, 1);
        root.add(startButton, 0, 1);
        root.add(stopButton, 1, 1);

        initialisiereSpielfeld(); // Startkonfiguration generieren

        startButton.setOnAction(event -> starteSpiel()); // Event Handler für Start-Button
        stopButton.setOnAction(event -> stoppeSpiel()); // Event Handler für Stop-Button

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void initialisiereSpielfeld() {
        for (int i = 0; i < ANZAHL_MARKIERUNGEN; i++) {
            int x = zufall.nextInt(BREITE);
            int y = zufall.nextInt(HÖHE);
            spielfeld[y][x] = true; // Zufällige Markierungen auf dem Spielfeld setzen
        }

        zeichneSpielfeld(); // Spielfeld zeichnen
    }

    private void zeichneSpielfeld() {
        spielfeldPane.getChildren().clear();

        for (int y = 0; y < HÖHE; y++) {
            for (int x = 0; x < BREITE; x++) {
                Rectangle zelle = new Rectangle(x * ZELLENGRÖßE, y * ZELLENGRÖßE, ZELLENGRÖßE, ZELLENGRÖßE);
                if (spielfeld[y][x]) {
                    zelle.setFill(Color.BLACK); // Schwarze Zelle für markierte Felder
                } else {
                    zelle.setFill(Color.WHITE); // weiße Zelle für leere Felder
                }
                zelle.setStroke(Color.BLACK);
                spielfeldPane.getChildren().add(zelle);
            }
        }
    }

    private void starteSpiel() {
        // Überprüfen, ob der spielThread noch nicht existiert
        if (spielThread == null) {
            // Erstellen und Starten des Threads
            spielThread = new Thread(() -> {
                while (!Thread.currentThread().isInterrupted()) {
                    try {
                        aktualisiereSpielfeld(); // Das Spielfeld aktualisieren
                        Platform.runLater(() -> {
                            zeichneSpielfeld(); // Das Spielfeld im JavaFX-Thread zeichnen
                        });
                        // Platform.runLater(this::zeichneSpielfeld);
                        Thread.sleep(500); // Intervall in Millisekunden warten
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt(); // Thread-Unterbrechung behandeln
                    }
                }
            });
            spielThread.start(); // Starten des Threads
        }
    }

    private void stoppeSpiel() {
        if (spielThread != null) {
            spielThread.interrupt(); // Den Thread unterbrechen
            spielThread = null; // Die Referenz auf den Thread auf null setzen
        }
    }


    private void aktualisiereSpielfeld() {
        boolean[][] neuesSpielfeld = new boolean[HÖHE][BREITE];
        for (int y = 0; y < HÖHE; y++) {
            for (int x = 0; x < BREITE; x++) {
                int nachbarn = erhalteAnzahlNachbarn(x, y); // Anzahl der Nachbarn ermitteln
                if (spielfeld[y][x]) {
                    neuesSpielfeld[y][x] = nachbarn == 2 || nachbarn == 3; // Markierte Zelle überlebt, wenn sie 2 oder 3 Nachbarn hat
                } else {
                    neuesSpielfeld[y][x] = nachbarn == 3; // Leere Zelle wird zur markierten Zelle, wenn sie genau 3 Nachbarn hat
                }
            }
        }
        spielfeld = neuesSpielfeld; // Neues Spielfeld übernehmen
    }

    private int erhalteAnzahlNachbarn(int x, int y) {
        int anzahl = 0;
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                if (i == 0 && j == 0) {
                    continue;
                }
                int nx = x + j;
                int ny = y + i;
                if (nx >= 0 && nx < BREITE && ny >= 0 && ny < HÖHE && spielfeld[ny][nx]) {
                    anzahl++; // Anzahl der markierten Nachbarzellen zählen
                }
            }
        }
        return anzahl;
    }
}
