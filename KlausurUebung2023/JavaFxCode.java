import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class JavaFxCode extends Application {
	
	@Override
	public void start(Stage mainStage) throws Exception {
		// TODO Auto-generated method stub
		mainStage.setTitle("JavaFX-Exam");
		
		Text text = new Text("Druecke einen Button");
		VBox textContainer = new VBox(text);
		textContainer.setAlignment(Pos.CENTER);
		
		Button btnA = new Button("A");
		btnA.setOnAction(ae -> text.setText("A"));
		
		Button btnB = new Button("B");
		btnB.setOnAction(ae -> text.setText("B"));
		
		Button btnC = new Button("C");
		btnC.setOnAction(ae -> text.setText("C"));
		
		HBox btnContainer = new HBox(btnA,btnB,btnC);
		btnContainer.setSpacing(20);
		btnContainer.setAlignment(Pos.CENTER);
		
		BorderPane bp = new BorderPane();
		bp.setCenter(textContainer);
		bp.setBottom(btnContainer);
		Scene sc = new Scene(bp, 100,100);
		
		mainStage.setScene(sc);
		mainStage.show();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch();
	}

}
