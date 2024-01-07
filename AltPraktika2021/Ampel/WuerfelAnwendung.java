package Versuch04;

import java.util.Random;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class WuerfelAnwendung extends Application {
	private Text txtZahl;
	private int counter = 0;
	private int zahl = 1;
	private Label lblCounter;
	@Override
	public void start(Stage mainStage) throws Exception {
		// TODO Auto-generated method stub
		
		Button btnSwitch = new Button("_Naechstes");
		btnSwitch.setOnAction(ae -> zahlenSwitch());;
		
		Button btnRandomSwitch = new Button("_Zufall");
		btnRandomSwitch.setOnAction(ae -> randomZahlSwitch());;
		
		
		Button btnExit = new Button("_Exit");
		btnExit.setOnAction(ae -> mainStage.close());
		
		HBox btnBox = new HBox(btnSwitch, btnRandomSwitch);
		
		txtZahl = new Text("1");
		txtZahl.setFont(Font.font(80));
		txtZahl.setFill(Color.BLACK);
		lblCounter = new Label("Counter: "+zahl);
		
		HBox zusatzBox = new HBox(btnExit,lblCounter);
		
		StackPane txtPane = new StackPane();
		Rectangle recKasten = new Rectangle(100,100, Color.WHITE);
		recKasten.setStroke(Color.BLACK);
		recKasten.setStrokeWidth(10);
		
		txtPane.getChildren().add(recKasten);
		txtPane.getChildren().add(txtZahl);
		
		BorderPane bp = new BorderPane();
		
		txtPane.setAlignment(Pos.CENTER);
		btnBox.setAlignment(Pos.CENTER);
		zusatzBox.setAlignment(Pos.CENTER);
		
		btnBox.setSpacing(10);
		zusatzBox.setSpacing(10);
		
		txtPane.setStyle("-fx-background-color: GREY");
		txtPane.setMaxSize(250,200);
		
		bp.setCenter(txtPane);
		bp.setBottom(btnBox);
		bp.setTop(zusatzBox);
		
		Scene sc = new Scene(bp,300,250);
		
		mainStage.setTitle("WuerfelAnwendung");
		mainStage.setScene(sc);
		mainStage.show();
	}
	
	public void zahlenSwitch() {
		zahl = counter+1;
		txtZahl.setText(""+zahl);
		lblCounter.setText("Counter: "+zahl);
		counter++;
		if(counter == 6)
			counter=0;
		}
	
	public void randomZahlSwitch() {
		Random rand = new Random();
		int zahl = rand.nextInt(6)+1;
		txtZahl.setText(""+zahl);
		lblCounter.setText("Counter: "+zahl);
		counter = zahl-1;
	}	 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch();
	}

}
