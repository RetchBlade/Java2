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

public class KannIchEsWIrklichAmpel extends Application {
	Circle[] lights = new Circle[3];
	int counter = 0;
	@Override
	public void start(Stage mainStages) throws Exception {
		// TODO Auto-generated method stub
		for(int i = 0; i<lights.length;i++){
			lights[i] = new Circle(20,Color.GRAY);
		}
		
		Button btnNext = new Button("_Next");
		btnNext.setOnAction(ae -> ampelswitch());
		
		
		VBox lightBox = new VBox(lights);
		lightBox.setAlignment(Pos.CENTER);
	
		
		HBox btnBox = new HBox(btnNext);
		btnBox.setAlignment(Pos.CENTER);
		
		BorderPane bp = new BorderPane();
		bp.setCenter(lightBox);
		bp.setBottom(btnBox);
		
		Scene scene = new Scene(bp,200,200);
		mainStages.setTitle("Ampel");
		mainStages.setScene(scene);
		mainStages.show();
	}
	
	public void ampelswitch() {
		if(counter == 0){
			lights[0].setFill(Color.RED);
			lights[1].setFill(Color.GREY);
			counter++;
		} else if (counter == 1){
			lights[0].setFill(Color.RED);
			lights[1].setFill(Color.YELLOW);
			counter++;
		} else if(counter == 2){
			lights[0].setFill(Color.GREY);
			lights[1].setFill(Color.GREY);
			lights[2].setFill(Color.GREEN);
			counter++;
		} else if(counter == 3){
			lights[1].setFill(Color.YELLOW);
			lights[2].setFill(Color.GREY);
			counter = 0;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch();
	}

}
