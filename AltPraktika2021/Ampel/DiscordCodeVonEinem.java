package Versuch04;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

public class DiscordCodeVonEinem extends Application {
    AmpelLichte rot = new AmpelLichte(Color.RED);
    AmpelLichte gelb = new AmpelLichte(Color.YELLOW);
    AmpelLichte gruen = new AmpelLichte(Color.GREEN);
    public int status = 0;

    public class AmpelLichte extends Circle {
        private Color farbe;

        public AmpelLichte(Color farbe) {
            this.farbe = farbe;
            setFill(Color.GRAY);
            setStroke(Color.BLACK);
            setRadius(40);
        }

        public void setOn() {
            setFill(farbe);
        }

        public void setOff() {
            setFill(Color.GRAY);
        }
    }
@Override
    public void start(Stage primaryStage) {
        try {
            BorderPane root = new BorderPane();

            // Obere Bereich
            VBox oben = new VBox();
            oben.setAlignment(Pos.CENTER);
            // Gehaeuse
            StackPane gehaeuse = new StackPane();
            Rectangle r1 = new Rectangle(120, 320, Color.LIGHTGRAY);
            VBox lampen = new VBox();
            lampen.getChildren().addAll(rot, gelb, gruen);
            rot.setOn(); /// erste Phase: Rot
            lampen.setAlignment(Pos.CENTER);
            lampen.setSpacing(20);
            gehaeuse.getChildren().addAll(r1, lampen);
            // Stange
            Rectangle r2 = new Rectangle(30, 320, Color.LIGHTGRAY);

            oben.getChildren().addAll(gehaeuse, r2);
            root.setCenter(oben);

            // Funktionale Bereich
            HBox unten = new HBox(50);
            unten.setAlignment(Pos.CENTER);
            // Weiter Button
            Button weiter = new Button("_Weiter");
            weiter.setOnAction(ae -> weiter());
            // Exit Button
            Button exit = new Button("Exit");
            exit.setOnAction(ae -> primaryStage.close());
            unten.getChildren().addAll(weiter, exit);
            root.setBottom(unten);

            Scene scene = new Scene(root, 1000, 1000);
            
            primaryStage.setTitle("Ampel Simulator");
            primaryStage.setScene(scene);
            primaryStage.show();

        }
catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void weiter() {
        switch (status) {
        case 0:
            rot.setOn();
            gelb.setOff();
            gruen.setOff();
            status++;
            break;
        case 1 :
            rot.setOn();
            gelb.setOn();
            gruen.setOff();
            status++;
            break;
        case 2:
            rot.setOff();
            gelb.setOff();
            gruen.setOn();
            status++;
            break;
        case 3:
            rot.setOff();
            gelb.setOn();
            gruen.setOff();
            status = 0;
            break;
}
    }

    public static void main(String[] args) {
        launch(args);
    }
}