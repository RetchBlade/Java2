package Versuch04;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class KannIchEsWIrklich extends Application {
	Text txtZahlText;
	int zahl = 1;
	
	@Override
	public void start(Stage mainStage) throws Exception {
		// TODO Auto-generated method stub
		
		Rectangle rexWuerfel = new Rectangle(100,100, Color.WHITE);
		rexWuerfel.setStroke(Color.BLACK);
		rexWuerfel.setStrokeWidth(5);
		
		Button btnNext = new Button("_Try it");
		btnNext.setOnAction(ae -> nextZahl());
		
		HBox btnBox = new HBox(btnNext);
		btnBox.setAlignment(Pos.CENTER);
		
		txtZahlText = new Text("1");
		txtZahlText.setFont(Font.font(50));
		txtZahlText.setFill(Color.BLACK);
		
		StackPane stackPane = new StackPane();
		stackPane.getChildren().add(rexWuerfel);
		stackPane.getChildren().add(txtZahlText);
		
		BorderPane bp = new BorderPane();
		bp.setCenter(stackPane);
		bp.setBottom(btnBox);
		
		Scene scene = new Scene(bp,200,200);
		
		mainStage.setTitle("WuerfelA");
		mainStage.setScene(scene);
		mainStage.show();
	}
	
	public void nextZahl() {
		  txtZahlText.setText(""+zahl++);
		  if(zahl== 7)
			  zahl = 1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch();
	}

}
