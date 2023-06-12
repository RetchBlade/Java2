import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class QuadratAnwendung extends Application {
	Button btnSwitch;
	Rectangle[] quadrats = new Rectangle[3];
	BorderPane gp;
	int counter = 0;
	
	@Override
	public void start(Stage mainStage) throws Exception {
		// TODO Auto-generated method stub
		Button btnExit = new Button("_Exit");
		btnExit.setOnAction(ae -> mainStage.close());
		
		btnSwitch = new Button("Kleine_r");
		btnSwitch.setOnAction(ae -> switchQuadrat());
		
		HBox btnBox = new HBox(btnSwitch,btnExit);
		btnBox.setAlignment(Pos.CENTER);
		btnBox.setSpacing(25);
		
		quadrats[0] = new Rectangle(100,100, Color.BLUE);
		quadrats[1] = new Rectangle(140,140, Color.BLUE);
		quadrats[2] = new Rectangle(180,180, Color.BLUE);
		
		gp = new BorderPane();
		gp.setBottom(btnBox);
		gp.setCenter(quadrats[2]);
		
		Scene sc = new Scene(gp,280,300);
		mainStage.setTitle("WureflAnwendung");
		mainStage.setScene(sc);
		mainStage.show();
	}
	
	public void switchQuadrat() {
		if(counter == 0){
			gp.setCenter(quadrats[1]);
			btnSwitch.setText("Kleine_r");
			counter++;
		} else if(counter == 1) {
			gp.setCenter(quadrats[0]);
			btnSwitch.setText("Groesse_r");
			counter++;
		} else if(counter == 2) {
			gp.setCenter(quadrats[1]);
			btnSwitch.setText("Groesse_r");
			counter++;
		} else if(counter == 3){
			gp.setCenter(quadrats[2]);
			btnSwitch.setText("Kleine_r");
			counter = 0;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch();
	}
}
